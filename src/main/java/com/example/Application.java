package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Part;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.multipart.CompletedFileUpload;
import io.micronaut.http.server.exceptions.InternalServerException;
import io.micronaut.runtime.Micronaut;
import jakarta.annotation.Nullable;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.time.Duration;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.String.format;

public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}

@Controller
class UploadController {

    private final Logger logger = Logger.getLogger(UploadController.class.getName());

    @Post(value = "/upload", consumes = {"multipart/form-data"})
    public Mono<String> upload(@Part("allDocuments") Publisher<CompletedFileUpload> allDocuments,
                               @Part("allPhotos") Publisher<CompletedFileUpload> allPhotos,
                               @Part("photo") CompletedFileUpload photo,
                               @Nullable @Part("age") String age,
                               @Nullable @Part("name") String name) {

        Flux.from(allDocuments)
                .subscribeOn(Schedulers.boundedElastic())
                .doOnNext(content -> logger.info("[allDocuments | doOnNext] Received file: " + content.getFilename()))
                .mapNotNull(completedFileUpload -> Map.of(completedFileUpload.getFilename(), Objects.requireNonNull(this.getInputStream(completedFileUpload))))
                .collectList()
                .doOnSuccess(list -> {
                    logger.log(Level.INFO, "[allDocuments | doOnSuccess] Received {0} files", list.size());
                    for (var map : list) {
                        map.forEach((key, value) -> {
                            try {
                                var readBytes = new PushbackInputStream(value);
                                var firstByte = readBytes.read();
                                if (firstByte <= 0) {
                                    logger.info(format("[allDocuments | doOnSuccess] %s received is empty", key));
                                }
                                logger.info(format("[allDocuments | doOnSuccess] %s received byte(s): %s", key, firstByte));
                                readBytes.unread(firstByte);
                            } catch (IOException e) {
                                throw new InternalServerException(e.getMessage());
                            }
                        });
                    }
                })
                .doFinally(signal -> logger.log(Level.INFO, "[allDocuments | doFinally] Finished processing request"))
                .block(Duration.ofSeconds(15));

        Flux.from(allPhotos)
                .subscribeOn(Schedulers.boundedElastic())
                .doOnNext(content -> logger.info("[allPhotos | doOnNext] Received file: " + content.getFilename()))
                .mapNotNull(completedFileUpload -> Map.of(completedFileUpload.getFilename(), Objects.requireNonNull(this.getInputStream(completedFileUpload))))
                .collectList()
                .doOnSuccess(list -> {
                    logger.log(Level.INFO, "[allPhotos | doOnSuccess] Received {0} files", list.size());
                    for (var map : list) {
                        map.forEach((key, value) -> {
                            try {
                                var readBytes = new PushbackInputStream(value);
                                var firstByte = readBytes.read();
                                if (firstByte <= 0) {
                                    logger.info(format("[allPhotos | doOnSuccess] %s received is empty", key));
                                }
                                logger.info(format("[allPhotos | doOnSuccess] %s received byte(s): %s", key, firstByte));
                                readBytes.unread(firstByte);
                            } catch (IOException e) {
                                throw new InternalServerException(e.getMessage());
                            }
                        });
                    }
                })
                .doFinally(signal -> logger.log(Level.INFO, "[allPhotos | doFinally] Finished processing request"))
                .block(Duration.ofSeconds(15));

        try {
            logger.log(Level.INFO,"[photo] Received with {0} bytes", photo.getInputStream().readAllBytes().length);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        logger.log(Level.INFO, "`name` param: {0}", name);
        logger.log(Level.INFO, "`age` param: {0}", age);

        return Mono.fromCallable(() -> "done");
    }

    private InputStream getInputStream(CompletedFileUpload file) {
        try {
            return file.getInputStream();
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error reading file", e);
            return null;
        }
    }
}
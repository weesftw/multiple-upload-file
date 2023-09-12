## multiple-upload-file

1. [request1.sh](request1.sh) output: 

```
 __  __ _                                  _   
|  \/  (_) ___ _ __ ___  _ __   __ _ _   _| |_ 
| |\/| | |/ __| '__/ _ \| '_ \ / _` | | | | __|
| |  | | | (__| | | (_) | | | | (_| | |_| | |_ 
|_|  |_|_|\___|_|  \___/|_| |_|\__,_|\__,_|\__|
12:56:58.564 [main] INFO  io.micronaut.runtime.Micronaut - Startup completed in 376ms. Server Running: http://localhost:8080
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: Sample.pdf
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: Sample.pdf
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: Sample.pdf
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: Sample.pdf
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: Sample.pdf
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: Sample.pdf
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: merge-files.zip
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: merge-files.zip
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: merge-files.zip
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: merge-files.zip
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: merge-files.zip
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: merge-files.zip
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$3
INFO: [allDocuments | doOnSuccess] Received 12 files
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] Sample.pdf received byte(s): 37
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] Sample.pdf received is empty
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] Sample.pdf received byte(s): -1
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] Sample.pdf received is empty
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] Sample.pdf received byte(s): -1
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] Sample.pdf received is empty
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] Sample.pdf received byte(s): -1
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] Sample.pdf received is empty
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] Sample.pdf received byte(s): -1
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] Sample.pdf received is empty
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] Sample.pdf received byte(s): -1
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] merge-files.zip received byte(s): 80
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] merge-files.zip received is empty
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] merge-files.zip received byte(s): -1
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] merge-files.zip received is empty
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] merge-files.zip received byte(s): -1
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] merge-files.zip received is empty
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] merge-files.zip received byte(s): -1
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] merge-files.zip received is empty
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] merge-files.zip received byte(s): -1
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] merge-files.zip received is empty
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$2
INFO: [allDocuments | doOnSuccess] merge-files.zip received byte(s): -1
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$4
INFO: [allDocuments | doFinally] Finished processing request
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$5
INFO: [allPhotos | doOnNext] Received file: github.png
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$5
INFO: [allPhotos | doOnNext] Received file: github.png
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$5
INFO: [allPhotos | doOnNext] Received file: github.png
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$5
INFO: [allPhotos | doOnNext] Received file: github.png
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$5
INFO: [allPhotos | doOnNext] Received file: github.png
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$5
INFO: [allPhotos | doOnNext] Received file: github.png
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$5
INFO: [allPhotos | doOnNext] Received file: github.png
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$5
INFO: [allPhotos | doOnNext] Received file: java-logo.png
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$5
INFO: [allPhotos | doOnNext] Received file: micronaut-logo.png
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$5
INFO: [allPhotos | doOnNext] Received file: micronaut-logo.png
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$8
INFO: [allPhotos | doOnSuccess] Received 10 files
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$7
INFO: [allPhotos | doOnSuccess] github.png received byte(s): 137
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$7
INFO: [allPhotos | doOnSuccess] github.png received is empty
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$7
INFO: [allPhotos | doOnSuccess] github.png received byte(s): -1
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$7
INFO: [allPhotos | doOnSuccess] github.png received is empty
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$7
INFO: [allPhotos | doOnSuccess] github.png received byte(s): -1
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$7
INFO: [allPhotos | doOnSuccess] github.png received is empty
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$7
INFO: [allPhotos | doOnSuccess] github.png received byte(s): -1
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$7
INFO: [allPhotos | doOnSuccess] github.png received is empty
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$7
INFO: [allPhotos | doOnSuccess] github.png received byte(s): -1
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$7
INFO: [allPhotos | doOnSuccess] github.png received is empty
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$7
INFO: [allPhotos | doOnSuccess] github.png received byte(s): -1
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$7
INFO: [allPhotos | doOnSuccess] github.png received is empty
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$7
INFO: [allPhotos | doOnSuccess] github.png received byte(s): -1
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$7
INFO: [allPhotos | doOnSuccess] java-logo.png received byte(s): 137
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$7
INFO: [allPhotos | doOnSuccess] micronaut-logo.png received byte(s): 137
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$7
INFO: [allPhotos | doOnSuccess] micronaut-logo.png received is empty
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$7
INFO: [allPhotos | doOnSuccess] micronaut-logo.png received byte(s): -1
set. 18, 2023 12:57:03 PM com.example.UploadController lambda$upload$9
INFO: [allPhotos | doFinally] Finished processing request
set. 18, 2023 12:57:03 PM com.example.UploadController upload
INFO: [photo] Received with 6.941 bytes
set. 18, 2023 12:57:03 PM com.example.UploadController upload
INFO: `name` param: null
set. 18, 2023 12:57:03 PM com.example.UploadController upload
INFO: `age` param: 23
```

2. [request2.sh](request2.sh) output:

```
 __  __ _                                  _   
|  \/  (_) ___ _ __ ___  _ __   __ _ _   _| |_ 
| |\/| | |/ __| '__/ _ \| '_ \ / _` | | | | __|
| |  | | | (__| | | (_) | | | | (_| | |_| | |_ 
|_|  |_|_|\___|_|  \___/|_| |_|\__,_|\__,_|\__|
12:58:25.269 [main] INFO  io.micronaut.runtime.Micronaut - Startup completed in 354ms. Server Running: http://localhost:8080
set. 18, 2023 12:58:27 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: Sample.pdf
set. 18, 2023 12:58:27 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: Sample.pdf
set. 18, 2023 12:58:27 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: Sample.pdf
set. 18, 2023 12:58:27 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: Sample.pdf
set. 18, 2023 12:58:27 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: Sample.pdf
set. 18, 2023 12:58:27 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: Sample.pdf
set. 18, 2023 12:58:27 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: merge-files.zip
set. 18, 2023 12:58:27 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: merge-files.zip
set. 18, 2023 12:58:27 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: merge-files.zip
set. 18, 2023 12:58:27 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: merge-files.zip
set. 18, 2023 12:58:27 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: merge-files.zip
set. 18, 2023 12:58:27 PM com.example.UploadController lambda$upload$0
INFO: [allDocuments | doOnNext] Received file: merge-files.zip
set. 18, 2023 12:58:42 PM com.example.UploadController lambda$upload$4
INFO: [allDocuments | doFinally] Finished processing request
12:58:42.596 [default-nioEventLoopGroup-1-2] ERROR i.m.http.server.RouteExecutor - Unexpected error occurred: Timeout on blocking read for 15000000000 NANOSECONDS
java.lang.IllegalStateException: Timeout on blocking read for 15000000000 NANOSECONDS
	at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:127)
	at reactor.core.publisher.Mono.block(Mono.java:1738)
	at com.example.UploadController.upload(Application.java:69)
	at com.example.$UploadController$Definition$Exec.dispatch(Unknown Source)
	at io.micronaut.context.AbstractExecutableMethodsDefinition$DispatchedExecutableMethod.invokeUnsafe(AbstractExecutableMethodsDefinition.java:447)
	at io.micronaut.context.DefaultBeanContext$BeanContextUnsafeExecutionHandle.invokeUnsafe(DefaultBeanContext.java:4187)
	at io.micronaut.web.router.AbstractRouteMatch.execute(AbstractRouteMatch.java:228)
	at io.micronaut.http.context.ServerRequestContext.with(ServerRequestContext.java:74)
	at io.micronaut.http.server.RouteExecutor.executeRouteAndConvertBody(RouteExecutor.java:480)
	at io.micronaut.http.server.RouteExecutor.callRoute(RouteExecutor.java:468)
	at io.micronaut.http.server.RequestLifecycle.lambda$normalFlow$2(RequestLifecycle.java:146)
	at io.micronaut.core.execution.ImperativeExecutionFlowImpl.flatMap(ImperativeExecutionFlowImpl.java:72)
	at io.micronaut.core.execution.DelayedExecutionFlowImpl$FlatMap.apply(DelayedExecutionFlowImpl.java:279)
	at io.micronaut.core.execution.DelayedExecutionFlowImpl.work(DelayedExecutionFlowImpl.java:51)
	at io.micronaut.core.execution.DelayedExecutionFlowImpl.complete0(DelayedExecutionFlowImpl.java:64)
```

### Info

- Micronaut 4.1.1
- Java 17
# failed to process files received after add 'name' param on request
curl --location 'http://localhost:8080/upload' \
--form 'allDocuments=@"assets/Sample.pdf"' \
--form 'allDocuments=@"assets/merge-files.zip"' \
--form 'allPhotos=@"assets/github.png"' \
--form 'allPhotos=@"assets/java-logo.png"' \
--form 'allPhotos=@"assets/micronaut-logo.png"' \
--form 'photo=@"assets/micronaut-logo.png"' \
--form 'age="23"' \
--form 'name="weesftw"'
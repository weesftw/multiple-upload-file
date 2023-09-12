# receive 2 allDocuments, 3 allPhotos and 1 photo with 'age' param on request
curl --location 'http://localhost:8080/upload' \
--form 'allDocuments=@"assets/Sample.pdf"' \
--form 'allDocuments=@"assets/merge-files.zip"' \
--form 'allPhotos=@"assets/github.png"' \
--form 'allPhotos=@"assets/java-logo.png"' \
--form 'allPhotos=@"assets/micronaut-logo.png"' \
--form 'photo=@"assets/micronaut-logo.png"' \
--form 'age="23"'
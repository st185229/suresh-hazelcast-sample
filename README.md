

mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Dserver.port=8080"

mvn spring-boot:run -Dspring-boot.run.jvmArguments="-Dserver.port=8083"

>curl --data "key=key3&value=hazelcast" "localhost:8080/put"

>curl "localhost:8082/get?key=key3"

>curl localhost:8080/books/12345

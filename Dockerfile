FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD target/spring-shopapp.jar spring-shopapp.jar
ENTRYPOINT ["java", "-jar", "/spring-shopapp.jar"]
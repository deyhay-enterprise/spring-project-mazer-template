FROM amazoncorretto:17-alpine
EXPOSE 8080
ADD target/mazer-admin-template-2.0.0.jar mazer-admin-template-2.0.0.jar
ENTRYPOINT ["java", "-jar", "mazer-admin-template-2.0.0.jar"]
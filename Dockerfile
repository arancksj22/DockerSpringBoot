FROM openjdk:21-jdk-slim

ADD target/dockerSpringbootPractice.jar dockerSpringbootPractice.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "dockerSpringbootPractice.jar"]
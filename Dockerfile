FROM openjdk:21-jdk-slim
ADD target/dockerSpringbootPractice.jar dockerSpringbootPractice.jar
ENTRYPOINT ["java", "-jar", "dockerSpringbootPractice.jar"]
FROM openjdk:8
ADD target/TestSpringBootApp-0.0.1-SNAPSHOT.jar TestSpringBootApp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "TestSpringBootApp-0.0.1-SNAPSHOT.jar"]
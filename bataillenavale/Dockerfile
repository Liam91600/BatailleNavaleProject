# Build env
FROM maven:3.8.5-openjdk-17 AS build-java-stage
WORKDIR /rest-server
COPY service service
COPY business business
COPY dal dal
COPY pom.xml .
RUN mvn clean package

# Run env
FROM openjdk:17.0.2-jdk-slim-buster
COPY --from=build-java-stage  /rest-server/service/target/classes /rest-server/classes
COPY --from=build-java-stage  /rest-server/service/target/dependency /rest-server/dependency
EXPOSE 8082
ENTRYPOINT ["java", "-cp", "/rest-server/classes:/rest-server/dependency/*", "com.kumuluz.ee.EeApplication"]

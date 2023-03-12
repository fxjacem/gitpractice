#FROM openjdk:18
#WORKDIR /opt/app
#COPY target/locations-0.0.1-SNAPSHOT.jar locations.jar
#CMD ["java", "-jar", "locations.jar"]

# openjdk:18 vagy eclipse-temurin:17

FROM openjdk:18 as builder
WORKDIR application
COPY target/locations-0.0.1-SNAPSHOT.jar locations.jar
RUN java -Djarmode=layertools -jar locations.jar extract

FROM openjdk:18
WORKDIR application
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]
FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*SNAPSHOT.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar"]

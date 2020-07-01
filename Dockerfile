FROM openjdk:8-jdk-alpine

RUN apk add --no-cache tzdata
ENV TZ=Africa/Johannesburg

ADD ./target/christiaan-0.0.1-SNAPSHOT.jar ./christiaan.jar


EXPOSE 9000
ENTRYPOINT ["java", "-jar", "/christiaan.jar"]

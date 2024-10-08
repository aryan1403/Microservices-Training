FROM amazoncorretto:17-alpine-jdk
COPY target/feingdemo-0.0.1-SNAPSHOT.jar feingdemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "/feingdemo-0.0.1-SNAPSHOT.jar" ]
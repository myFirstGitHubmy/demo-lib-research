FROM adoptopenjdk/openjdk11:alpine-jre
ADD /target/demo-lib-research-1.0-SNAPSHOT.jar demo.jar
ENTRYPOINT ["java","-jar","demo.jar.jar"]
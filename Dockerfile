FROM adoptopenjdk/openjdk11:alpine-jre
ADD /target/demo-lib-research-1.0-SNAPSHOT-spring-boot.jar demo.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","demo.jar"]
FROM openjdk:8
ADD target/docker-test.jar docker-test.jar
EXPOSE 8093
ENTRYPOINT ["java","-jar","docker-test.jar"]
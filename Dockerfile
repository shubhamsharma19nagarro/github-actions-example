FROM openjdk:8
EXPOSE 8080
ADD target/springboot-images-new-test2.jar springboot-images-new-test2.jar
ENTRYPOINT ["java","-jar","/springboot-images-new-test2.jar"]
FROM java:8
EXPOSE 5000
ADD /target/aws-service.jar aws-service.jar
ENTRYPOINT ["java", "-jar", "aws-service.jar"]
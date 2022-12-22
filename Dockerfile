FROM openjdk:11

EXPOSE 8090
ADD target/spring-boot-dockers-mysql.jar spring-boot-dockers-mysql.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-dockers-mysql.jar"]
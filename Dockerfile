FROM openjdk:17
EXPOSE 8080
ADD target/employeeimage-new.jar employeeimage-new.jar
ENTRYPOINT ["java","-jar","/employeeimage-new.jar"]
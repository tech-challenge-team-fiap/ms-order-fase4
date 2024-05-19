FROM maven:3.8.3-openjdk-17 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package
EXPOSE 8080
RUN chmod +x /home/app/target/tech-challenge-order-docker.jar
ENTRYPOINT ["java","-jar","/home/app/target/tech-challenge-order-docker.jar"]
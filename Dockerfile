#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src ./la-obra-la-prima/src
COPY pom.xml ./la-obra-la-prima
RUN mvn -f ./la-obra-la-prima/pom.xml clean package

#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/demo-0.0.1-SNAPSHOT.jar /usr/local/lib/demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]

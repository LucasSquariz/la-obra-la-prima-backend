#
# Build stage
#
FROM maven:4.0.0-xsd AS build
COPY src ./la-obra-la-prima/src
COPY pom.xml ./la-obra-la-prima
RUN mvn -f ./la-obra-la-prima/pom.xml clean package


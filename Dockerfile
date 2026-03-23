#  Build
FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app

# Maven wrapper and pom first 
COPY mvnw .
COPY mvnw.cmd .
COPY pom.xml .
COPY .mvn .mvn

#  dependencies
RUN ./mvnw dependency:go-offline -B

#  building the JAR
COPY src src
RUN ./mvnw clean package -DskipTests

# Run stage
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

COPY --from=build /app/target/*.jar app.jar
COPY campus.db campus.db      

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
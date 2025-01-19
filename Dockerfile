FROM mcr.microsoft.com/openjdk/jdk:21-ubuntu as build
LABEL authors="hendisantika"
WORKDIR /app
COPY pom.xml .
RUN mvn clean dependency:go-offline -B
COPY src ./src
RUN mvn clean package -DskipTests

FROM mcr.microsoft.com/openjdk/jdk:21-distroless
WORKDIR /app
EXPOSE 8080
COPY --from=build /app/target/*.jar app.jar
CMD ["app.jar"]

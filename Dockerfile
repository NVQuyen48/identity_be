FROM eclipse-temurin:22-jdk

LABEL description="Auth service"

WORKDIR /application

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} application.jar

EXPOSE 8082

ENTRYPOINT ["java", "-jar", "application.jar"]
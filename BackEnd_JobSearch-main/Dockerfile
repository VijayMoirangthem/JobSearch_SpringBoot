#FROM maven:3.8.5-openjdk-17 AS build
#COPY . .
#RUN mvn clean package -DskipTests

#FROM openjdk:17.0.1-jdk-slim
#COPY --from=build /target/joblisting-0.0.1-SNAPSHOT.jar joblisting.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","joblisting.jar"]

# Stage 1: Build the application
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app                   
# Set working directory to /app
COPY . .                       
# Copy the entire project to /app
RUN mvn -f /app/pom.xml clean package -DskipTests   # Run Maven from /app directory

# Stage 2: Create the final image
FROM openjdk:17.0.1-jdk-slim
COPY --from=build /app/target/joblisting-0.0.1-SNAPSHOT.jar /app/joblisting.jar   
# Copy the JAR file from the build stage
EXPOSE 8080                    
# Expose port 8080
ENTRYPOINT ["java", "-jar", "/app/joblisting.jar"]   # Run the application when the container starts

FROM maven:3.9.6-openjdk-11.0.16.1 AS build
COPY . .
RUN mvn clean package -DskipTests
# Package stage
FROM openjdk:11.0.16.1-jdk-slim
COPY --from=build /target/joblisting-0.0.1-SNAPSHOT.jar joblisting.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","joblisting.jar"]



#FROM maven:3.8.5-openjdk-17 AS build
#COPY . .
#RUN mvn clean package -DskipTests

#FROM openjdk:17.0.1-jdk-slim
#COPY --from=build /target/joblisting-0.0.1-SNAPSHOT.jar joblisting.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","joblisting.jar"]

# Stage 1: Build the application
#FROM maven:3.8.5-openjdk-17 AS build
#WORKDIR /app                   
# Set working directory to /app
#COPY . .                       
# Copy the entire project to /app
#WORKDIR /app                   
# Set working directory to /app again (to ensure correct context)
#RUN mvn clean package -DskipTests   
# Run Maven to build the application

# Stage 2: Create the final image
# openjdk:17.0.1-jdk-slim
#COPY --from=build /app/target/joblisting-0.0.1-SNAPSHOT.jar /app/joblisting.jar   
# Copy the JAR file from the build stage
#EXPOSE 8080                    
# Expose port 8080
#ENTRYPOINT ["java", "-jar", "/app/joblisting.jar"]   
# Run the application when the container starts

# Build stage
#




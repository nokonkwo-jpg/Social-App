# Create a new image with JRE
FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file from the builder stage
COPY  build/libs/socials-0.0.1-SNAPSHOT.jar .

# Expose the port the application runs on
EXPOSE 8080

# Specify the command to run your application
CMD ["java", "-jar", "socials-0.0.1-SNAPSHOT.jar"]
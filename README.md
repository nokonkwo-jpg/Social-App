# Socials Application

This Spring Boot application provides a simple REST API for managing social media accounts.

## Build and Run Instructions

1. **Clone Repository**

2. **Cd into the project folder**

3. **Build Application**: Run the following command to build the application:

docker build -t myapp .

4. **Run Application**: Run the following command to run the application:

docker run -d --name socialapp -p 8080:8080 myapp

5. **Access Swagger UI**: Once the application is running, open a web browser and navigate to [https://localhost:8080/swagger-ui/index.html#/](https://localhost:8080/swagger-ui/index.html#/) to access the Swagger UI.
## Learning Journey
The journey was quite difficult and made me feel like I was learning coding again for the first time. The amount of research I was doing for a language I thought I knew really shocked me. A lot of the time I was asking ChatGPT to explain code to me like a 5 year old so I could understand what was going on. It also interested me how all these files "talk" to each other. Overall learning the work that goes into a containerized web service was dope and I really look forward to more projects like this. 

### Sources
- Dan Vega: He was a great source that I utilized a majority of the project.
- Stack Overflow: I referred to various questions and answers on Stack Overflow to troubleshoot any issues and find solutions to specific problems encountered during development.
- ChatGPT: I found myself stuck a lot of the time or I couldn't find an answer that worked with my code, so I'd ask Chat to give me a solution, explain it to me like a novice, and give me links to any articles that could help
- Gemini: Same as ChatGPT
- [https://spring.io/learn] - this gave me the building blocks to start the project

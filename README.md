# Spring Boot Course Registration

## Project Overview
This is a simple Spring Boot web application that allows students to register for a course. Users can fill out a registration form and see a confirmation page displaying their submitted details.

**Features:**
- Registration form with fields: Name, Email, Course, Level of Study
- Confirmation page displaying submitted data
- Basic CSS styling for a clean UI
- Thymeleaf templates for form and confirmation views
- No database required; data is handled using model attributes

---

## Project Structure
src
└── main
    ├── java
    │   └── com.example.assignment1
    │       ├── Assignment1Application.java
    │       ├── controller
    │       │   └── RegistrationController.java
    │       └── model
    │           └── Student.java
    └── resources
        ├── static
        │   └── style.css
        ├── templates
        │   ├── register.html
        │   └── confirmation.html
        └── application.properties

---

## How to Run

1. Ensure you have **Java 21+** and **Maven** installed.
2. Open a terminal and navigate to the project root.
3. Build and run the project:

```bash
mvn spring-boot:run

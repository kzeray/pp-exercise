# Mock Pair Programming Interview - Spring Boot REST API

## Introduction
Welcome to the mock pair programming interview for a Spring Boot REST API. In this exercise, you will be completing the implementation of a simple User management system. The application involves creating, retrieving, updating, and deleting user records.

## Your Tasks

2. **User Repository:** No additional changes are needed in the repository.

3. **User Service (UserServiceImpl):** Implement the following in the `UserServiceImpl` class:
    - **Validation:** Implement validation for email and password in the `createUser` method.
    - **Business Logic:** If needed, add any additional business logic related to user management.

4. **User Controller:** No additional changes are needed in the controller.

## Validation Rules
1. **Email Validation:**
    - The email field must not be null.
    - The email must be a valid email format (you can use a regular expression for this).
    - The email must be unique among users (implement this check using the repository).

2. **Password Validation:**
    - The password field must not be null.
    - The password must be at least 8 characters long.

## Instructions
1. Clone this repository to your local machine.
2. Open the project in your preferred IDE (like IntelliJ, Eclipse, or Visual Studio Code).
3. Navigate to the `User` entity class and add the required validation rules for email and password.
4. Implement the validation and business logic in the `UserServiceImpl` class.
5. Test your implementation by running the application and using a tool like Postman or cURL to interact with the API.
6. Be prepared to explain your implementation and thought process during the interview.

Good luck!

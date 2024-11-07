# FamilyMap Server Project

This project for BYU's CS 240 course involves creating a server for the FamilyMap application, which provides users with a visual representation of their family history on a map.

## Project Overview

**FamilyMap** is a client-server application. The **FamilyMap server** is responsible for user authentication, family history data storage, and generating artificial family history data. The server accepts HTTP requests, processes them, and responds with appropriate data, interacting with a local SQLite database.

---

### Components

1. **Server**: Core component handling HTTP requests and database operations.
2. **Handlers**: Maps incoming URL paths to specific functions.
3. **Services**: Contains server functionalities (e.g., logging in, retrieving family data).
4. **SQLite Database**: Stores user, person, event, and authentication data.
5. **DAOs**: Data Access Objects provide methods for database interaction.
6. **Models**: Represents data objects stored in database rows.
7. **Requests & Responses**: Handles data input and output from client to server.

### Key Concepts

- **User Authentication**: Users must log in and receive an authorization token for secure data access.
- **Data Persistence**: All server data persists in an SQLite database, including user, person, event, and auth data.
- **Family History Generation**: The server generates up to four generations of ancestor data upon user registration or a `fill` request.

---

## Server Requirements

The server includes several endpoints to manage data:

- **/user/register**: Registers a new user, generating family history data for them.
- **/user/login**: Authenticates the user, issuing an authorization token.
- **/clear**: Deletes all data from the server's database.
- **/fill/[username]/{generations}**: Generates ancestor data up to the specified number of generations.
- **/load**: Replaces existing data with new user, person, and event data.
- **/person/[personID]**: Returns details for a specific person.
- **/person**: Returns all family members of the current user.
- **/event/[eventID]**: Returns details for a specific event.
- **/event**: Returns all events related to the user’s family.

### JSON Data Structure

Each endpoint handles request and response data in JSON format, with strict requirements to match specific structures for testing and validation.

---

## Development Guide

### Getting Started

1. **Starter Project**: Use the provided [IntelliJ starter project](https://github.com/jerodw/FamilyMapServerStudent) with pre-set configurations for testing.
2. **Command-Line Arguments**: The server requires a port number to accept client connections (e.g., `8080`).

### Automated Unit Testing

Use JUnit 5 to create a minimum of two test cases per public method in DAO and Service classes:
- **Positive Tests**: Valid inputs returning expected results.
- **Negative Tests**: Invalid inputs triggering errors or edge cases.

Example:
- Testing successful login (`positive` case).
- Testing failed login with incorrect password (`negative` case).

### Test Suite & Pass-Off

1. **Test Suite**: Run the included test suite to validate server functionality.
2. **Pass-Off**: Once all tests pass, request a TA pass-off.
3. **Submission**: Submit source code and a screenshot of passing test results on Canvas.

---

## Grading

Refer to **Family Map Client/Server Code Expectations** for grading criteria. Each project component (code, test cases, etc.) contributes to the overall course grade as per the CS 240 course policies.

For further setup, see the course website or reach out with questions.

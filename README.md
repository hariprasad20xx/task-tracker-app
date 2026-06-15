# Task Tracker API

A production-style Task Tracker application built using **Java**, **Spring Boot**, **Spring Data JPA**, and **H2 Database** following a layered architecture and RESTful API design.

This project allows users to create, manage, update, complete, and delete tasks while demonstrating backend development best practices such as DTOs, service layers, repository patterns, validation, exception handling, and clean code principles.

---

## 🚀 Features

### ✅ Create Task
- Create new tasks with:
    - Title
    - Description
    - Due Date
    - Priority

### ✅ View Tasks
- Retrieve all existing tasks

### ✅ Update Task
- Modify:
    - Title
    - Description
    - Due Date
    - Priority
    - Status

### ✅ Complete Task
- Mark tasks as completed
- Reopen completed tasks

### ✅ Delete Task
- Permanently remove tasks

### ✅ Input Validation
- Request validation using Bean Validation

### ✅ Global Exception Handling
- Consistent API error responses

### ✅ Layered Architecture
- Controller Layer
- Service Layer
- Repository Layer
- Domain Layer

---

## 🏗️ Project Architecture

```text
Client
  │
  ▼
Controller Layer
  │
  ▼
Service Layer
  │
  ▼
Repository Layer
  │
  ▼
H2 Database
```

### Package Structure

```text
src/main/java
└── com.tasktracker
    ├── controller
    ├── service
    │   └── impl
    ├── repository
    ├── mapper
    │   └── impl
    ├── domain
    │   ├── entity
    │   ├── dto
    └── exception
```

---

## 🛠️ Tech Stack

| Technology | Purpose |
|------------|----------|
| Java 21+ | Programming Language |
| Spring Boot | Application Framework |
| Spring Web | REST APIs |
| Spring Data JPA | Database Operations |
| H2 Database | In-Memory Database |
| Maven | Dependency Management |
| Hibernate | ORM Framework |
| Jakarta Validation | Input Validation |
| Git & GitHub | Version Control |

---

## 📊 Domain Model

### Task

```java
Task
├── UUID id
├── String title
├── String description
├── LocalDate dueDate
├── TaskPriority priority
├── TaskStatus status
├── Instant created
└── Instant updated
```

### Task Priority

```text
HIGH
MEDIUM
LOW
```

### Task Status

```text
OPEN
COMPLETE
```

---

## 📡 REST API Endpoints

### Create Task

```http
POST /api/v1/tasks
```

#### Request

```json
{
  "title": "Learn Spring Boot",
  "description": "Complete REST API module",
  "dueDate": "2026-07-01",
  "priority": "HIGH"
}
```

#### Response

```json
{
  "id": "uuid",
  "title": "Learn Spring Boot",
  "description": "Complete REST API module",
  "dueDate": "2026-07-01",
  "priority": "HIGH",
  "status": "OPEN"
}
```

---

### Get All Tasks

```http
GET /api/v1/tasks
```

---

### Update Task

```http
PUT /api/v1/tasks/{id}
```

#### Request

```json
{
  "title": "Learn Spring Boot Advanced",
  "description": "Complete REST and JPA",
  "dueDate": "2026-08-01",
  "priority": "HIGH",
  "status": "COMPLETE"
}
```

---

### Delete Task

```http
DELETE /api/v1/tasks/{id}
```

Returns:

```http
204 NO CONTENT
```

---

## ⚠️ Error Response Format

All API errors follow a standard structure:

```json
{
  "error": "Error message"
}
```

Example:

```json
{
  "error": "Title must be between 1 and 255 characters"
}
```

---

## ▶️ Getting Started

### Prerequisites

- Java 21+
- Maven 3.9+
- Git

### Clone Repository

```bash
git clone https://github.com/yourusername/task-tracker-api.git
```

```bash
cd task-tracker-api
```

### Build Project

```bash
mvn clean install
```

### Run Application

```bash
mvn spring-boot:run
```

Application starts on:

```text
http://localhost:8080
```

---

## 🗄️ H2 Database Console

Access:

```text
http://localhost:8080/h2-console
```

Example Configuration:

```text
JDBC URL: jdbc:h2:mem:testdb
Username: sa
Password:
```

---

## 🧪 Sample API Testing

### Create Task

```bash
curl -X POST http://localhost:8080/api/v1/tasks \
-H "Content-Type: application/json" \
-d '{
"title":"Build Portfolio",
"description":"Create portfolio website",
"dueDate":"2026-08-10",
"priority":"HIGH"
}'
```

### Fetch Tasks

```bash
curl http://localhost:8080/api/v1/tasks
```

---

## 🎯 Key Concepts Demonstrated

- Object-Oriented Programming (OOP)
- Layered Architecture
- RESTful API Design
- DTO Pattern
- Repository Pattern
- Dependency Injection
- Bean Validation
- Global Exception Handling
- Entity Mapping with JPA
- Clean Code Principles
- Git Workflow

---

## 📈 Future Improvements

- User Authentication & Authorization (JWT)
- PostgreSQL Integration
- Docker Support
- Swagger/OpenAPI Documentation
- Pagination & Sorting
- Search & Filtering
- Unit Testing
- Integration Testing
- CI/CD Pipeline
- Deployment to AWS

---

## 👨‍💻 Author

**Hariprasad**

Aspiring Software Developer passionate about Backend Development, Java, Spring Boot, Data Structures & Algorithms, and building scalable software systems.

---

## ⭐ Learning Outcome

This project was built to strengthen understanding of:

- Spring Boot Fundamentals
- REST API Development
- Database Persistence with JPA
- Backend Application Architecture
- Professional Git Workflow
- Industry-standard Java Development Practices

If you found this project helpful, consider giving it a ⭐ on GitHub.
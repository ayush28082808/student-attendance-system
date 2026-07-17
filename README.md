# 🎓 Student Attendance Management System

A backend-based Student Attendance Management System developed using Spring Boot, MySQL, Docker, and Swagger. The project provides REST APIs to manage students, faculty, subjects, and attendance records.

## 🚀 Features

- Student Management (CRUD)
- Faculty Management (CRUD)
- Subject Management (CRUD)
- Attendance Management (CRUD)
- REST APIs
- Bean Validation
- Global Exception Handling
- Swagger/OpenAPI Documentation
- Docker & Docker Compose Support
- MySQL Database Integration

## 🛠️ Tech Stack

- Java 21
- Spring Boot 3
- Spring Data JPA
- MySQL
- Maven
- Docker
- Docker Compose
- Swagger (OpenAPI)

## 📂 Project Structure

```
src
 ├── controller
 ├── entity
 ├── repository
 ├── service
 ├── exception
 └── resources
```

## ▶️ Run the Project

### Clone the repository

```bash
git clone https://github.com/ayush28082808/student-attendance-system.git
```

### Navigate to the project

```bash
cd student-attendance-system
```

### Build the project

```bash
mvn clean package
```

### Run using Docker

```bash
docker compose up --build
```

## 📖 API Documentation

Swagger UI:

```
http://localhost:8080/swagger-ui/index.html
```

## 🗄️ Database

- MySQL 8
- Database Name: `attendance_db`

## 👨‍💻 Author

**Ayush Singh**

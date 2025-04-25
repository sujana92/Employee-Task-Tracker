# 🧾 Employee Task Tracker

A simple Spring Boot application that allows employees to manage tasks with CRUD operations. 
Built to demonstrate backend development, CI/CD, and cloud-readiness in a DevOps-friendly architecture.

---

## Features

- Create, Read, Update, and Delete tasks
- Clean architecture using Spring Boot and JPA
- RESTful API design
- Maven-based build system
- Database setup
- CI/CD pipeline using GitHub Actions
- Test-ready with JUnit

---

## Project Structure

```bash
src
├── main
│   ├── java/com/example/demo
│   │   ├── controller     # REST Controllers
│   │   ├── model          # Task Entity
│   │   ├── repository     # Spring Data JPA Interface
│   │   └── service        # Business Logic
│   └── resources
│       ├── application.properties
│       └── static/templates (optional)
└── test
    └── java/com/example/demo  # Unit tests
```

---

## Tech Stack

| Layer | Tech |
|-------|------|
| Language | Java 17 |
| Framework | Spring Boot 3.x |
| Build Tool | Maven |
| Database | PostgreSQL (or H2 for dev) |
| CI/CD | GitHub Actions |
| Container | Docker-ready (optional) |

---

## Getting Started

### Prerequisites

- Java 17
- Maven
- Git

### Run Locally

```bash
mvn spring-boot:run
```

Visit: `http://localhost:8080/api/tasks`

---

## Run Tests

```bash
mvn test
```

---

## CI/CD with GitHub Actions

Every push to the `main` branch triggers the GitHub Actions workflow to:

- Build the project
- Run tests
- (Optional) Package for deployment

See `.github/workflows/maven.yml` for pipeline details.

---

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/api/tasks` | List all tasks |
| POST   | `/api/tasks` | Create new task |
| PUT    | `/api/tasks/{id}` | Update task |
| DELETE | `/api/tasks/{id}` | Delete task |
---

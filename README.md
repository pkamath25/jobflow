# JobFlow 🚀

A secure Job Application Tracking System built using Spring Boot and MySQL that helps users manage job applications, track interview progress, and monitor application statistics through dashboard analytics.

---

## Features

- User Management
- Company Management
- Job Application Tracking
- Application Status Workflow
- Dashboard Analytics
- JWT Authentication
- Validation & Exception Handling
- Swagger API Documentation

---

## Application Workflow

```text
User
  ↓
Login
  ↓
JWT Token
  ↓
Manage Companies
  ↓
Track Applications
  ↓
Update Status
  ↓
Dashboard Analytics
```

---

## Tech Stack

### Backend

- Java
- Spring Boot
- Spring Security
- JWT
- Spring Data JPA
- Hibernate

### Database

- MySQL

### Tools

- Maven
- Postman
- Swagger OpenAPI
- Git
- GitHub

---

## API Endpoints

### Authentication

```http
POST /auth/login
```

### Users

```http
POST /users
```

### Companies

```http
POST /companies
GET /companies
```

### Applications

```http
POST /applications
GET /applications
PUT /applications/{id}/status
```

### Dashboard

```http
GET /dashboard
```

---

## Security

Protected APIs require JWT token.

```http
Authorization: Bearer <JWT_TOKEN>
```

---

## Author

Pranamya Kamath

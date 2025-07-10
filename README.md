# 🏫 School Platform – Practice Project
This is a modular, domain-driven school management platform built as a portfolio-grade full-stack application. It is designed to manage users, scheduling, class enrollment, and educational structure in a clean and scalable architecture.

### 🧩 Key Features
- User Management
    - Supports multiple roles: `STUDENT`, `TEACHER`, `PARENT`, `ADMIN`, `SUPER_ADMIN`, `SCHEDULE_MAKER`
    - Role-based access with Spring Security
    - `SUPER_ADMIN` manages platform-wide settings and has full access
    - `SCHEDULE_MAKER` manages timetables and subject schedules

- Class & Subject Management
    - Assign students to `SchoolClass`
    - Link teachers to multiple `Subjects`
    - Bi-directional relationships for teaching, learning, and managing subjects

- Enrollment & Academic Records
    - Students can be enrolled and disenrolled from classes and subjects
    - Each student has a unique `studentNumber`, grade level, and parent contact

- Scheduling System
    - Dedicated service and role (`SCHEDULE_MAKER`) to generate/manage timetables
    - Future expansion: time slot conflict checks, teacher availability, and room assignments

- Clean Architecture
    - Domain-Driven Design structure
    - Application Layer for orchestration logic
    - Separation of Concerns (domain, application, persistence, web)

- Security
    - JWT-based authentication
    - UserDetails implementation using BaseUser + RoleEnum
    - Authority-based permission model (e.g. CRUD-permission levels based on roles)

- Dockerized
    - Fully Dockerized using `Dockerfile` and `docker-compose`
    - Runs app and database with one command: `docker-compose up`
    - `.env` support for sensitive configs

#

### 🗂 Technologies Used
- Java + Spring Boot
- Spring Security + JWT
- JPA (Hibernate)
- PostgreSQL (Dockerized)
- Docker & Docker Compose
# sebastianhamm.com Backend

Central backend for all sebastianhamm.com subdomains, built with Spring Boot and designed to be clean, scalable, and maintainable without overengineering.

---

## Overview

This backend serves as a single API for the following frontends:

- **sebastianhamm.com** – Main website & services
- **blog.sebastianhamm.com** – Blog platform
- **tools.sebastianhamm.com** – Custom web tools
- **donate.sebastianhamm.com** – Donations
- **socials.sebastianhamm.com** – Social media hub

One backend. One user system. One authentication flow.

---

## Tech Stack

- Java 21
- Spring Boot
- Spring Security (JWT, stateless)
- Spring Data JPA
- PostgreSQL
- Flyway (database migrations)
- OpenAPI / Swagger

---

## Architecture

- REST API
- Layered architecture:
    - Controller
    - Service
    - Repository
    - Domain (Entity / DTO)

No microservices, no CQRS, no hexagonal architecture.
Simple, explicit, and maintainable.

---

## Project Structure

```text
src/main/java/com/sebastianhamm
 ├─ config
 │   ├─ SecurityConfig
 │   ├─ JwtConfig
 │   └─ OpenApiConfig
 │
 ├─ auth
 │   ├─ controller
 │   ├─ service
 │   ├─ dto
 │   └─ security
 │
 ├─ user
 │   ├─ controller
 │   ├─ service
 │   ├─ repository
 │   ├─ entity
 │   └─ dto
 │
 ├─ blog
 ├─ tools
 ├─ donation
 ├─ socials
 │
 ├─ common
 │   ├─ exception
 │   ├─ response
 │   └─ util
 │
 └─ Application.java
```

---

## Security

### Authentication
- JWT-based authentication
- Stateless
- Token via `Authorization: Bearer <token>`

### Roles
- USER
- ADMIN

(Fine-grained permissions may be added later.)

### Access Rules
**Public**
- Login
- Register
- Read blog posts
- View services

**Protected**
- Tools
- Donations
- Admin endpoints

---

## Database

### Core Entities
- User
- Role
- BlogPost
- Tool
- Donation

### Migrations
- Flyway is mandatory
- No manual database changes
- Versioned migrations starting at `V1__init.sql`

---

## Implementation Roadmap

### Phase 1 – Foundation
1. Project initialization
2. Database configuration
3. Flyway setup
4. OpenAPI configuration

### Phase 2 – Authentication & Users
5. User entity
6. Role entity
7. JWT security configuration
8. Login & registration endpoints

### Phase 3 – Core Features
9. Blog (read-only)
10. Tools (basic endpoints)
11. Donations (minimal flow)

### Phase 4 – Hardening
12. Global error handling
13. Logging
14. Security review
15. Refactoring & cleanup

---

## Explicit Non-Goals

- No frontend rendering in backend
- No OAuth providers (Google, GitHub, etc.)
- No microservice split
- No event-driven architecture
- No GraphQL

---

## Definition of Done

- API fully documented
- JWT authentication stable
- Database reproducible via Flyway
- Local and production environments aligned
- Extendable without architectural rewrites

---

## Status

Work in progress.
# 🎬 Movie Review Microservice

A Spring Boot microservice for managing movies and reviews.

## 🚀 Features
- Add & fetch movies
- Add & fetch reviews
- RESTful APIs
- Clean architecture

## 🛠 Tech Stack
- Java
- Spring Boot
- MySQL
- JPA / Hibernate

## 📌 API Endpoints

### Movies
- POST /movies
- GET /movies
- GET /movies/{id}

### Reviews
- POST /reviews
- GET /reviews/movie/{movieId}

## ▶️ How to Run

### Prerequisites
- Java 17+
- Maven
- MySQL running

### Steps

```bash
git clone https://github.com/yourusername/movie-review-service.git
cd movie-review-service
mvn clean install
mvn spring-boot:run

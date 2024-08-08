# Voting System

![Voting System](https://img.shields.io/badge/Java-17-blue)
![Spring Framework](https://img.shields.io/badge/Spring%20Framework-5.3.9-green)
![Docker](https://img.shields.io/badge/Docker-20.10-blue)
![MongoDB](https://img.shields.io/badge/MongoDB-4.4-green)
![Kafka](https://img.shields.io/badge/Kafka-2.8-orange)
![Swagger OpenAPI](https://img.shields.io/badge/Swagger%20OpenAPI-3.0-brightgreen)
![Angular](https://img.shields.io/badge/Angular-18.0-red)

## Overview

This project is a **Voting System** inspired by reality show voting mechanisms. It is designed to handle asynchronous voting, ensuring that votes are processed efficiently and accurately, even when cast simultaneously by a large number of participants.

The system is built with a **Programming-Oriented by Events** approach, leveraging modern technologies to handle the voting process in a scalable and fault-tolerant manner.

## Features

- **Asynchronous Voting**: Handles multiple votes at the same time without conflicts.
- **Event-Driven Architecture**: Uses Kafka to manage events and ensure scalability.
- **REST API Documentation**: Utilizes Swagger OpenAPI for easy exploration and testing of the API endpoints.

## Technologies Used

- **Docker**: Containerization platform to create, deploy, and run the application in isolated environments.
- **MongoDB**: NoSQL database used for storing voting data.
- **Java**: Primary programming language used to develop the application.
- **Spring Framework**: Java framework that provides comprehensive infrastructure support for developing Java applications.
- **Kafka**: Distributed event streaming platform used for building real-time data pipelines and streaming applications.
- **Swagger OpenAPI**: Tool for documenting and testing RESTful APIs.

## Getting Started

### Prerequisites

- **Docker**: Ensure Docker is installed on your machine.
- **Java 11**: Install Java Development Kit (JDK) version 11.
- **Maven**: Ensure Maven is installed to manage project dependencies.

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/jessicalopesvs/VotingSystem.git
   cd VotingSystem
2. **Build the project using Maven:**:
   ```bash
   mvn clean install
3. **Run the application using Docker Compose:**:
   ```bash
   docker-compose up --build

Accessing the Application

	•	Swagger UI: Once the application is running, you can access the Swagger UI for API documentation and testing at:
http://localhost:8080/swagger-ui/

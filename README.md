# Mental Wellness Check-In API

A Spring Boot REST API demonstrating an end-to-end DevOps workflow for a mental wellness application. This project focuses on automating software delivery using CI/CD, containerization, infrastructure management, and monitoring tools commonly used in industry.

---

## Overview

The application allows users to record daily mood check-ins through REST APIs while showcasing a complete DevOps pipeline.

The project demonstrates:

- Version control using Git and GitHub
- Automated builds with Maven
- Unit testing using JUnit
- Continuous Integration with Jenkins
- Containerization using Docker
- Infrastructure automation using Puppet
- Application monitoring using Prometheus and Grafana
- Infrastructure monitoring using Nagios

---

## Features

- REST API built using Spring Boot
- Automated Maven build process
- JUnit test execution
- Jenkins CI/CD pipeline
- Dockerized application deployment
- Infrastructure as Code using Puppet
- Real-time application monitoring
- Dashboard visualization using Grafana
- Host and service monitoring using Nagios

---

## Tech Stack

| Technology | Purpose |
|------------|---------|
| Java 17 | Backend Development |
| Spring Boot | REST API |
| Maven | Build Automation |
| Git & GitHub | Version Control |
| Jenkins | CI/CD Pipeline |
| Docker | Containerization |
| Puppet | Configuration Management |
| Prometheus | Metrics Collection |
| Grafana | Metrics Visualization |
| Nagios | Infrastructure Monitoring |

---

## Project Workflow

Developer

↓

GitHub Repository

↓

Jenkins Pipeline

↓

Maven Build

↓

JUnit Tests

↓

Docker Image

↓

Spring Boot Application

↓

Prometheus

↓

Grafana Dashboards

↓

Nagios Monitoring

---

## Project Structure

```
Mental-Wellness-Api-Devops
│
├── src/
├── ci/
├── Dockerfile
├── Jenkinsfile
├── pom.xml
├── README.md
└── target/
```

---

## Running the Project

Clone the repository

```bash
git clone https://github.com/diyadeepa2004/Mental-Wellness-Api-Devops.git
```

Build the project

```bash
mvn clean package
```

Run the application

```bash
java -jar target/wellness-api-1.0.0.jar
```

Access the API

```
http://localhost:8080
```

---

## Monitoring

The project demonstrates monitoring using:

- **Prometheus** for collecting application metrics
- **Grafana** for visualizing metrics through dashboards
- **Nagios** for monitoring host and service availability

Example metrics include:

- API request count
- JVM memory usage
- CPU utilization
- Response time
- HTTP status codes
- Application uptime

---

## Future Improvements

- Database integration
- User authentication
- Cloud deployment
- Alert notifications
- Kubernetes deployment

---

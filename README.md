---

# HealthForm

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)

## Overview

HealthForm is a Java EE web application designed to manage patient information. It uses JPA for data persistence, EJB for business logic, and CDI for managing bean lifecycles and injection. This project demonstrates a simple, scalable architecture for managing patient records in a healthcare environment.

## Features

* Add and store patient information (name, medical condition, pain scale, blood type)
* Uses JPA entities for database persistence
* EJB stateless session beans handle data access logic
* CDI-managed beans provide frontend logic and user interaction
* Configured with Ant build scripts and NetBeans project files


## Getting Started

### Prerequisites

* Java 8 or higher (compatible with Java EE 7+)
* A Java EE-compatible application server (e.g., GlassFish, WildFly)
* Apache Ant for building the project
* NetBeans IDE (optional, for development)

### Build and Deploy

1. Clone the repository:

   ```bash
   git clone https://github.com/ShannieCh/HealthForm.git
   cd HealthForm
   ```

2. Build the project using Ant:

   ```bash
   ant clean build
   ```

3. Deploy the generated WAR/EAR file to your Java EE application server.

4. Access the application via your server’s context root.

## Configuration

* `src/conf/persistence.xml`: Defines the persistence unit and datasource.
* Database schema generation is set to `create` on startup (modify as needed).

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---



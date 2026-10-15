# Student Management System

A console-based Student Management System built with Java, JDBC, MySQL, and Maven. This project demonstrates database connectivity and CRUD operations for managing student records.

## Features

- Add new student records
- View student records
- Update student details
- Delete student records
- Store and retrieve data using MySQL
- Separate database access and application logic

## Technologies Used

- Java
- JDBC
- MySQL
- Maven

## Project Structure

```text
Student-Management-System/
├── src/
│   └── main/
│       └── java/
│           ├── Student.java
│           ├── StudentDAO.java
│           └── org/
│               └── example/
│                   ├── DBConnection.java
│                   ├── Main.java
│                   └── StudentService.java
├── pom.xml
└── README.md
```

## Prerequisites

- JDK
- MySQL Server
- Maven, or the included Maven Wrapper

## Database Setup

1. Create the database in MySQL:

   ```sql
   CREATE DATABASE student_management;
   ```

2. Configure the database connection in `DBConnection.java`. The default connection URL is:

   ```text
   jdbc:mysql://localhost:3306/student_management
   ```

3. Set the `DB_PASSWORD` environment variable to your MySQL password.

   **Windows PowerShell:**

   ```powershell
   $env:DB_PASSWORD = "your_mysql_password"
   ```

   Replace the placeholder with your actual password. Never commit database credentials to GitHub.

4. Ensure the MySQL JDBC driver dependency is configured in `pom.xml`.

## How to Run

1. Clone this repository.
2. Open the project in IntelliJ IDEA.
3. Create the database and configure your database credentials.
4. Run `Main.java`.

## Learning Goals

This project demonstrates Java classes and objects, JDBC connectivity, SQL operations, Maven dependency management, and separation of application responsibilities.

## Author

**Mohamed Asif**

- GitHub: [MD-ASIF-09](https://github.com/MD-ASIF-09)

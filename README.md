# Student Management System

A Java-based application for managing student records using JDBC and MySQL.

## Features

- Add student records
- View student records
- Update student details
- Delete student records
- Connect to MySQL using JDBC

## Technologies Used

- Java
- MySQL
- JDBC
- Maven
- IntelliJ IDEA

## Prerequisites

- JDK
- MySQL Server
- Maven or the included Maven Wrapper

## Database Setup

Create the database in MySQL:

```sql
CREATE DATABASE student_management;
```

Configure your MySQL password using the `DB_PASSWORD` environment variable before running the application.

For Windows PowerShell:

```powershell
$env:DB_PASSWORD = "your_mysql_password"
```

Replace the placeholder with your actual password. Do not commit passwords or other credentials to GitHub.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Configure MySQL and set the `DB_PASSWORD` environment variable.
3. Check the database connection settings in `DBConnection.java`.
4. Run `Main.java`.

## Author

Mohamed Asif

GitHub: https://github.com/MD-ASIF-09

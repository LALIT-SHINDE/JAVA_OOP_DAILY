User Registration System using JSP, Servlet and MySQL

Project Name:
RegisterSys

Description

This project is a simple User Registration System developed using:
JSP
Servlet
MySQL Database
Apache Tomcat Server

The user enters:
Name
Email
Password

The data is stored inside the MySQL database.

Project Structure

RegisterSys
│
├── index.jsp
├── success.jsp
├── web.xml
├── RegisterServlet.java
└── mysql-connector-j.jar

Software Requirements

JDK
Apache Tomcat
MySQL
VS Code or Eclipse
MySQL Connector Jar File

Database Setup

Run the following SQL commands in MySQL:

CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE users(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    password VARCHAR(100)
);

How to Run

Step 1
Create the database in MySQL.

Step 2
Create all project files.

Step 3
Add mysql-connector-j.jar into:
Tomcat/lib

Step 4
Start Apache Tomcat Server.

Step 5
Open browser and run:

http://localhost:8080/RegisterSys/index.jsp

Files Information

index.jsp
Used to create the registration form.

RegisterServlet.java
Handles form data and stores it in MySQL database.

success.jsp
Displays registration success message.

web.xml
Used for servlet configuration.

Output

Registration form displayed.
User enters details.
Data stored in MySQL database.
Success page opened.

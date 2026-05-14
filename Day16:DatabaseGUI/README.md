DatabaseGUI

A Java Swing application to connect with MySQL database and execute SQL queries using GUI interface.

Tools Used

- Java
- Swing
- JDBC
- MySQL

Features

- Connects Java with MySQL database
- Executes SQL queries
- Supports:
  - SELECT
  - INSERT
  - UPDATE
  - DELETE
- Displays output using GUI

Database

Database Name:
college

Table Name:
student

SQL Table

CREATE DATABASE college;

USE college;

CREATE TABLE student(
    id INT,
    name VARCHAR(30),
    marks INT
);

INSERT INTO student VALUES
(1,'Rahul',80),
(2,'Amit',75),
(3,'Neha',90);

Compile

javac -cp ".;mysql-connector-j-9.0.0.jar" DatabaseGUI.java

Run

java -cp ".;mysql-connector-j-9.0.0.jar" DatabaseGUI

Example Queries

SELECT * FROM student;

INSERT INTO student VALUES(4,'Kiran',85);

UPDATE student SET marks=95 WHERE id=2;

DELETE FROM student WHERE id=1;

Output

The program opens a GUI window where user can enter SQL queries and execute them.

Author

Siddharth

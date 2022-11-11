# 🚖 TAXI-SERVICE 🚖

##  Description
A simple web-application that supports authentication, registration and other CRUD operations

##  Project structure
Project based on Three-Tier architecture:
- Presentation tier (controllers) - provides user interaction with the application
- Logic tier (services) - establishes the set of available operations and coordinates the program's response to each operation.
- Data tier (DAO) - represents interaction with the database

## Features
- registration as a driver
- authentication
- create/update/delete a manufacturer
- create/update/delete a car
- create/update/delete a driver
- add a car to a specific driver
- display all manufacturers / cars / drivers
- display cars for authenticated driver

## Technologies
- MySQL
- JDBC
- Apache Tomcat
- Servlet
- JSP
- HTML, CSS
- Cloud services

## Quickstart
1. Fork this repository
2. Clone the project to your computer
3. In the util / ConnectionUtil.java class set the necessary parameters for the DB connection:
``` java
    private static final String URL = "jdbc:DB_NAME://HOSTNAME:PORT/SCHEMA";
    private static final String USERNAME = "USERNAME"; 
    private static final String PASSWORD = "PASSWORD";
    private static final String JDBC_DRIVER = "jdbc driver for specified DB";
```
4. Create schema and tables in your database using statements in the `init_db.sql` 
5. Configure Apache Tomcat
6. Run project

### Or you can use the existing DB specified in ConnectionUtil with application login data:
- email: user1@gmail.com 
- password: 12345678


##  <a href="http://taxiservice-env.eba-yp6spnnd.eu-central-1.elasticbeanstalk.com/login">**The link of this project on Amazon Web Services**</a>
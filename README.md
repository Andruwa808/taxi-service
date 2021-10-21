#Web Application Taxi Service
##General info
This taxi service project was created to show my skills:
- Java Core
- OOP
- SOLID
- JDBC
- Java Web

This web application implements:
- driver authorization and registration
- CRUD operations
- adding manufacturers and car to the database
- adding a driver to the car

##Technologies used
- Java 11
- Maven
- MySQL
- Javax servlet API
- JSTL
- Tomcat 9.0.54

##Run this application
1. Install MySQL.
2. Install Tomcat 9.0.54 version.
3. Fork this project and clone it.
4. Initialize your database using init_db.sql file located in resources.
5. Add your info to ConnectionUtil located in util (add your URL to DB, login, password and JDBC driver) to be able to connect to your database.
6. Configure your Tomcat. (P.S. Your application context needs to be as "/").
7. Run this project using Tomcat's local server.
**Spring JDBC Bank Project**

A simple Spring Framework project demonstrating how to use Spring JDBC for basic database operations (insert, update, query) in a Bank management system.

📌 **Project Overview**

This project shows how to integrate Spring JDBC with a relational database to manage bank records.
It includes:

Spring Java-based configuration (@Configuration)

JdbcTemplate usage

DAO Pattern implementation

A simple MainClass for execution

🏗️ **Project Structure**
```
SpringJDBCBank/
│── src/
│   ├── main/java/com/springbankjdbc/
│   │   ├── MainClass.java
│   │   ├── config/AppConfig.java
│   │   └── dao/BankDao.java
│   └── test/java/com/springbankjdbc/AppTest.java
│
│── pom.xml
│── .gitignore
│── README.md
```

⚙️ **Technologies Used**

Technology	Purpose

Java 8+	Core application logic

Spring Core	Dependency Injection

Spring JDBC	Database operations

Maven	Build tool

MySQL/PostgreSQL	Database (any JDBC-supported DB)


🔧 **How to Run the Project**

1️⃣ Clone the Repository

git clone https://github.com/Krantikumar4211/SpringJDBCBank.git

cd SpringJDBCBank

2️⃣ Configure the Database

Create the table:

CREATE TABLE bank (

    id INT AUTO_INCREMENT PRIMARY KEY,
    bank_name VARCHAR(100),
    branch VARCHAR(100),
    city VARCHAR(100),
    ifsc VARCHAR(20) );

3️⃣ Add Database Configuration

Create the file:

src/main/resources/application.properties

Add:

spring.datasource.url=jdbc:mysql://localhost:3306/yourdb

spring.datasource.username=your_username

spring.datasource.password=your_password

4️⃣ **Build and Run**

Using Maven:

mvn clean package
mvn exec:java


Or run MainClass.java directly from your IDE.

🧩 **Main Features**

✔ Insert Bank records

✔ Spring AnnotationConfigApplicationContext configuration

✔ Uses JdbcTemplate for SQL queries

✔ Clean DAO layer using interfaces

✔ Easy to extend for update, delete, search, etc.

📚 **Sample Code**

MainClass.java

ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

BankDao bdao = context.getBean(BankDao.class);

// **Example:**
// bdao.insertBank("SBI", "Deccan Gymkhana", "Pune", "SBIN0001110");

🙌 **Author**

Krantikumar Dilip Patil
GitHub: https://github.com/Krantikumar4211

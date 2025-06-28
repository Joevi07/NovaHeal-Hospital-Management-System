# NovaHeal-Hospital-Management-System
NovaHeal is a Hospital Management System designed to efficiently manage patients, doctors, rooms, appointments, prescriptions, and billing using Oracle SQL Plus. It offers a structured and normalized relational database model tailored for real-world hospital operations.
___
## TABLE OF CONTENTS:
1. [Aim](#-aim)
2. [Features Offered](#-features-offered)
3. [Technologies & Libraries Used](#-technologies--libraries-used)
4. [Integration / Execution Sequence](#-integration--execution-sequence)
5. [Tools / Compilers used](#-tools--compilers-used)
6. [Files Included](#-files-included)
7. [SQL Concepts used](#-sql-concepts-used)
8. [Demo Screenshots](#-demo-screenshots)

### AIM:
  To design and implement a robust Hospital Management System named NovaHeal, using Oracle SQL Plus, that effectively handles real-time hospital operations like doctor assignments, room allocations, prescriptions, appointments.

___
### FEATURES OFFERED:
+ User Authentication - Sign up and Login with username and password.
+ Patient Registration and record management.
+ Doctor and nurse details with specialization and schedules.
+ Room booking for inpatients and Cost tracking.
+ Appointment scheduling between patients and doctors.
+ Prescription entry with medicine batch tracking.
+ Billing System.
+ Normalized relational database schema.
+ Used CRUD Operations for every entities.
+ Graphical Reports such as patient inflow, billing trends, medicine stocks using Chart.js graphs.
+ Automate operations like billing and alerts using PL/SQL triggers.
+ User Interface in NetBeans - Frontend created using Java Swing in Netbeans IDE, integrated with backend (Oracle sql plus database).

___
### TECHNOLOGIES & LIBRARIES USED:
+ `Java (Swing GUI)` - For building the desktop interface in NetBeans.
+ `Oracle SQL Plus / Oracle RDMS` - For backend database storage and logic.
+ `PL/SQL` - For writing stored procedures, functions, triggers.
+ `Chart.js` - For displaying visual graphs and statistics ( used in web-based modules or embedded via browser panels)
+ `JDBC` - To connect Java frontend with Oracle SQL backend
+ `NetBeans IDE` - Complete development and integration environment
___
### INTEGRATION / EXECUTION SEQUENCE:
1. Open the Project in **Apache NetBeans IDE 25**.
2. Run **Tables.sql** in Oracle SQL Plus to create schema.
3. Establish connection between your database and netbeans IDE.
4. Open **Login.java** to run the Java program.
5. Interact with GUI side panel to perform CRUD operations and to view statistical informations.
___
### TOOLS / COMPILERS USED:
- Apache NetBeans IDE 25(Java Swing GUI Builder).
- Oracle SQL Plus.
- JDK 24 or higher.
- JDBC and chart.js dependencies
___
### FILES INCLUDED:
- 📦 Java Source Files (com.mycompany.hospitalmanagement)
    + `Admission.java` - Manages admission records of patients.
    + `Appointment.java` - Handles appointment scheduling.
    + `Bill.java` - Manages payment logic.
    + `Department.java` - Stores hospital departments.
    + `Doctor.java` - Contains doctor records.
    + `Login.java` - Login authenticaton.
    + `Medicine.java` - Manages medicine information.
    + `Nurse.java` - Nurse information handling,
    + `Nursing_Service.java` - Tracks nursing services assigned.
    + `Patient.java` - Core patient information management.
    + `Prescription.java` - Links patients with their medications.
    + `Receptionist.java` - Handles receptionist functions.
    + `Room.java` - Room assingment and cost tracking.
    + `SignUp.java` - Register new users.
    + `welcome.java` - Welcome splash and navigation screen.
- Resources / Assets
    + `logo.jpg` - NovaHeal logo used in GUI.
    + `Tables.sql` - SQL DDL scripts for table creation and procedures.
- Icons Used (com.mycompany.hospitalmanagement.icon):
    + Contains icons for entities in NovaHeal.
___
### SQL CONCEPTS USED:
 + DDL (create,alter,drop)
 + DML (insert,update,delete)
 + Joins: inner,left,right
 + Nested and Correlated Subqueries
 + Triggers for automatic operations
 + Stored Procedures and Functions
 + Cursors and Views
___
### DEMO SCREENSHOTS:



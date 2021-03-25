LearnToday-RESTAPI
===


## Tools 
1. Spring Tool Suite
2. MySQL
3. Git 
4. GitHub

## Features
* Find all the courses
* Find course by courseId
* Find all the courses (sort by start date)
* Save the Enrollment details 
* Delete the Enrollment details
* Trainer can Sign Up
* Trainer can change the password


## Database Setup
```gherkin=
-------- Create a DB --------
create database LearnTodayRESTAPIDb;
use LearnTodayRESTAPIDb;


---- Create a table Course  ----
CREATE TABLE IF NOT EXISTS `Course` (
  `CourseId` INT PRIMARY KEY,
  `Title` VARCHAR(200),
  `Fees` FLOAT,
  `Description` VARCHAR(2000),
  `Trainer` VARCHAR(100),
  `Start_Date` DATE
);
DESCRIBE COURSE;
---- Insert values into Course Table ----
INSERT INTO Course VALUES
(1001,"Flutter Dev",45000,"Flutter is a Framework used for creating cross platform application","Jesika","2021-04-01"),
(1002,".NET Core",56000,".NET is a Framework used for creating cross platform application","John","2021-06-16"),
(1003,"Angular",70000,"MEAN Stack Course","Maximillan","2021-05-01");

SELECT * FROM Course;

---- Create a table Student  ----
CREATE TABLE IF NOT EXISTS `Student` (
  `EnrollmentId` INT PRIMARY KEY,
  `StudentId` INT NOT NULL,
  `CourseId` INT NOT NULL,
  FOREIGN KEY (CourseId) references Course(CourseId)
);
DESCRIBE student;
---- Insert values into Course Table ----
INSERT INTO Student VALUES 
(3001,4001,1001),
(3002,4002,1002);

SELECT * FROM Student;

CREATE TABLE Trainer(
	TrainerId int primary key,
    Password varchar(100)
);
```

## Setup Instruction
* Clone this repository
* Run the SQL Database setup script
* In Spring Tool Suite, import this project as Maven project
* Provide your user name and password of MySQL Database in application.properties file
* Run this Maven Project by Run as Spring Boot App
* Open the postman and test all the end points 
* Port no: 51626

## Controllers
### Admin Controller

| Method Name | Functionality | Method Type | EndPoint|
| -------- | -------- | -------- | -------- |
| getAllCourses() | Fetch all the Courses from the database     | GET     | "/api/Admin"|
| getCourseById( @PathVariable("CourseId") int CourseId) | Search course by courseId     | GET     | "/api/Admin/{courseId}"|

### Student Controller
| Method Name | Functionality | Method Type | EndPoint|
| -------- | -------- | -------- | -------- |
| getAllCourses() | Fetch all the Courses from the database  (Order by Start Date)   | GET     | "/api/Student"|
| postStudent(@RequestBody Student student) | Save the Enrollment Details     | POST     | "/api/Student"|
| deleteStudentEnrollment( @PathVariable("id") int id) | Delete the Enrollment details    | DELETE    | "/api/Student/{id}"|

### Trainer Controller
| Method Name | Functionality | Method Type | EndPoint|
| -------- | -------- | -------- | -------- |
| trainerSignUp( @RequestBody Trainer trainer)| Save the Trainer Details  | POST     | "/api/Trainer"|
| updatePasssword( @PathVariable int id, @RequestBody Trainer trainer) | Update the Trainer Password | PUT    | "/api/Trainer/{id}"|

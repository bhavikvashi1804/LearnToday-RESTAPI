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
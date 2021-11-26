create database if not exists `testing_system`;
drop database if exists `testing_system`;
create database if not exists `testing_system`;
use `testing_system`;
create table `department`(
departmentID int,
departmentName varchar(50)
);
create table `position`(
positionID int,
positionName varchar(50)
);
create table `account`(
accountID int,
email varchar(50),
username varchar(50),
fullname varchar(50),
departmentID int,
positionID int,
createdate date
);
create table `group`(
groupID int,
groupName varchar(50),
creatorID int,
creatorDate date
);
create table `group account`(
groupID int,
accountID int,
joindate date
);
create table `type question`(
typeID int,
typeName varchar(50)
);
create table `categoryquestion`(
categoryID int,
categoryName varchar(50)
);
create table `question`(
questionID int,
content varchar(50),
categoryID int,
typeID int,
creatorID int,
createdate date
);
create table `answer`(
answerID int,
content varchar(50),
questionID int,
iscorrect varchar(50)
);
create table `exam`(
examID int,
Code int,
title varchar(50),
categoryID int,
duration int,
creatorID int,
createdate date
);
create table `examquestion`(
examID int,
questionID varchar(50)
);
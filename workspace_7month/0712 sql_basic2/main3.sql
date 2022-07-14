Drop Database my_Db;

use sakila;
create database my_db;

create table students (
number int primary key,
name varchar(10),
age int,
score double
);

desc students;

insert into students(number, name, age, score) values (1234, '길동', 20, 3.3);
insert into students(number, name, age, score) values (1234, '둘리', 30, 4.3);
-- primary key에는 null 못넣음.
-- pricary key는 map의 key의 역할. 중복값 넣을 수 없음.
-- 테이블은 key가 있어야 제 역할을 함.

select * from students;

create table books (
	bookid int primary key auto_increment,
    -- auto_increment: 자동으로 붙여주는 id;
    title varchar(30),
    price int
);

desc books;

insert into books (title, price) values ('중복책', 2000), ('중복책', 2000), ('중복책', 2000), ('중복책', 2000);
delete from books where bookid = 3;
select * from books;
insert into books (title, price) values ('중복책', 2000), ('중복책', 2000);

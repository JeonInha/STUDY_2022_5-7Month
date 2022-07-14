create table students (
name varchar(10),
age int,
score double
);

desc students;

insert into students(name, age, score) values ('길동', 20, 3.3), ('둘리', 10, 2.2);
-- sql에서 소수점은 반올림
-- 데이터베이스에서는 같은 값의 데이터도 여러개 넣을 수 있음.
select * from students;
delete from students where name = '길동';

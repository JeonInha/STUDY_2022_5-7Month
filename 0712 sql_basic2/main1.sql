create database my_db;

show Databases;

use my_db;

show Tables;
-- '열' 과 '행'으로 이루어진 나만의 데이터베이스: 테이블 생성
-- 사람 테이블 / 열1 이름 문자열 / 열2 나이 정수
create Table persons (
	name varchar(10),	-- 문자열 10글자
    age int
);
-- 한 이름 당 테이블은 하나여야 하기 때문에 두번 실행하면 오류!(이미 만들어진 테이블이 있어서)

desc persons;

insert into persons (name, age) values ("카샤", 36);
insert into persons (name, age) values ("체리", 32);
insert into persons (name, age) values ("티라노", 30);

select *
from persons;

insert into persons (name, age) values ("브루스 리", 30);
insert into persons (name, age) values ("스티븐 킹", 40);
insert into persons (name, age) values ("철수", 10), ("철수", 20), ("철수", 30);

delete from persons;
-- 전부 지우기

drop table persons;
-- 테이블 자체를 삭제

create table book (
	name varchar(50),
    price int
);

insert into book (name, price) values ("파워자바", 25000), ('하늘과 바람과 별과 시', 15000), ('꽃을 보듯 너를 본다', 12000);
select * from book;

/*
-- 문자열 표현
char(4) : 고정사이즈. 남은 자리는 공백으로 채움(물론 값 받아올 때 공백은 지워짐)
varChar(4) : 가변사이즈. 길이정보가 포함됨.
못들었으니까 필기베끼기 
-- 빈칸 제거 함수 Rtrim('a         '); // 우측 공백 제거
ltrim('        a'); 좌측 공백 제거
*/
/*
-- 정수 표현
int
long
bingint
*/

create table testChar (
fixLength char (5),
varLength varchar(5)
);

insert into testchar (fixlength, varlength) values ('a', 'a');
select concat (fixlength 'b'), concat(verlength 'b') from testChar;

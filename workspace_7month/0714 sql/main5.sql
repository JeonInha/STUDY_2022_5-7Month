desc books;

Alter table books change column title title varchar(30) not null; 

insert into books (title) values ('디폴트확인');
select * from books;

create table myPractice (
	colName1 varchar(50) default '2392sda'
    );
insert into myPractice () values ();

select * from myPractice;

select * from my_db.test;
-- 문자열 pk의 특징: index를 가짐.

-- 효율, 속도: execution plan 탭에서 빨간 박스(시간이 오래걸리는 것) 확인

-- 여러 컬ㄹ럼에 pk 줄 수 있음;; 그러면 여러컬럼의 값이 모두 같아야만 중복값으로 인식. ex: '과목' '선생' column에 둘다 pk를 주면 
-- 튜플 1(영어, 티라노) / 튜플 2(영어, 카샤) 는 다른 튜플이라 문제가 없음.
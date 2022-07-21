select * from new_view
where employee_id = 100;

select count(*) from new_view;

select * from new_view as a 
left join locations as b
on a.location_id = b.location_id;

-- view는 그냥 테이블!!

select * from sumavgcountemp;

use my_db;
select * from diner;

select * from menu;

select * from new_view
where name = "도연정";

create table persons_copy like person;
-- 테이블 복제. 그러나 내용은 복제 XX

select * from persons_copy;

insert into persons_copy 
select *
from person;
-- 데이터 복제

create table persons_copy2
select myint, mydouble from person;
-- 그냥 복제한 새 데이타베이스

select * from persons_copy2;

create temporary table mytable (
	myNum int,
    myStr varchar(100)
);

select * from mytable;
insert into mytable values(1, 'a');
-- 임시테이블. 세션을 종료하면 사라짐.
-- 테스트할때나, 결과테이블을 만들때 조작을 위해서나 ... 임시로 사용하면 됨

procedure new_procedure();

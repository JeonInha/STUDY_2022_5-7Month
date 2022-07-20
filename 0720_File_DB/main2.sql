select 1, 2, 3
union
select 4, 5, 6
union
select 6, 7, 8
union all
select 1, 2, 3;
-- union: 중복되는 행은 distinct처리 해줌.
-- 합집합.

-- union all: 중복 신경쓰지 않고 다 붙임.

select * from my_db.books;
select * from books where price Between 1000 and 10000
union All
select * from books where title like '%책';

use sakila;
select * from books, test;
-- , 로 2개를 하면 크로스조인 : 곱연산 일어남



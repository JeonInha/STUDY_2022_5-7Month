-- 집계 ~~~~~ 통계
select * from employees;
select count(*) from employees;
-- 집계 함수
-- 이거 왜 여깄냐
select

-- 전화번호가 515로 시작하는 직원을 조회하는 쿼리문
select * from employees where PHONE_NUMBER like '515%';

-- 전화번호가 515로 시작하는 직원의 수를 조회하는 쿼리문
select count(*) from employees where PHONE_NUMBER like '515%';

-- 연봉의 총합
select sum(salary) from employees;

-- 연봉의 평균
select avg(salary) from employees;

-- 최대9
select max(salary) from employees;

-- 최소
select min(salary) from employees;

-- 최대와 최소의 차
select max(salary)-min(salary) from employees;

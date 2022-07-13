
-- 각 직원들의 이름과 연봉, (평균연봉 - 연봉)을 조회해보세요
select FIRST_NAME, last_name, salary, salary - (select avg(salary) from employees)  as '(평균연봉 - 연봉)'
	from employees;

-- 최고 연봉자와 최저 연봉자의 이름을 조회
select FIRST_NAME, LAST_NAME, salary 
	from employees 
	where salary = (select salary from employees order by salary desc limit 1) 
	or salary = (select salary from employees order by salary asc limit 1);
    
-- 평균보다 높게 받는 직원들 조회
select *
	from employees
    where salary > (select avg(salary) from employees);

-- 부서명이 it로 시작하는 직원들의 수(카운트) 조회
select count(*)
	from employees
    where DEPARTMENT_ID in (select department_id from departments where department_name like 'it%');

-- douglas Grant의 이메일을 'dog@naver.com' 으로 변경
update employees 
	set EMAIL = 'dog@naver.com'
    where First_Name = 'douglas' and last_name = 'Grant';

-- Ellen Abel과 같은 부서에서 근무하는 직원을 연봉 내림차순으로 정렬해서 조회
select *
	from employees
    where DEPARTMENT_ID = (select DEPARTMENT_ID from employees where FIRST_NAME = 'Ellen' and LAST_NAME = 'Abel')
    order by salary desc;

-- 부서명이 it로 시작하는 부서에서 근무하는 최고연봉자보다 높은 연봉을 받는 직원 목록을 
-- 연봉 오름차순으로 조회
select *
	from employees
    where salary > (select max(salary) from employees where DEPARTMENT_ID in
    (select DEPARTMENT_ID from departments where DEPARTMENT_NAME like "it%"))
    order by salary asc;
    -- 왜 안나오지??????????? (오타...,.)

-- 자기가 속한 부서의 평균연봉보다 많은 연봉을 받는 직원
select *
	from (select * from employees order by DEPARTMENT_ID) as a
    where salary > (select avg(salary) from employees where DEPARTMENT_ID =);
-- hr 부서(departments) 테이블 모든 행과 열 조회
use hr;
select * from departments;
select * from departments where department_name like 'it%';

select * from employees where departMent_id in (
	select department_id from departments where department_name like 'it%');
    -- subquary: quary문 아래에 삽입된 부가 쿼리문
    
select * from (select * from employees order by salary desc limit 10) as a order by salary asc;
-- 별명 없으면 에러남에 주의

-- david austin과 같은 연봉을 받는 직원들 조회
select (select 1+1), 2, 3, 4;

select * from employees where first_name = 'david' and last_name = 'austin';
select * from employees where salary = (select salary from employees where first_name = 'david' and last_name = 'austin');
-- 부서 ID가 90인 직원들의 인원 수
show databases;
use hr;
select count(*) from employees
	where department_id = 90;
    
select count(*) from employees
	where department_id = 60;
    
select count(*) from employees
	where department_id = 30;
    
select count(*), department_id from employees group by Department_id;
-- 같은 원자값을 가진 것끼리 그룹을 지어서 보여줌. 중복을 제거할 때 쓸 수 있음.

select Max(salary), min(salary), avg(salary), sum(salary), count(*) 
	from employees group by department_id;
    
-- 또 달리 중복을 제거할 때 쓸 수 있는 것이 distinct.
select distinct job_id from employees;

-- group by와 distinct를 알아두기....


--  한 20분쯤 놓침 ......

-- 상위 연봉 50명에 대해서 부서별로 몇명씩 있는지 조회
select count(*), DEPARTMENT_ID
	from (select * from employees order by salary desc, first_name limit 50) as a 
		group by DEPARTMENT_ID
    order by first_name;


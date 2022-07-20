/*
부서 테이블 -- (employees.department_id ---> departments.department_id)
직책 -- (employees.job_id ---> job.job_id)
매니저 -- (departments.MANAGER_ID ---> employees.employee_id)
위치 == locations.location_id
1. 모든 부서의 부서명과 관리자의 이름 조회
2. 부서명이 it로 시작하는 부서명과 거기서 근무하는 직원의 이름 조회
3. 모든 직원들의 이름과 직책(job_title) 조회
4 직원의 해당 직책의 job 테이블에 책정된 최대 연봉(MAX_SALARY)을 초과한 연봉을 받는 직원 목록
5 부서의 (COUNTRY_ID)가 'US'인 부서에서 근무하는 직원명과 부서명
*/

-- 1.
select D.department_name, concat(FIRST_NAME, " ", LAST_NAME) as 'Manager_Name' from departments as D
inner join employees as E on D.manager_id = E.employee_id; 

-- 2.
-- 이거이상함... it부서가 5명이야??
select department_name, employee_id, ConCat(First_name, " ", last_name) as name from departments as D
join employees as E on  E.Department_Id = D.department_id
where department_name like "it%";

-- 3
select ConCat(First_Name, " ", Last_Name) as Name, Job_title from employees as E
join jobs as J on  E.JOB_id = J.job_id;

-- 4 직원의 해당 직책의 job 테이블에 책정된 최대 연봉(MAX_SALARY)을 초과한 연봉을 받는 직원 목록
select ConCat(First_Name, " ", Last_Name) as Name, MAX_SALARY, Salary from employees as E
join jobs as J on E.JOB_id = J.job_id
where Max_Salary <= stest_textgametest_textgametest_textgamealary;

-- 부서의 (COUNTRY_ID)가 'US'인 부서에서 근무하는 직원명과 부서명
-- us location_ID
select department_name, ConCat(First_Name, " ", Last_Name) as Name from employees 
join departments on employees.department_id = departments.department_id
 where LOCATION_ID in (select Location_ID from locations where country_id = 'US');



select * from departments;
-- department_id / department_name / manager_id / location_id
select * from employees;
-- employee_id / first_Name / last_Name / Email / ... Manager_ID / Department_Id;
select * from jobs;
-- JOB_id / job_title / min_salary / max_salary
select * from locations;
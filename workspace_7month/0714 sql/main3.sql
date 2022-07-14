-- mysql 기타 데이터 타입
-- date type
-- time type
-- datetime / timestamp

select current_date(); -- 현재날짜 알려줌
select current_time(); -- 현재시각 알려줌
select current_timestamp(); -- 현재 날짜와 시간을 알려줌

select date '2022-07-14';
select time '12:05:33';

-- hire_date가 1987년 6월인 직원들(스티븐킹 - 루이스 팝)
select * from employees
	where HIRE_DATE between '1987-06-01' and '1987-06-30';

-- mysql은 정수합연산을 지원 안함. 합연산 하고싶으면 함수 쓰자.
select addDate('1987-06-01', 40); -- 날짜 더하기
select subDate('1987-06-01', 1); -- 날짜 빼기
select date_add('1987-06-01', interval 40 month); 
-- 뒤의 인자를 정수가 아니라 기간을 표현하는 데이터형으로 받음
-- '인터벌' 사용
select '1987-06-01' + interval 40 month;
-- 기간 합연산은 지원

select dayofweek('2022-07-14'); -- 1 일요일

select extract(year from '2022-07-14');
select extract(month from '2022-07-14');
select extract(day from '2022-07-14');
-- year, month, day 등의 값 구하기

select datediff('2022-06-14', '2022-04-14');
-- 간격 구하기 (일수)(미래-과거(반대로 하면 음수 나옴))

select str_to_date('1999-12-12', '%Y-%m-%d');
-- 서식문자는 대소문자 구분하는듯 ...?
-- 문자열을 형식 갖춘 날짜로.
select date_format(Date '2021-06-13', '%y/%M/%D');
-- 날짜를 우리가 원하는 형태의 문자열로.


-- 연습
-- 직원테이블: 17일에 고용된 직원 목록
select * from employees
	where extract(day from Hire_date) = 17;
select * from employees
	where hire_date like '%-17';

select *, datediff(end_Date, start_date) as inter from job_history;

-- 형변환
select cast(10 as char);
select cast(10 as time);
select cast('10' as double) + 5.5;

select convert(10, char);
select convert(10, time);
select convert('10', double) + 5.5;

-- cast와 convert는 완전히 같은 기능의 함수.
-- 다른 언어들끼리 영향받고 합쳐지구 카피하구하는과정에서 일케 된다구...



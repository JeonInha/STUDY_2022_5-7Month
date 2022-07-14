select * from employees;

-- 문자열 가공 함수
select lower ('abcde'); -- 소문자로
select upper('abcde'); -- 대문자로

select reverse('asdf'); -- 로꾸거

select concat ('문자열', '결합', '함수'); -- 합체
select concat ('결합', null, '값이 있으면?'); -- 그러나 null이 있으면 null 반환

select char_length('문자열길이'); -- 문자열길이

select replace('원본문자열에서 변환합니다', '변환', '야호!'); -- a 문장에서 b를 c로 변환

select substring('employees', 5); -- 문자열, 자를 위치
select substring('employees', 5, 2); -- 문자열, 자를 위치, 개수
select substring('employees', -3); -- 음수일 때 우측에서부터 위치를 세어나감
select substring('employees', -3, 2);

select lpad("123", 5, 'ㅈ'); -- a의 문자열이 b의 길이수가 될 때 까지 c를 좌측에 결합(넘치면 자름)
select rpad ('456', 5, '*');-- a의 문자열이 b의 길이수가 될 때 까지 c를 우측에 결합(넘치면 자름)
select repeat('반복결합', 5); -- b횟수만큼 a를 반복해서 결합

select locate ('DE', 'ABCDEFG'); -- b의 문자열에서 a의 위치 찾기 (없으면 0)
-- 자바와는 다르게 1부터 시작.
select locate ('위치', '문자열의 위치를 찾는데 sql의 위치는 1부터임!!!', '위치');
-- b의 문자열에서 a의 위치를 찾는데 시작점이 c.

-- 직원번호 휴대폰번호 끊기
select FIRST_NAME, LAST_NAME, 
		substring(phone_number, '1', '3') as phoneNum_front,
        substring(phone_number, '5', '3') as phoneNum_middle,
        substring(phone_number, '-4', 4) as phoneNum_middle
	from employees;
    
-- 직원번호 테이블 전화번호 앞자리 3자리로 그룹지어 갯수

select substring(phone_number, '1', '3') as phoneNum_front, count(*)
	from employees group by phoneNum_front;

-- 정수, 실수 다루는 함수
select rand(); -- 이게뭐람 (0 ~ 1 사이의 난수 생성인듯)
select round(123.123, 2);
select floor(1.555); -- 바닥: 내림
select ceil(); -- 천장: 올림
select abs(-55); -- 이게뭐냐면 음수 / 양수 전환
select pow(2, 8); -- 제곱인듯

select pi();

-- 주사위
select ceil(rand() * 6);

-- mysql 메뉴얼: 
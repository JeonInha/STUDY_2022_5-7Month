-- null에 대체값을 넣기
select name, 
	case when 
    lifeExpectancy is null then 0.0
    else lifeExpectancy 
    end as '기대수명'
	from country;
    
    
-- 직원 이름 성 결합시킨 full name
-- 전화번호가 011로 시작하는 경우 개인전화, 그 외의 경우 내선번호라고 조회

select Employee_id, 
		concat(first_name, ' ', last_name) as fullName, 
		phone_number,
		case when substring(phone_number, 1, 3) = 011  then '개인전화' 
		else '내선번호' end as '분류'
	from employees;
    
select case when 10>5 then '10은 5보다 큽니다'
	else '왼쪽이 오른쪽보다 작거나 같습니다'
    end;
    -- case when a then b, 
    -- 		when c then d,
    -- 		else c end;
    -- = if (a) { b } 
    -- 		else if(c) { d } 
    -- 		else { c };
    
-- null을 대체해주는 함수
select ifnull('첫번째', '두번째');
-- 첫번째가 null이면 두번째; 중첩하여 쓸 수 있음.

-- 헷갈리기 쉬운 함수**
select nullif('a', 'b');
-- a와 b가 같으면 null, 아니면 a 출력
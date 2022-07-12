-- 세션(session) 변수(variable)

set @myVar := 10;
 -- set 변수 선언,
 -- @변수이름
 -- := 대입연산자
 
 select @myVar*10+5;
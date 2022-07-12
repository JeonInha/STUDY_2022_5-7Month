-- 패턴검색
-- 비슷한것들을 찾을 때 사용
select *
	from country
    where name like '%korea%';
-- %%: 이 문자위치에 다른 글자가 올 수 있음 (안올수도 있고)

select *
	from country
    where name like 'k%';
    -- k로 시작하는 이름
    
select *
    from country
    where name like '%k';
    -- k로 끝나는

select *
from country
where name like 'a%a';
  -- a로 시작하고 a로 끝나는
  
  select *
from country
where name like 'a____a';
  -- a로 시작하고 a로 끝나는 근데 6글자인 국가
  
select *
	from country
	where name like '%ria';
    
select *
from country
where region like 'north%';

select *
from country
where region not like '%a%a' and region not like 'a%a%';
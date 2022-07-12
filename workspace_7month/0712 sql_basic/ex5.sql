-- 갯수로 제한을 주기
select *
from country limit 5;

-- 인구가 가장 많은 1개의 국가 조회하기
select *
from country
order by population desc
limit 1;

-- countinent가 asia 인 국가들 중 면적이 좁은 10개 국가
select *
from country
where continent = 'asia'
order by SurfaceArea
limit 10;


-- region이 '~africa'로 끝나는 국가들 중 독립연도가 가장 최근인 10개 국가a
select *
from country
where region like '%africa'
order by indepyear desc
limit 10;

-- 면적당 인구비율(sfa / pop) 탑 10 국가

select *, (Population / SurfaceArea) as '인구밀도'
from country
order by 인구밀도 desc
limit 20;

select *, (gnpold - gnp) as '변화량'
from country
order by 변화량 desc
limit 10;

select *
	from country
    limit 10 offset 0;
    -- offset: 특정 칸만큼 건너뛰기

select *
	from country
    limit 10 offset 10;
    
select *
	from country
    limit 10 offset 20;
    
-- paging 처리
    
    

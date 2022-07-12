select code as "코드", name as '이름', population as '인구' from country;
-- as : column 이름에 별명을 지어줄 수 있음.
-- 위의 조회+surfaceArea(별명 면적) 컬럼을 추가로 조회
select code as "코드", name as '이름', population as '인구', SurfaceArea as '면적', 15+15 as '계산결과', round(population/surfaceArea, 1) as "인구밀도" from country;
-- round(a, b) :a값을 b단위만큼 반올림해줌 
-- 이런식으로 정보를 가공하고 계산하는 기능을 수행할 수 있음.

-- surfaceArea가 50 000 이하면서 population이 10 000 000 이상인 국가의 인구밀도 조회

select code as "코드", name as '이름', population as '인구', SurfaceArea as '면적',
 15+15 as '계산결과', round(population/surfaceArea, 1) as "인구밀도"
 from country
 where surfaceArea <= 50000 and population>=1000000
  order by 인구 asc; 
  -- 오름차순일 땐 asc 생략가능 (오름차순이란 뜻. asc가 디폴트)
  -- 내림차순: desc 
  -- 여기서부터는 select이 이루어지고 난 후의 작업이라 별명으로도 지정이 됨
  
  -- 아시아 대륙 국가들의 인구 순으로 (내림차순)
  select *
	from country
	where continent = 'asia'
	order by population desc;
    
-- LifeExpectancy 오름차순으로 조회
select *
	from country
    where LifeExpectancy is not null
    order by LifeExpectancy;
    
-- 국가 이름, 인구, gnp, gnpold를 조회
select name, population, gnp, gnpold, (gnpold - gnp) as '변 화량'
	from country
	where (gnpold - gnp) is not null
    order by `변 화량` desc;
    -- column 이름에는 스페이스를 넣지 말자.
    -- ` 를 띄어쓰기를 포함한 객체 이름을 감쌀 때 사용

-- 대륙 순으로 정렬해서 조회
select *
	from country
    order by continent, population;
    -- 정렬 기준을 2개 줄 수 있음. 앞의 것이 1차 기준, 동일한 값을 가지는 행들끼리 2차기준으로 정렬됨

-- governmentform 오름차순, gnp 내림차순 정렬 조회
select *
	from country
    order by GovernmentForm asc, gnp desc;
select /*보고싶은거- *는 모든 것을 선택함*/* from /*어디서 볼건지*/country;
-- 국가 정보가 저장되어있는 테이블을 몽땅 불러왔음!
select * from city;

select Name, Population  from city; -- column 명을 적어서 그것만 조회가능
-- column명도 대소문자를 신경쓰지 않는다! 파일이름 포함 모든걸 신경 안쓰는듯 ..?

desc country; -- 해당 테이블을 설명해줌. 테이블의 구조 출력.

-- country 테이블에서 code 열과 gnp열을 조회해보세요
select gnp, code from country;

select * from country where code='kor';
-- where : 특정한 조건의 행의 모든 컬럼 조회.
-- 문법: where 조건식

select * from country where name='japan' or name = 'china' || name='korea';
select name, region  from country where continent='Asia'; 
select * from country where population>=40000000 and population<=50000000;
select * from country where Continent<>'Asia';

select* from country where name in('south Korea', 'china', 'france');
-- 값 나열할 때 쓰는 in
select* from country where population between 40000000 and 50000000;
-- ~ 사이에 있다를 나타낼 때 쓰는 between
select* from country where population not between 400000 and 500000;
-- 부정어 not
select* from country where (continent not in ('North America', 'Europe', 'asia')) and (Gnp between 100 and 1000);


select* from country where indepyear is null;
-- null은 is 연산자를 사용
select* from country where indepyear is not null;
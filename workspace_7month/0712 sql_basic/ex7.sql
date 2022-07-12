set @rowCount := 239;
set @pageNumber := 1; -- 1페이지
set @pagePer := 10; -- 1페이지 당 10개
set @totalPage := @rowCount / @pagePer; -- 총 페이지 수가 몇개가 되는지.

-- 239행을 가지는 country 테이블을 각 페이지별 행의 갯수와 보고자 하는 페이지 번호를 정하면
-- 해당 row들을 조회할 수 있는 select 문을 작성해보기

select *
	from country
    limit @pagePer offset @pageNumber;
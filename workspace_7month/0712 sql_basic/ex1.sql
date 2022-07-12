/*DataBase:: 
데이터베이스는 각각의 정보를 Table로 관리
Table은 2차원 배열로 이루어짐.

  - column: 열
  - row: 행

서로 관계가 있는 정보를 하나의 테이블로 모아놓고, 
그런 테이블끼리 관계를 맺으면서 관계형 데이터베이스라고 부름

port: 통로
1 ~ 6535를 쓰는데 그 중에서도 1~1000은 사용하지 않음
mysql은 3306을 씀
포트번호가 중요한게아니라 포트란게 있더라 ~ 가 중요

mysql은 데이터베이스를 schemas라고 부름
*/

show databases;	-- 보는 명령어
use world; -- 어떤 데이터베이스를 사용하고 있는지 꼭 확인!! world라는 데이터베이스를 사용함.
show Tables;
-- ctrl + shift + enter 전부 실행 단축키
-- ctrl + enter 한줄 실행 단축키

select 3%3; -- 산술연산 가능
select 'hello world'+'concat??';  -- 문자열 합연산 수행 X, 문자열은 홑따옴표 혹은 쌍따옴표로
select 1=1; -- 관계연산: 같으면 1, 다르면 0 
select 1<>1; -- not의 의미인 관계연산자
-- 나머지 관계연산자는 자바와 같음
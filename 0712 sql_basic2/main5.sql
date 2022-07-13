-- 식당 정보 테이블
-- 상호명
-- 전화번호
-- 주소
create table diner (
	idCode int primary key auto_increment unique,
    name varChar(15) not null,
	tel char(10) not null unique,
    adress varChar(100) not null
);

insert diner (name, tel, adress) 
value ("덴푸라야", '1231231234', '서면 진구'),
("라멘야", '1234567890', '서면 진구'),
('이떼', '0987654321', '서면 진구'),
('도연정', '1432569804', '서면 진구'),
('대모골', '4321236542', '서면 진구'),
('이가네 죽집', '4321236777', '서면 진구');

-- 메뉴 정보 테이블
-- 음식명
-- 가격
create table menu (
	idCode int primary key auto_increment unique,
    name varChar(15),
    price int
);

insert menu (name, price)
value ('텐동', 9000), ('돈코츠라멘', 6000), ('매콤닭가슴살샌드위치', 8900), ('칼국수', 12900),
('제육덮밥', 3000), ('단호박죽', 3400);


select * from diner;
select * from menu;
drop table menu;
Alter table menu add column dinerId int;
-- Alter: 이미 존재하는 개체의 특성을 변경하는 데이터 정의 언어(DDL) 명령.

update menu
	set dinerId = idcode-6;
-- update 하나의 행에서 특정한 정보값을 변경 혹은 삽입

Alter table menu add constraint Foreign key (dinerid) references diner (idcode);

desc menu;
-- 외래키: 테이블 사이에 강력한 연관이 있음을 알려줌







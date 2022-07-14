create table persons (
	personid int primary key auto_increment,
	firstName varchar(10) not null,
	lastName varchar(10) not null,
	age int not null,
    email varchar(50) not null unique
);
-- null을 허용하지 않음
-- unique: 중복 허용 x

insert into persons (firstName, lastName, age, email) values
	("길동", "홍", 20, "길동@net"),
    ("길동", "고", 42, "길동12@net");
    
select * from persons;

-- 테이블 이름
-- 각 열 (이름, 타입, 제약)
-- key 열alter-
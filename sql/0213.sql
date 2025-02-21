create database EZEN;
use EZEN;
create table USER_INFO(
UI_NUM INT primary key auto_increment,
UI_NAME VARCHAR(20) not null,
UI_ID VARCHAR(20) not null,
UI_PWD VARCHAR(20) not NULL
);

drop table USER_INFO;

insert into USER_INFO(UI_NAME, UI_ID, UI_PWD)
VALUES('홍길동','HONG','1234'),
('김길동','KIM','1234'),
('이길동','LEE','1234');

select * from USER_INFO
;

delete from USER_INFO
where UI_NUM=2;

update USER_INFO
set UI_NAME='성룡',
UI_ID='SUNG'
where UI_NAME='홍금보';


create table FOOD_INFO(
FI_NUM INT primary key auto_increment,
FI_NAME VARCHAR(30) not null,
FI_PRICE INT not null
);

insert into FOOD_INFO(FI_NAME, FI_PRICE)
values ('김밥', 3500),
('떡볶이', 4000),
('순대',4500),
('라면',5000),
('해장라면',6000);

select * from FOOD_INFO
where FI_PRICE >= 4000
and FI_NAME like '%라%';

update FOOD_INFO
set FI_PRICE = FI_PRICE+500;

select * from FOOD_INFO;

delete from FOOD_INFO
where FI_NUM>=6;

update FOOD_INFO
set FI_PRICE = FI_PRICE*1.1;

select * from FOOD_INFO
order by FI_NAME asc,
FI_PRICE asc; ##안쓰면 오름차순.asc.

##숫자 - 정수:TINYINT, INT  / 실수:FLOAT, DOUBLE
##문자 - CHAR, VARCHAR, TEXT, MIDIUMTEXT
##날짜 - DATE, TIME, DATETIME, TIMESTAMP
## - DATE_FORMAT(NOW(),'%y%m%d'), DATE_FORMAT(NOW(),'%H%i%s')
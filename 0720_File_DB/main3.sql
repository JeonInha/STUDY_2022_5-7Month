Select * from menu as a
left join diner as b on a.idcode = b.id;

select * from diner as a
left join menu As b on b.idCode = a.id;

Select * from menu as a
right join diner as b on a.idcode = b.id;

select * from diner as a
right join menu As b on b.idCode = a.id;

select * from diner as a
inner join menu As b on b.idCode = a.id;

select * from person;
select * from books;

select * from books as a
inner join person as b on a.owner = b.name;
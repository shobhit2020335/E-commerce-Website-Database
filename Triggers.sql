create table customercount(
count int 
);

CREATE TRIGGER ph_gap 
after insert on customer
for each row
update customercount
SET count=count+1;

CREATE TRIGGER ph_gap1  
after delete on customer
for each row
update customercount
SET count=count-1;

insert into customercount(count) 
select sum(0);
select * from customercount;
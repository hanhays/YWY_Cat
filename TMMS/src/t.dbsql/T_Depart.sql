create table depart(
did number(3) primary key,
dname varchar2(20) not null
)
insert into depart values(0,'����');
insert into depart values((select nvl(max(did),0)+1 from DEPART),'��������');
insert into depart values((select nvl(max(did),0)+1 from DEPART),'������');

select * from DEPART



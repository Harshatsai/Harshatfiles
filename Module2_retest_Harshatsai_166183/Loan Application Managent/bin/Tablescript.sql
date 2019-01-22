 create table Customer(Cust_id number(6) Primary Key,Cust_name Varchar2(25) Not null,Address Varchar2(25)Not null,Email Varchar2(30),MobileNo Varchar2(10));

Table created.

SQL> create sequence Cust_seq start with 10001;

Sequence created.


 insert into Customer values(Cust_seq.nextval,'Aamir','Pune','aamir@gmail.com',9878675645);

1 row created.

SQL> insert into Customer values(Cust_seq.nextval,'Sonail','London','sonail@gmail.com',9898876543);

1 row created.

SQL> insert into Customer values(Cust_seq.nextval,'Ranvir','Bangalore','ranvir@gmail.com',8178764323);

1 row created.

 CUST_ID CUST_NAME                 ADDRESS
---------- ------------------------- -------------------------
EMAIL                          MOBILENO
------------------------------ ----------
     10001 Aamir                     Pune
aamir@gmail.com                9878675645

     10002 Sonail                    London
sonail@gmail.com               9898876543

     10003 Ranvir                    Bangalore
ranvir@gmail.com               8178764323

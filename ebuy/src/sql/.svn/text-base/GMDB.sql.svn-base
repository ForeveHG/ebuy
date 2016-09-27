--用户表开始--

--新建用户表--
create table UserInfo(
       userId number(4) not null,
       userFirstName varchar2(20),
       userLastName varchar2(20),
       userloginName varchar2(20),
       userPWD varchar2(20),
       userEmail varchar2(40),
       userSex varchar2(10),
       userPic varchar2(20),
       userHobby varchar2(20),
       userBirthDate date,
       userMoney number(10,2)
);

--设置主键
alter table UserInfo
add constraint PK_UserInfo primary key (userId);

--设置默认值
alter table UserInfo
modify userMoney default 10000;

--创建序列
create sequence UserInfo_sequence
       increment by 1
       start with 1
       nomaxvalue
       nocycle
       cache 10;

--创建触发器
create or replace trigger UserInfo_trigger
before insert on UserInfo
for each row
  begin
    select UserInfo_sequence.Nextval into :new.userId from dual;
  end;


--添加数据
insert into UserInfo(userloginName,userPWD) values('Jirair','manager');
commit;

--查询用户表
select * from UserInfo;

--用户表结束--
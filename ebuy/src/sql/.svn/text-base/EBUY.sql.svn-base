prompt PL/SQL Developer import file
prompt Created on 2016年9月25日 by Administrator
set feedback off
set define off
prompt Creating GOODTYPE...
create table GOODTYPE
(
  gtbigid   VARCHAR2(50) not null,
  gtbigname VARCHAR2(50) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table GOODTYPE
  add constraint PK_GOODTYPE primary key (GTBIGID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt Creating GOODSMALLTYPE...
create table GOODSMALLTYPE
(
  gtsmallid   VARCHAR2(50) not null,
  gtbigid     VARCHAR2(50) not null,
  gtsmallname VARCHAR2(50) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table GOODSMALLTYPE
  add constraint PK_GOODSMALLTYPE primary key (GTSMALLID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
alter table GOODSMALLTYPE
  add constraint FK_GOODSMAL_FK_GTS_GY_GOODTYPE foreign key (GTBIGID)
  references GOODTYPE (GTBIGID);

prompt Creating GOODINFO...
create table GOODINFO
(
  gid        VARCHAR2(200) not null,
  gtsmallid  VARCHAR2(50),
  gname      VARCHAR2(200) not null,
  gprice     NUMBER(10,2) not null,
  ginventory NUMBER(10) not null,
  gtype      NUMBER(10) not null,
  gdesc      VARCHAR2(200),
  gpic       VARCHAR2(200) not null,
  gbrand     VARCHAR2(200),
  gcode      VARCHAR2(200) not null,
  gpre1      VARCHAR2(200),
  gpre2      VARCHAR2(200)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table GOODINFO
  add constraint PK_GOODINFO primary key (GID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
alter table GOODINFO
  add constraint FK_GOODINFO_FK_GOOD_G_GOODSMAL foreign key (GTSMALLID)
  references GOODSMALLTYPE (GTSMALLID);

prompt Creating MESSAGE...
create table MESSAGE
(
  mid      VARCHAR2(50) not null,
  mcontent VARCHAR2(3000) not null,
  userid   VARCHAR2(50) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table MESSAGE
  add constraint PK_MESSAGE primary key (MID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt Creating USERINFO...
create table USERINFO
(
  userid    VARCHAR2(50) not null,
  mid       VARCHAR2(50),
  uname     VARCHAR2(20) not null,
  usex      VARCHAR2(20) not null,
  utel      NUMBER(11) not null,
  uborndate DATE,
  uemail    VARCHAR2(50),
  urpic     VARCHAR2(100),
  uadress   VARCHAR2(200) not null,
  ustatue   VARCHAR2(20)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table USERINFO
  add constraint PK_USERINFO primary key (USERID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
alter table USERINFO
  add constraint FK_USERINFO_FK_MESSAG_MESSAGE foreign key (MID)
  references MESSAGE (MID);

prompt Creating LOGININFO...
create table LOGININFO
(
  userid     VARCHAR2(50) not null,
  uloginname VARCHAR2(20) not null,
  uloginpwd  VARCHAR2(20) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table LOGININFO
  add constraint PK_LOGININFO primary key (USERID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
alter table LOGININFO
  add constraint FK_LOGININF_FK_GID_USERINFO foreign key (USERID)
  references USERINFO (USERID);

prompt Creating MANAGER...
create table MANAGER
(
  mid   VARCHAR2(50) not null,
  mname VARCHAR2(50) not null,
  mpwd  VARCHAR2(20) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table MANAGER
  add constraint PK_MANAGER primary key (MID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt Creating NEWS...
create table NEWS
(
  nid      VARCHAR2(50) not null,
  ntitle   VARCHAR2(200) not null,
  ncontent VARCHAR2(3000) not null,
  ndate    DATE not null,
  ntype    VARCHAR2(50) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table NEWS
  add constraint PK_NEWS primary key (NID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt Creating ORDERINFO...
create table ORDERINFO
(
  ogid    VARCHAR2(50) not null,
  goo_gid VARCHAR2(200),
  gid     VARCHAR2(50) not null,
  gcount  NUMBER(10) not null,
  gprice  NUMBER(10) not null,
  oid     VARCHAR2(50) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table ORDERINFO
  add constraint PK_ORDERINFO primary key (OGID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
alter table ORDERINFO
  add constraint FK_ORDERINF_FK_OREDER_GOODINFO foreign key (GOO_GID)
  references GOODINFO (GID);

prompt Creating ORDERDEAIL...
create table ORDERDEAIL
(
  oid     VARCHAR2(50) not null,
  userid  VARCHAR2(50),
  ostatue NUMBER(10) not null,
  otime   DATE not null,
  ototal  NUMBER(10) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table ORDERDEAIL
  add constraint PK_ORDERDEAIL primary key (OID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;
alter table ORDERDEAIL
  add constraint FK_ORDERDEA_FK_OID_ORDERINF foreign key (OID)
  references ORDERINFO (OGID);
alter table ORDERDEAIL
  add constraint FK_ORDERDEA_FK_ORDER__USERINFO foreign key (USERID)
  references USERINFO (USERID);

prompt Loading GOODTYPE...
prompt Table is empty
prompt Loading GOODSMALLTYPE...
prompt Table is empty
prompt Loading GOODINFO...
prompt Table is empty
prompt Loading MESSAGE...
prompt Table is empty
prompt Loading USERINFO...
prompt Table is empty
prompt Loading LOGININFO...
prompt Table is empty
prompt Loading MANAGER...
prompt Table is empty
prompt Loading NEWS...
prompt Table is empty
prompt Loading ORDERINFO...
prompt Table is empty
prompt Loading ORDERDEAIL...
prompt Table is empty
set feedback on
set define on
prompt Done.

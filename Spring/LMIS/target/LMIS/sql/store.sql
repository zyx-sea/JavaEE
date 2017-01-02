create database store character set UTF8;
use store;
create table userinfo( /*用户表*/
   id varchar(32) primary key,
   name varchar(50),
   password varchar(32)
);
/*仓库表*/
create table store(
	id varchar(32) primary key,
	name varchar(32),/*仓库名称*/
	addr varchar(100),/*仓库所在地*/
	manager varchar(32) /*仓库管理人员，不关联userinfo表*/
);

/*货物表*/
create table goods(
	id varchar(32) primary key,
	name varchar(50),/*货物名称*/
	nm   varchar(10),/*货物简记内码,如阿斯匹林为ASPL*/
	unit varchar(10),   /*计量单位,1:个，2:GK,3:只，..*/
	amount numeric(10,2),/*库存数量*/
	storeid varchar(32),/*所在仓库ID*/
	constraint foreign key(storeid) references store(id)
);
/*出入库历史记录*/
create table history(
	id varchar(32) primary key,
	goodsid varchar(32),
	datetime varchar(19),/*出入库时间*/
	_type   char(1),/*类型1:入库，２：出库*/
	amount numeric(10,2),/*这次出入库的数量*/
	remain numeric(10,2),/*余量*/
	_user varchar(50),   /*操作员名称，直接保存名称，不引用userinfo表*/
	constraint foreign key(goodsid) references goods(id)
);
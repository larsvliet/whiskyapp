create table users (
	id BIGINT PRIMARY KEY,
	username varchar(64) not null,
	password varchar(48) not null,
	salt varchar(32) not null,
	accountNonExpired boolean not null,
	accountNonLocked boolean not null,
	credentialsNonExpired boolean not null,
	enabled boolean not null
);
alter table users add unique (username);

create table groups (
	id BIGINT PRIMARY KEY,
	name varchar(64) not null,
	description varchar(256) null
);
alter table groups add unique (name);

create table authorities (
	id BIGINT PRIMARY KEY,
	name varchar(64) not null
);
alter table authorities add unique (name);

create table group_authorities (
	groupid BIGINT not null,
	authorityid BIGINT not null
);
alter table group_authorities add unique (groupid, authorityid);
alter table group_authorities add foreign key (groupid) references groups(id);
alter table group_authorities add foreign key (authorityid) references authorities(id);

create table group_members (
	groupid BIGINT not null,
	userid BIGINT not null
);
alter table group_members add unique (groupid, userid);
alter table group_members add foreign key (groupid) references groups(id);
alter table group_members add foreign key (userid) references users(id);
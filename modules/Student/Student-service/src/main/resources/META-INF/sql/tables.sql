create table BMS_Student (
	uuid_ VARCHAR(75) null,
	rollNo LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	branch VARCHAR(75) null,
	email VARCHAR(75) null,
	mobile VARCHAR(75) null
);
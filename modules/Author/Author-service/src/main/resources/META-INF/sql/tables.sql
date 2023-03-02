create table Bms_Author (
	uuid_ VARCHAR(75) null,
	authorId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	id_ VARCHAR(75) null,
	name VARCHAR(75) null,
	authorBook VARCHAR(75) null
);
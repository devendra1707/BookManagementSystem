create table Bms_book (
	uuid_ VARCHAR(75) null,
	bookId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	author VARCHAR(75) null,
	date_ VARCHAR(75) null
);
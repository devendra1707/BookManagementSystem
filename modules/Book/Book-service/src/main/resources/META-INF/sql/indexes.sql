create index IX_CA439665 on Bms_book (name[$COLUMN_LENGTH:75$]);
create index IX_AD60FF9A on Bms_book (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A278A49C on Bms_book (uuid_[$COLUMN_LENGTH:75$], groupId);
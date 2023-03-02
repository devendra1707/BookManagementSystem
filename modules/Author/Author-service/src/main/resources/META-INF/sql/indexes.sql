create index IX_FB2C0567 on Bms_Author (name[$COLUMN_LENGTH:75$]);
create index IX_6F20FB9C on Bms_Author (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_24ABB91E on Bms_Author (uuid_[$COLUMN_LENGTH:75$], groupId);
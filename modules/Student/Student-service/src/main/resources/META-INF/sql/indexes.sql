create index IX_66153D49 on BMS_Student (name[$COLUMN_LENGTH:75$]);
create index IX_7A9B707E on BMS_Student (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_54A1FE80 on BMS_Student (uuid_[$COLUMN_LENGTH:75$], groupId);
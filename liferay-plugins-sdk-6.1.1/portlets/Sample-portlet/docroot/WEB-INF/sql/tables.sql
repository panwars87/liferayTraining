create table Cars_Cars (
	carId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	carName VARCHAR(75) null,
	carModel VARCHAR(75) null,
	carModelYear INTEGER,
	carColor VARCHAR(75) null
);

create table Vehicle_Cars (
	carId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	carName VARCHAR(75) null,
	carModel VARCHAR(75) null,
	carModelYear INTEGER,
	carColor VARCHAR(75) null
);

create table Vehicle_Truck (
	truckId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	truckName VARCHAR(75) null,
	truckModel VARCHAR(75) null,
	truckModelYear INTEGER,
	truckColor VARCHAR(75) null
);
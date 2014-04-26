create table LCert_Inventory (
	productId LONG not null,
	productName VARCHAR(75) null,
	productCode LONG not null,
	primary key (productId, productCode)
);
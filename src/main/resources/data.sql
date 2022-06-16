create table Wallets (
	id INT,
	name VARCHAR(255),
	description VARCHAR(255),
	balances DECIMAL(18,2),
	createDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	updateDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY (id)
);

insert into Wallets
(
	id,
	name,
	description,
	balances
)
VALUES
( 0001,
'Bank A',
'this bank is not real',
1000.00
)

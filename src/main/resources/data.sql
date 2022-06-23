insert into Wallets (name,description,balances, created_date,update_date) VALUES ('Checking CO','Checking account in CO ',1000,LOCALTIMESTAMP,LOCALTIMESTAMP);
insert into Wallets (name,description,balances, created_date,update_date) VALUES ('Saving CO','Saving  account in CO',15000,LOCALTIMESTAMP,LOCALTIMESTAMP);
insert into Wallets (name,description,balances, created_date,update_date) VALUES ('CashReward','Credit Card',-267.56,LOCALTIMESTAMP,LOCALTIMESTAMP);
insert into Wallets (name,description,balances, created_date,update_date) VALUES ('DoubleReward','this credit card has 5% cashback in gas purchase',-150,LOCALTIMESTAMP,LOCALTIMESTAMP);
insert into Wallets (name,description,balances, created_date,update_date) VALUES ('IRA','retirement account',26000,LOCALTIMESTAMP,LOCALTIMESTAMP);
insert into Wallets (name,description,balances, created_date,update_date) VALUES ('Cash','physical cash in my pocket ',200,LOCALTIMESTAMP,LOCALTIMESTAMP);

insert into wallet_transactions (store,description,category,amount,wallet,transaction_date,created_date,update_date) values ('McDonald','eating big mac','Eatout',-1.59,3,PARSEDATETIME('01/23/2022','MM/dd/yyyy'),LOCALTIMESTAMP,LOCALTIMESTAMP);
insert into wallet_transactions (store,description,category,amount,wallet,transaction_date,created_date,update_date) values ('Game Store','buying Nintendo','entertainment ',-150,3,PARSEDATETIME('02/14/2022','MM/dd/yyyy'),LOCALTIMESTAMP,LOCALTIMESTAMP);
insert into wallet_transactions (store,description,category,amount,wallet,transaction_date,created_date,update_date) values ('Transfer','to CO checking','transfer',-500,2,PARSEDATETIME('01/30/2022','MM/dd/yyyy'),LOCALTIMESTAMP,LOCALTIMESTAMP);
insert into wallet_transactions (store,description,category,amount,wallet,transaction_date,created_date,update_date) values ('Transfer','from CO saving','transfer',500,1,PARSEDATETIME('01/30/2022','MM/dd/yyyy'),LOCALTIMESTAMP,LOCALTIMESTAMP);
insert into wallet_transactions (store,description,category,amount,wallet,transaction_date,created_date,update_date) values ('Employer ','paydate','income',2000,2,PARSEDATETIME('01/01/2022','MM/dd/yyyy'),LOCALTIMESTAMP,LOCALTIMESTAMP);
insert into wallet_transactions (store,description,category,amount,wallet,transaction_date,created_date,update_date) values ('withdraw','take some cash from the checking CO','withdraw',500,6,PARSEDATETIME('01/05/2022','MM/dd/yyyy'),LOCALTIMESTAMP,LOCALTIMESTAMP);
insert into wallet_transactions (store,description,category,amount,wallet,transaction_date,created_date,update_date) values ('withdraw','take some cash from the checking CO','withdraw',-500,1,PARSEDATETIME('01/05/2022','MM/dd/yyyy'),LOCALTIMESTAMP,LOCALTIMESTAMP);
insert into wallet_transactions (store,description,category,amount,wallet,transaction_date,created_date,update_date) values ('payment','pay the money on CashRewards','payment',-300,1,PARSEDATETIME('01/06/2022','MM/dd/yyyy'),LOCALTIMESTAMP,LOCALTIMESTAMP);
insert into wallet_transactions (store,description,category,amount,wallet,transaction_date,created_date,update_date) values ('payment','pay the money on CashRewards','payment',300,3,PARSEDATETIME('01/06/2022','MM/dd/yyyy'),LOCALTIMESTAMP,LOCALTIMESTAMP);
insert into wallet_transactions (store,description,category,amount,wallet,transaction_date,created_date,update_date) values ('ExxonMobile','','transportation',-40,4,PARSEDATETIME('01/09/2022','MM/dd/yyyy'),LOCALTIMESTAMP,LOCALTIMESTAMP);
insert into wallet_transactions (store,description,category,amount,wallet,transaction_date,created_date,update_date) values ('Giant','buying food','grocery',-120,3,PARSEDATETIME('01/09/2022','MM/dd/yyyy'),LOCALTIMESTAMP,LOCALTIMESTAMP);
insert into wallet_transactions (store,description,category,amount,wallet,transaction_date,created_date,update_date) values ('Retirement','','Retirement',-100,2,PARSEDATETIME('01/28/2022','MM/dd/yyyy'),LOCALTIMESTAMP,LOCALTIMESTAMP);
insert into wallet_transactions (store,description,category,amount,wallet,transaction_date,created_date,update_date) values ('Retirement','','Retirement',100,5,PARSEDATETIME('01/28/2022','MM/dd/yyyy'),LOCALTIMESTAMP,LOCALTIMESTAMP);

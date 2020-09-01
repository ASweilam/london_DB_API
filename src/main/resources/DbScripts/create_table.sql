CREATE TABLE users
(
    id  		 SERIAL PRIMARY KEY,
    first_name   varchar(30) NOT NULL,
    last_name    varchar(30) NOT NULL,
    email        varchar(80) NOT NULL,
	ip_address   varchar(30) NOT NULL,
	latitude	 numeric(10,8) NOT NULL,
    longitude	 numeric(10,8) NOT NULL
);

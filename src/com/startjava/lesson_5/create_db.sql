CREATE DATABASE jaegers_db;

CREATE TABLE jaegers (
	id SERIAL PRIMARY KEY,
	modelname 		VARCHAR(50),
	mark			CHAR(6),
	heightjaeger	DECIMAL(4,2),
	weight			INT2,
	status			VARCHAR(10),
	origin			VARCHAR(30),
	launch			DATE,
	kaijuKill		INT2
);


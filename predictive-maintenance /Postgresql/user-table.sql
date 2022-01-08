CREATE TABLE IF NOT EXISTS users (
   	user_id serial PRIMARY KEY,
	username VARCHAR (500) UNIQUE NOT NULL,
	password VARCHAR (500) NOT NULL,
	email VARCHAR (300) UNIQUE NOT NULL,
	created_on TIMESTAMP NOT NULL,
    last_login TIMESTAMP
);

CREATE INDEX users_idx1 ON users (
   user_id, username
);

INSERT INTO users (username, password, email, created_on) VALUES ('test_user', 'pass12345', 'test@fuas.his', localtimestamp);
INSERT INTO users (username, password, email, created_on) VALUES ('indian_guy', 'curry12345', 'curry@chicken.org', localtimestamp);

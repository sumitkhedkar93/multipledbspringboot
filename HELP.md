# About
This is a springboot application demonstrating to connect to multiple postgresql Dbs by using JdbcTemplates.

# Pre-requisite
To run this application :
Create 2 or more servers of postgresql.
Create Database in postgresql. 
Create table 'user' using following command in both Db:
````
CREATE TABLE IF NOT EXISTS public."user"
(
id integer NOT NULL,
username text COLLATE pg_catalog."default",
CONSTRAINT user_pkey PRIMARY KEY (id)
)
````

# How to run
````
gradle clean build bootRun
````



DROP TABLE IF EXISTS PERSONS;

CREATE TABLE PERSONS
(
    name           VARCHAR(50),
    surname        VARCHAR(50),
    age            INT,
    phone_number   VARCHAR(12),
    city_of_living VARCHAR(50),
    PRIMARY KEY (name, surname, age)
);

INSERT INTO PERSONS
VALUES ('Anastasiya', 'Sharkouskaya', 24, '0734718720', 'Gothenburg');
INSERT INTO PERSONS
VALUES ('Viacheslav', 'Popov', 30, '0762348972', 'MOSCOW');
INSERT INTO PERSONS
VALUES ('Svetlana', 'Bob', 47, '0774569823', 'MOSCOW');
INSERT INTO PERSONS
VALUES ('Maria', 'Karimova', 18, '0734891235', 'Kursk');
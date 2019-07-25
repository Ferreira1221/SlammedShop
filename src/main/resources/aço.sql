DROP DATABASE IF EXISTS Aço;
CREATE DATABASE Aço;
USE Aço;

CREATE TABLE owners(
  owner_id INTEGER  NOT NULL,
  first_name CHAR(25) NOT NULL,
  last_name CHAR(25) NOT NULL,
  owner_wins INTEGER DEFAULT 0,
  PRIMARY KEY (owner_id, owner_name)
);

CREATE TABLE cars(
  car_id INTEGER AUTO_INCREMENT NOT NULL,
  car_brand CHAR(20) NOT NULL,
  car_model CHAR(20) NOT NULL,
  car_hp INTEGER NOT NULL,
  PRIMARY KEY (car_id, car_brand)
);

CREATE TABLE tires(
  tire_id INTEGER AUTO_INCREMENT NOT NULL,
  tire_brand CHAR(40) NOT NULL,
  tire_type CHAR(50) NOT NULL,
  PRIMARY KEY (tire_id)
);

CREATE TABLE suspension(
  suspension_id INTEGER AUTO_INCREMENT NOT NULL,
  suspension_brand CHAR(40) NOT NULL,
  suspension_type CHAR(40)NOT NULL,
  PRIMARY KEY (suspension_id)
);

CREATE TABLE cars_by_owner(
  owner_name CHAR(25),
  car_brand CHAR(20),
  PRIMARY KEY (owner_name, car_brand),
  FOREIGN KEY (owner_name) REFERENCES owners(owner_name),
  FOREIGN KEY (car_brand) REFERENCES cars(car_brand)
);

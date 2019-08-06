DROP DATABASE IF EXISTS aco;
CREATE DATABASE aco;
USE aco;

CREATE TABLE owners(
  owner_id INTEGER  NOT NULL UNIQUE AUTO_INCREMENT,
  owner_name CHAR(25) NOT NULL UNIQUE,
  created_at DATE,
  PRIMARY KEY (owner_id, owner_name)
);
INSERT INTO owners(owner_name, created_at) values ('Joao', '2019-05-10');
INSERT INTO owners(owner_name, created_at) values ('Goncalo', '2019-05-10');


CREATE TABLE cars(
  car_id INTEGER AUTO_INCREMENT NOT NULL UNIQUE,
  car_brand CHAR(20) NOT NULL UNIQUE,
  car_model CHAR(20) NOT NULL UNIQUE,
  car_hp INTEGER NOT NULL UNIQUE,
  updated_at CHAR(20),
  PRIMARY KEY (car_id, car_brand, car_model, car_hp)
);
INSERT INTO cars(car_brand, car_model, car_hp , updated_at) values ('VW', 'Golf', 420, '2016-12-09');
INSERT INTO cars(car_brand, car_model, car_hp , updated_at) values ('Peugeot', '106gti', 690, '2019-02-14');

CREATE TABLE electronics(
  elec_kit_id INTEGER NOT NULL AUTO_INCREMENT UNIQUE,
  elec_kit_name CHAR(20) NOT NULL UNIQUE,
  PRIMARY KEY (elec_kit_id, elec_kit_name)
);
INSERT INTO electronics(elec_kit_name) values ('hella');
INSERT INTO electronics(elec_kit_name) values ('stockControllers');

CREATE TABLE tires(
  tire_brand_id INTEGER AUTO_INCREMENT NOT NULL UNIQUE,
  tire_brand_name CHAR(40) NOT NULL UNIQUE,
  tire_type CHAR(50) NOT NULL UNIQUE,
  PRIMARY KEY (tire_brand_id, tire_brand_name, tire_type)
);
INSERT INTO tires(tire_brand_name, tire_type) values ('nankang', 'semiSlick');
INSERT INTO tires(tire_brand_name, tire_type) values ('bfGroodrich', 'sport');

CREATE TABLE suspension(
  susp_kit_id INTEGER AUTO_INCREMENT NOT NULL UNIQUE,
  susp_kit_name CHAR(40) NOT NULL UNIQUE,
  susp_type CHAR(40) NOT NULL UNIQUE,
  PRIMARY KEY (susp_kit_id, susp_kit_name , susp_type)
);
INSERT INTO suspension(susp_kit_name, susp_type) values ('jom', 'static');
INSERT INTO suspension(susp_kit_name, susp_type) values ('eibach', 'sport');

CREATE TABLE motor_stages(
  stage_id INTEGER NOT NULL AUTO_INCREMENT UNIQUE,
  stage_name CHAR(20) NOT NULL UNIQUE,
  PRIMARY KEY (stage_id)
);
INSERT INTO motor_stages(stage_name) values ('stage 1');

CREATE TABLE cars_by_owner(
  owner_id INTEGER NOT NULL,
  owner_name CHAR(25) NOT NULL,
  car_id INTEGER NOT NULL,
  car_brand CHAR(20) NOT NULL,
  car_model CHAR(20) NOT NULL,
  car_hp INTEGER(20) NOT NULL,
  PRIMARY KEY (owner_id,owner_name,car_id,car_brand,car_model,car_hp),
  FOREIGN KEY (owner_id) REFERENCES owners(owner_id),
  FOREIGN KEY (owner_name) REFERENCES owners(owner_name),
  FOREIGN KEY (car_id) REFERENCES cars(car_id),
  FOREIGN KEY (car_brand) REFERENCES cars(car_brand),
  FOREIGN KEY (car_model) REFERENCES cars(car_model),
  FOREIGN KEY (car_hp) REFERENCES cars(car_hp)
);
INSERT INTO cars_by_owner(owner_id, owner_name, car_id, car_brand, car_model, car_hp)
 values (1, 'Joao', 1, 'VW', 'Golf', 420);
 INSERT INTO cars_by_owner(owner_id, owner_name, car_id, car_brand, car_model, car_hp)
  values (2, 'Goncalo', 2, 'Peugeot', '106gti', 690);

CREATE TABLE car_specs(
  car_id INTEGER NOT NULL,
  car_brand CHAR(20) NOT NULL,
  car_model CHAR(20) NOT NULL,
  elec_kit_name CHAR(20) NOT NULL,
  elec_kit_id INTEGER NOT NULL,
  tire_brand_name CHAR(20) NOT NULL,
  tire_type CHAR(20) NOT NULL,
  stage_name CHAR(20) NOT NULL,
  PRIMARY KEY (car_id,elec_kit_id,tire_brand_name,tire_type,stage_name),
  FOREIGN KEY (car_id) REFERENCES cars(car_id),
  FOREIGN KEY (car_brand) REFERENCES cars(car_brand),
  FOREIGN KEY (car_model) REFERENCES cars(car_model),
  FOREIGN KEY (elec_kit_name) REFERENCES electronics(elec_kit_name),
  FOREIGN KEY (elec_kit_id) REFERENCES electronics(elec_kit_id),
  FOREIGN KEY (tire_brand_name) REFERENCES tires(tire_brand_name),
  FOREIGN KEY (tire_type) REFERENCES tires(tire_type),
  FOREIGN KEY (stage_name) REFERENCES motor_stages(stage_name)
);

INSERT INTO car_specs (car_id, car_brand,car_model, elec_kit_name, elec_kit_id,
  tire_brand_name, tire_type, stage_name)
  values (1, 'VW', 'Golf', 'hella', 1, 'nankang', 'semiSlick', 'stage 1');
INSERT INTO car_specs (car_id, car_brand,car_model, elec_kit_name, elec_kit_id,
    tire_brand_name, tire_type, stage_name)
  values (2, 'Peugeot', '106gti', 'stockControllers', 2, 'bfGroodrich', 'sport', 'stage 1');

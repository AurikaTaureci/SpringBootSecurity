INSERT INTO users(username,password,created_at) VALUES('Maria','$2a$10$/kK4B31J.73yIx4FtPKtwO734MFhxpHGEp2gBqQZ.0vDeQtIeL3..','2012-10-30');
INSERT INTO users(username,password,created_at) VALUES('Diana','$2a$10$iJjG3wvf11NJe63ZgVEBJeIQhh2r90aWmZyA/cb4xtl8GD25RcBfO','2023-10-15');



INSERT INTO authorities(name,user_id) VALUES('READ',1);
INSERT INTO authorities(name,user_id) VALUES('WRITE',2);

INSERT INTO projects(name,coordinator) VALUES('Germany',1);
INSERT INTO projects(name,coordinator) VALUES('Spain',1);
INSERT INTO projects(name,coordinator) VALUES('Norway',1);

INSERT INTO projects(name,coordinator) VALUES('France',2);
INSERT INTO projects(name,coordinator) VALUES('Hungary',2);


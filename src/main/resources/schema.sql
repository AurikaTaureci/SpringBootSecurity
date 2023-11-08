CREATE TABLE users(
    id TINYINT not null primary key auto_increment,
    username varchar(50) not null,
    password TEXT not null,
    created_at DATE NOT null
);


CREATE TABLE authorities(
    id TINYINT not null primary key auto_increment,
    name varchar(50) not null,
    user_id TINYINT not null,
    foreign key(user_id) references users(id)
);

CREATE TABLE projects(
    id TINYINT not null primary key auto_increment,
    name varchar(50) not null,
    coordinator TINYINT not null,
    foreign key(coordinator) REFERENCES users(id)
);







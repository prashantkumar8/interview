create table if not exists team
(
    id   SERIAL NOT NULL PRIMARY KEY,
    name varchar not null
);

create table if not exists developer
(
    id           SERIAL NOT NULL PRIMARY KEY,
    name         varchar not null,
    phone_number varchar not null,
    team_id      integer not null,
    notification_flag boolean default false
);
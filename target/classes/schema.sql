create table if not exists team
(
    id   integer identity,
    name varchar not null
);

create table if not exists developer
(
    id           integer identity,
    name         varchar not null,
    phone_number varchar not null,
    team_id      integer not null
);
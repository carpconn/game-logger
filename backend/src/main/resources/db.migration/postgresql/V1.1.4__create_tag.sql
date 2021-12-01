CREATE TABLE IF NOT EXISTS tag
(
    tag_id   SERIAL PRIMARY KEY,
    name     varchar(128) UNIQUE
);
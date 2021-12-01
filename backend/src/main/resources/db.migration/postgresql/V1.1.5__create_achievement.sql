CREATE TABLE IF NOT EXISTS achievement
(
    achievement_id SERIAL PRIMARY KEY,
    title          varchar(128),
    description    varchar(1024)
);
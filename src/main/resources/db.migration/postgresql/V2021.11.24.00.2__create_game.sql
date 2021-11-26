DROP TABLE IF EXISTS game;

CREATE TABLE game
(
    game_id      INT PRIMARY KEY,
    name         varchar(128) NOT NULL,
    start_date   DATE,
    end_date     DATE,
    hours_played REAL NOT NULL,
    rating       REAL
);
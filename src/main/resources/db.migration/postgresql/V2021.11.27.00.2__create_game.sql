CREATE TABLE IF NOT EXISTS game
(
    game_id      SERIAL PRIMARY KEY,
    name         varchar(128) NOT NULL UNIQUE,
    start_date   DATE,
    end_date     DATE,
    hours_played REAL NOT NULL,
    rating       REAL
);
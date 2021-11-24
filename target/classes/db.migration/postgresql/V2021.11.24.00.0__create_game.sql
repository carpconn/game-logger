CREATE TABLE game
(
    game_id      INT IDENTITY (1,1) NOT NULL,
    name         varchar(128) NOT NULL,
    start_date   DATE,
    end_date     DATE,
    hours_played REAL NOT NULL,
    rating       REAL,
    CONSTRAINT PK_game_id PRIMARY KEY (game_id)
);
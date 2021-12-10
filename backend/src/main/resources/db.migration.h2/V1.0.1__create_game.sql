CREATE TABLE game
(
    game_id      INT GENERATED ALWAYS AS IDENTITY (start with 1 increment by 1),
    game_name    varchar(128) NOT NULL UNIQUE,
    start_date   DATE,
    end_date     DATE,
    hours_played REAL NOT NULL,
    rating       REAL,
    CONSTRAINT PK_game_id PRIMARY KEY (game_id)
);
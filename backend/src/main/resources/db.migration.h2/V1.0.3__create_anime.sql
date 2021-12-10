CREATE TABLE anime
(
    anime_id        INT GENERATED ALWAYS AS IDENTITY ( start with 1 increment by 1),
    total_episodes  INT NOT NULL,
    current_episode INT NOT NULL,
    anime_name            varchar(128) NOT NULL UNIQUE,
    start_date      DATE,
    end_date        DATE,
    rating          REAL,
    CONSTRAINT PK_anime_id PRIMARY KEY (anime_id)
);
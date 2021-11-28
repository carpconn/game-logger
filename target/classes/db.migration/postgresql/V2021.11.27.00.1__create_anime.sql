CREATE TABLE IF NOT EXISTS anime
(
    anime_id        SERIAL PRIMARY KEY,
    total_episodes  INT,
    current_episode INT NOT NULL,
    name            varchar(128) NOT NULL UNIQUE,
    start_date      DATE,
    end_date        DATE,
    rating          REAL
);
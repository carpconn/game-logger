DROP TABLE IF EXISTS anime;

CREATE TABLE anime
(
    anime_id        INT PRIMARY KEY,
    total_episodes  INT NOT NULL,
    current_episode INT NOT NULL,
    name            varchar(128) NOT NULL,
    start_date      DATE,
    end_date        DATE,
    rating          REAL
);
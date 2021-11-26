CREATE TABLE IF NOT EXISTS anime
(
    anime_id        SERIAL PRIMARY KEY,
    total_episodes  INT,
    current_episode INT NOT NULL,
    name            varchar(128) NOT NULL, -- TODO: Enforce unique name policy on all tables, except achievement
    start_date      DATE,
    end_date        DATE,
    rating          REAL
);
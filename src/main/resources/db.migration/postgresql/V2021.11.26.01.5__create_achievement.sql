CREATE TABLE IF NOT EXISTS achievement
(
    achievement_id SERIAL PRIMARY KEY,
    game_id        INT NOT NULL,
    title          varchar(128),
    description    varchar(1024),
    CONSTRAINT FK_game_id_achievement FOREIGN KEY (game_id) REFERENCES game (game_id)
);
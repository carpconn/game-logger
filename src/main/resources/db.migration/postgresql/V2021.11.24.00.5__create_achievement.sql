DROP TABLE IF EXISTS achievement;

CREATE TABLE achievement
(
    achievement_id INT PRIMARY KEY,
    game_id        INT NOT NULL,
    title          varchar(128),
    description    varchar(1024),
    CONSTRAINT FK_game_id_achievement FOREIGN KEY (game_id) REFERENCES game (game_id)
);
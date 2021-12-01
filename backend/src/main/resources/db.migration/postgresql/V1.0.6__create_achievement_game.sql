CREATE TABLE achievement_game
(
    achievement_id INT NOT NULL,
    game_id        INT NOT NULL,
    CONSTRAINT PK_achievement_game_id PRIMARY KEY (achievement_id, game_id),
    CONSTRAINT FK_achievement_id FOREIGN KEY (achievement_id) REFERENCES achievement,
    CONSTRAINT FK_game_id FOREIGN KEY (game_id) REFERENCES game
);
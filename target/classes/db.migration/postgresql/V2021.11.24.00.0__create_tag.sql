CREATE TABLE tag
(
    tag_id   INT IDENTITY (1,1) NOT NULL,
    game_id  INT,
    anime_id INT,
    manga_id INT,
    name     varchar(128),
    CONSTRAINT PK_tag_id PRIMARY KEY (tag_id),
    CONSTRAINT FK_game_id FOREIGN KEY (game_id) REFERENCES game (game_id),
    CONSTRAINT FK_anime_id FOREIGN KEY (anime_id) REFERENCES anime (anime_id),
    CONSTRAINT FK_manga_id FOREIGN KEY (manga_id) REFERENCES manga (manga_id)
);
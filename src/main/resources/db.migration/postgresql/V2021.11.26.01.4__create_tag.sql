CREATE TABLE IF NOT EXISTS tag
(
    tag_id   SERIAL PRIMARY KEY,
    game_id  INT,
    anime_id INT,
    manga_id INT,
    name     varchar(128),
    CONSTRAINT FK_game_id_tag FOREIGN KEY (game_id) REFERENCES game (game_id),
    CONSTRAINT FK_anime_id_tag FOREIGN KEY (anime_id) REFERENCES anime (anime_id),
    CONSTRAINT FK_manga_id_tag FOREIGN KEY (manga_id) REFERENCES manga (manga_id)
);
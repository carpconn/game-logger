CREATE TABLE IF NOT EXISTS tag_refs
(
    tag_ref_id INT NOT NULL,
    game_id    INT,
    anime_id   INT,
    manga_id   INT,
    CONSTRAINT PK_tag_ref_id PRIMARY KEY (tag_ref_id),
    CONSTRAINT FK_game_id FOREIGN KEY (game_id) REFERENCES game,
    CONSTRAINT FK_anime_id FOREIGN KEY (anime_id) REFERENCES anime,
    CONSTRAINT FK_manga_id FOREIGN KEY (manga_id) REFERENCES manga
);
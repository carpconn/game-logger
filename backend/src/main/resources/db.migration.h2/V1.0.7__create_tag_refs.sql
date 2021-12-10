CREATE TABLE tag_refs
(
    tag_id     INT NOT NULL UNIQUE,
    game_id    INT,
    anime_id   INT,
    manga_id   INT
);
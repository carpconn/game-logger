DROP TABLE IF EXISTS manga;

CREATE TABLE manga
(
    manga_id        INT PRIMARY KEY,
    current_chapter INT NOT NULL,
    total_chapters  INT,
    start_date      DATE,
    end_date        DATE,
    name            varchar(128) NOT NULL,
    rating          REAL
);
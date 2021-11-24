CREATE TABLE manga
(
    manga_id        INT IDENTITY (1,1) NOT NULL,
    current_chapter INT NOT NULL,
    total_chapters  INT,
    start_date      DATE,
    end_date        DATE,
    name            varchar(128) NOT NULL,
    rating          REAL,
    CONSTRAINT PK_manga_id PRIMARY KEY (manga_id)
);
CREATE TABLE manga
(
    manga_id        INT GENERATED ALWAYS AS IDENTITY ( start with 1 increment by 1),
    current_chapter INT NOT NULL,
    total_chapters  INT,
    start_date      DATE,
    end_date        DATE,
    manga_name            varchar(128) NOT NULL UNIQUE,
    rating          REAL,
    CONSTRAINT PK_manga_id PRIMARY KEY (manga_id)
);
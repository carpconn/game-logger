CREATE TABLE tag
(
    tag_id   INT GENERATED ALWAYS AS IDENTITY ( start with 1 increment by 1),
    name     varchar(128) UNIQUE,
    CONSTRAINT PK_tag_id PRIMARY KEY (tag_id)
);
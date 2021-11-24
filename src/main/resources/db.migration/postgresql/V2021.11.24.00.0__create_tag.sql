CREATE TABLE tag
(
    tag_id INT IDENTITY (1,1) NOT NULL,
    name   varchar(128),
    CONSTRAINT PK_tag_id PRIMARY KEY (tag_id)
);
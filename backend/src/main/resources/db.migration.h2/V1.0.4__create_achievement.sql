CREATE TABLE achievement
(
    achievement_id INT GENERATED ALWAYS AS IDENTITY ( start with 1 increment by 1),
    title          varchar(128),
    description    varchar(1024),
    CONSTRAINT PK_achievement_id PRIMARY KEY (achievement_id)
);
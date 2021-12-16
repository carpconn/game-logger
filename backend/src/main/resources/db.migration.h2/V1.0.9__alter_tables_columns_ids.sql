ALTER TABLE anime
ALTER COLUMN anime_id BIGINT GENERATED ALWAYS AS IDENTITY ( start with 1 increment by 1);

ALTER TABLE game
ALTER COLUMN game_id BIGINT GENERATED ALWAYS AS IDENTITY ( start with 1 increment by 1);

ALTER TABLE manga
ALTER COLUMN manga_id BIGINT GENERATED ALWAYS AS IDENTITY ( start with 1 increment by 1);

ALTER TABLE achievement
ALTER COLUMN achievement_id BIGINT GENERATED ALWAYS AS IDENTITY ( start with 1 increment by 1);

ALTER TABLE tag
ALTER COLUMN tag_id BIGINT GENERATED ALWAYS AS IDENTITY ( start with 1 increment by 1);
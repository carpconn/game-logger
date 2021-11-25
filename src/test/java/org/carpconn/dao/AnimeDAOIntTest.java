package org.carpconn.dao;

import org.carpconn.model.Anime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * AnimeDAOIntTest
 *
 * @author carpc on 11/24/2021
 */
public class AnimeDAOIntTest {

    SqlMapAnimeDAO sqlMapAnimeDAO;

    @BeforeEach
    public void setupTests() {
    }

    @Test
    public void testCreate() {
        Anime anime = new Anime();
        anime.setCurrentEpisode(0);
        anime.setName("Princess Mononoke");
        anime.setTotalEpisodes(10);
        Anime createdAnime = sqlMapAnimeDAO.create(anime);
        assertNotNull(createdAnime.getAnimeId());
        assertEquals(createdAnime.getName(), anime.getName());
        assertEquals(createdAnime.getCurrentEpisode(), anime.getCurrentEpisode());
        assertEquals(createdAnime.getTotalEpisodes(), createdAnime.getTotalEpisodes());
    }
}

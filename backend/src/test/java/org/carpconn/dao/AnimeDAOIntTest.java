package org.carpconn.dao;

import org.carpconn.model.Anime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * AnimeDAOIntTest
 *
 * @author carpc on 11/24/2021
 */
public class AnimeDAOIntTest {

    SqlMapAnimeDAO sqlMapAnimeDAO;

    @BeforeEach
    public void setUp() {
//        TODO: create a test-specific singleton
        sqlMapAnimeDAO = new SqlMapAnimeDAO();
    }

    @AfterEach
    public void tearDown() {
        sqlMapAnimeDAO.findAll().forEach(anime -> {
            if(anime.getName().contains("__test_")) {
                sqlMapAnimeDAO.delete(anime.getAnimeId());
            }
        });
    }

    @Test
    public void testCreateFind() {
        Anime anime = new Anime();
        anime.setCurrentEpisode(0);
        anime.setName("__test_Princess Mononoke");
        anime.setTotalEpisodes(10);
        Anime createdAnime = sqlMapAnimeDAO.findAnime(sqlMapAnimeDAO.create(anime));
        assertNotNull(createdAnime.getAnimeId());
        assertEquals(createdAnime.getName(), anime.getName());
        assertEquals(createdAnime.getCurrentEpisode(), anime.getCurrentEpisode());
        assertEquals(createdAnime.getTotalEpisodes(), createdAnime.getTotalEpisodes());
    }

    @Test
    public void testUpdate() {
        Anime anime = new Anime();
        anime.setName("__test_Evangelion");
        anime.setCurrentEpisode(0);
        anime.setTotalEpisodes(25);
        anime.setRating(6.5);
        anime.setStartDate(new Date(2021, Calendar.NOVEMBER, 24));

        int createdAnimeId = sqlMapAnimeDAO.create(anime);

        Anime updateAnime = new Anime();
        updateAnime.setAnimeId(createdAnimeId);
        updateAnime.setCurrentEpisode(25);
        updateAnime.setRating(7.0);
        updateAnime.setEndDate(new Date(2021, Calendar.NOVEMBER, 26));

        sqlMapAnimeDAO.update(updateAnime);
        Anime updatedAnime = sqlMapAnimeDAO.findAnime(createdAnimeId);

        assertEquals(anime.getName(), updatedAnime.getName());
        assertEquals(anime.getTotalEpisodes(), updatedAnime.getTotalEpisodes());
        assertEquals(25, updatedAnime.getCurrentEpisode());
        assertEquals(7.0, updatedAnime.getRating());
        assertEquals(new Date(2021, Calendar.NOVEMBER, 24), updatedAnime.getStartDate());
        assertEquals(new Date(2021, Calendar.NOVEMBER, 26), updatedAnime.getEndDate());
    }

    @Test
    public void testDelete() {
        Anime anime = new Anime();
        anime.setName("__test_Peter of Placid Forest");
        anime.setCurrentEpisode(0);
        anime.setTotalEpisodes(12);
        anime.setRating(10.0);

        Integer createdAnimeId = sqlMapAnimeDAO.create(anime);
        assertNotNull(createdAnimeId);

        sqlMapAnimeDAO.delete(anime.getAnimeId());
        assertNull(sqlMapAnimeDAO.findAnime(createdAnimeId));
    }
}

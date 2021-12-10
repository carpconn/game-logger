package org.carpconn.dao;

import org.carpconn.model.Manga;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * MangaDAOIntTest
 *
 * @author carpc on 11/27/2021
 */
public class MangaDAOIntTest {

    SqlMapMangaDAO sqlMapMangaDAO;

    @BeforeEach
    void setUp() {
        sqlMapMangaDAO = new SqlMapMangaDAO();
    }

    @AfterEach
    void tearDown() {
        sqlMapMangaDAO.findAll().forEach(manga -> {
            if(manga.getName().contains("__test_")) {
                sqlMapMangaDAO.delete(manga.getMangaId());
            }
        });
    }

    @Test
    public void testCreateFind() {
        Manga manga = new Manga();
        manga.setName("__test_Gensouki");
        manga.setTotalChapters(80);
        manga.setCurrentChapter(0);

        Integer createdMangaId = sqlMapMangaDAO.create(manga);
        assertNotNull(createdMangaId);

        Manga createdManga = sqlMapMangaDAO.findManga(createdMangaId);
        assertEquals(manga.getName(), createdManga.getName());
        assertEquals(manga.getTotalChapters(), createdManga.getTotalChapters());
        assertEquals(manga.getCurrentChapter(), createdManga.getCurrentChapter());
    }

    @Test
    public void testUpdate() {
        Manga manga = new Manga();
        manga.setName("__test_The Greatest Manga of All Time");
        manga.setCurrentChapter(0);
        manga.setTotalChapters(35);
        manga.setStartDate(new Date(2021, Calendar.DECEMBER, 5));

        Integer createdMangaId = sqlMapMangaDAO.create(manga);

        Manga updateManga = new Manga();
        updateManga.setMangaId(createdMangaId);
        updateManga.setName("__test_This Manga Actually Isn't Too Great");
        updateManga.setCurrentChapter(35);
        updateManga.setRating(3.3);
        updateManga.setEndDate(new Date(2021, Calendar.DECEMBER, 22));
        sqlMapMangaDAO.update(updateManga);

        Manga updatedManga = sqlMapMangaDAO.findManga(createdMangaId);
        assertEquals(updateManga.getName(), updatedManga.getName());
        assertEquals(updateManga.getCurrentChapter(), updatedManga.getCurrentChapter());
        assertEquals(updateManga.getRating(), updatedManga.getRating());
        assertEquals(manga.getStartDate(), updatedManga.getStartDate());
        assertEquals(updateManga.getEndDate(), updatedManga.getEndDate());
    }

    @Test
    public void testDelete() {
        Manga manga = new Manga();
        manga.setName("__test_Delete this shit");
        manga.setCurrentChapter(0);
        manga.setTotalChapters(0);

        Integer createdMangaId = sqlMapMangaDAO.create(manga);
        assertNotNull(createdMangaId);

        sqlMapMangaDAO.delete(createdMangaId);
        assertNull(sqlMapMangaDAO.findManga(createdMangaId));
    }
}

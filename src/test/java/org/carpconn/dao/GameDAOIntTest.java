package org.carpconn.dao;

import org.carpconn.model.Game;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * GameDAOIntTest
 *
 * @author carpc on 11/27/2021
 */
public class GameDAOIntTest {

    SqlMapGameDAO sqlMapGameDAO;

    @BeforeEach
    void setUp() {
        sqlMapGameDAO = new SqlMapGameDAO();
    }

    @AfterEach
    void tearDown() {
        sqlMapGameDAO.findAll().forEach(game -> {
            if(game.getName().contains("__test_")) {
                sqlMapGameDAO.delete(game.getGameId());
            }
        });
    }

    @Test
    public void testCreateFind() {
        Game game = new Game();
        game.setName("__test_Skyrim");
        game.setHoursPlayed((double) 250);

        Integer createdGameId = sqlMapGameDAO.create(game);
        assertNotNull(createdGameId);

        Game createdGame = sqlMapGameDAO.findGame(createdGameId);
        assertEquals(game.getName(), createdGame.getName());
        assertEquals(game.getHoursPlayed(), createdGame.getHoursPlayed());
    }

    @Test
    public void testUpdate() {
        Game game = new Game();
        game.setName("__test_Factory Town");
        game.setHoursPlayed(1.5);
        game.setRating(8.5);

        Integer createdGameId = sqlMapGameDAO.create(game);
        assertNotNull(createdGameId);

        Game updateGame = new Game();
        updateGame.setGameId(createdGameId);
        updateGame.setName("__test_Factory Town Beta");
        updateGame.setHoursPlayed(32.0);
        updateGame.setRating(8.0);
        sqlMapGameDAO.update(updateGame);

        Game updatedGame = sqlMapGameDAO.findGame(createdGameId);

        assertEquals(game.getGameId(), updatedGame.getGameId());
        assertEquals("__test_Factory Town Beta", updatedGame.getName());
        assertEquals(32.0, updatedGame.getHoursPlayed());
        assertEquals(8.0, updatedGame.getRating());
    }

    @Test
    public void testDelete() {
        Game game = new Game();
        game.setName("__test_The Fun Game TM");
        game.setHoursPlayed(15.75);

        Integer createdGameId = sqlMapGameDAO.create(game);
        assertNotNull(createdGameId);

        sqlMapGameDAO.delete(createdGameId);
        assertNull(sqlMapGameDAO.findGame(createdGameId));
    }
}

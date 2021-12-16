package org.carpconn.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.carpconn.model.Game;
import org.carpconn.infrastructure.sqlsession.SqlSessionFactorySingleton;

import java.util.List;

import static java.util.Objects.isNull;

/**
 * SqlMapGameDAO
 *
 * The sql mapper implementation for the GameDAO.
 *
 * @author carpc on 11/27/2021
 */
public class SqlMapGameDAO implements GameDAO {
    private final SqlSessionFactory sqlSessionFactory;

    public SqlMapGameDAO() {
        sqlSessionFactory = SqlSessionFactorySingleton.getInstance();
    }

    public SqlMapGameDAO(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public Long create(Game game) {
        try {
            SqlSession sqlSession = sqlSessionFactory.openSession();
            GameDAO gameDAO = sqlSession.getMapper(GameDAO.class);
            gameDAO.create(game);
            sqlSession.commit();
            return game.getGameId();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Game findGame(Long gameId) {
        try {
            SqlSession sqlSession = sqlSessionFactory.openSession();
            GameDAO gameDAO = sqlSession.getMapper(GameDAO.class);
            Game game = gameDAO.findGame(gameId);
            return game;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Game game) {
        try {
            SqlSession sqlSession = sqlSessionFactory.openSession();
            GameDAO gameDAO = sqlSession.getMapper(GameDAO.class);
            Game updatee = gameDAO.findGame(game.getGameId());
            if(isNull(game.getName())) {
                game.setName(updatee.getName());
            }
            if(isNull(game.getHoursPlayed())) {
                game.setHoursPlayed(updatee.getHoursPlayed());
            }
            if(isNull(game.getRating())) {
                game.setRating(updatee.getRating());
            }
            if(isNull(game.getStartDate())) {
                game.setStartDate(updatee.getStartDate());
            }
            if(isNull(game.getEndDate())) {
                game.setEndDate(updatee.getEndDate());
            }
            if(isNull(game.getTags())) {
                game.setTags(updatee.getTags());
            }
            if(isNull(game.getAchievements())) {
                game.setAchievements(updatee.getAchievements());
            }
            gameDAO.update(game);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Long gameId) {
        try {
            SqlSession sqlSession = sqlSessionFactory.openSession();
            GameDAO gameDAO = sqlSession.getMapper(GameDAO.class);
            gameDAO.delete(gameId);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Game> findAll() {
        try {
            SqlSession sqlSession = sqlSessionFactory.openSession();
            GameDAO gameDAO = sqlSession.getMapper(GameDAO.class);
            List<Game> games = gameDAO.findAll();
            return games;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

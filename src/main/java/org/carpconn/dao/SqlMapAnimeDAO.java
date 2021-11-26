package org.carpconn.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.carpconn.model.Anime;
import org.carpconn.sqlsession.SqlSessionFactorySingleton;

import static java.util.Objects.isNull;

/**
 * SqlMapAnimeDAO
 *
 * The sql mapper implementation for the AnimeDAO.
 *
 * @author carpc on 11/25/2021
 */
public class SqlMapAnimeDAO implements AnimeDAO{
    private SqlSessionFactory factory;

    public SqlMapAnimeDAO() {
        /* This factory should be a singleton; DO NOT duplicate a factory! */
        factory = SqlSessionFactorySingleton.getInstance();
    }

    @Override
    public int create(Anime anime) {
        SqlSession sqlSession = factory.openSession();
        AnimeDAO animeDAO = sqlSession.getMapper(AnimeDAO.class);
        int createdAnimeId = animeDAO.create(anime);
        sqlSession.close();
        return createdAnimeId;
    }

    @Override
    public Anime findAnime(int animeId) {
        SqlSession sqlSession = factory.openSession();
        AnimeDAO animeDAO = sqlSession.getMapper(AnimeDAO.class);
        Anime findAnime = animeDAO.findAnime(animeId);
        sqlSession.close();
        return findAnime;
    }

    @Override
    public int update(Anime anime) {
        SqlSession sqlSession = factory.openSession();
        AnimeDAO animeDAO = sqlSession.getMapper(AnimeDAO.class);
        int updatedAnimeId = animeDAO.update(anime);
        sqlSession.close();
        return updatedAnimeId;
    }

    @Override
    public boolean delete(int animeId) {
        SqlSession sqlSession = factory.openSession();
        AnimeDAO animeDAO = sqlSession.getMapper(AnimeDAO.class);
        animeDAO.delete(animeId);
        sqlSession.close();
        return isNull(this.findAnime(animeId));
    }
}

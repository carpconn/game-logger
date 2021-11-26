package org.carpconn.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.carpconn.model.Anime;

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

    public SqlMapAnimeDAO(SqlSessionFactory factory) {
        /* This factory should be a singleton; DO NOT duplicate a factory! */
        this.factory = factory;
    }

    @Override
    public Anime create(Anime anime) {
        SqlSession sqlSession = factory.openSession();
        AnimeDAO animeDAO = sqlSession.getMapper(AnimeDAO.class);
        Anime createdAnime = animeDAO.create(anime);
        sqlSession.close();
        return createdAnime;
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
    public Anime update(Anime anime) {
        SqlSession sqlSession = factory.openSession();
        AnimeDAO animeDAO = sqlSession.getMapper(AnimeDAO.class);
        Anime updatedAnime = animeDAO.update(anime);
        sqlSession.close();
        return updatedAnime;
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

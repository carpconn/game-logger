package org.carpconn.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.carpconn.model.Anime;

import static java.util.Objects.isNull;

/**
 * SqlMapAnimeDAO
 *
 * @author carpc on 11/25/2021
 */
public class SqlMapAnimeDAO implements AnimeDAO{
    private SqlSessionFactory factory;

    public SqlMapAnimeDAO(SqlSessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public Anime create(Anime anime) {
        SqlSession sqlSession = factory.openSession();
        Anime createdAnime = this.findAnime(sqlSession.insert("AnimeDAO.create", anime));
        sqlSession.close();
        return createdAnime;
    }

    @Override
    public Anime findAnime(int animeId) {
        SqlSession sqlSession = factory.openSession();
        Anime findAnime = sqlSession.selectOne("AnimeDAO.findAnime", animeId);
        sqlSession.close();
        return findAnime;
    }

    @Override
    public Anime update(Anime anime) {
        SqlSession sqlSession = factory.openSession();
        Anime updatedAnime = this.findAnime(sqlSession.update("AnimeDAO.update", anime));
        sqlSession.close();
        return updatedAnime;
    }

    @Override
    public boolean delete(int animeId) {
        SqlSession sqlSession = factory.openSession();
        sqlSession.delete("AnimeDAO.delete", animeId);
        sqlSession.close();
        return isNull(this.findAnime(animeId));
    }
}

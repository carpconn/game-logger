package org.carpconn.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.carpconn.model.Anime;
import org.carpconn.sqlsession.SqlSessionFactorySingleton;

import java.util.List;

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
    public Integer create(Anime anime) {
        try {
            SqlSession sqlSession = factory.openSession();
            AnimeDAO animeDAO = sqlSession.getMapper(AnimeDAO.class);
            animeDAO.create(anime);
            Integer createdAnimeId = anime.getAnimeId();
            sqlSession.commit();
            return createdAnimeId;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Anime findAnime(int animeId) {
        try {
            SqlSession sqlSession = factory.openSession();
            AnimeDAO animeDAO = sqlSession.getMapper(AnimeDAO.class);
            Anime findAnime = animeDAO.findAnime(animeId);
            return findAnime;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Anime> findAll() {
        try {
            SqlSession sqlSession = factory.openSession();
            AnimeDAO animeDAO = sqlSession.getMapper(AnimeDAO.class);
            List<Anime> allAnime = animeDAO.findAll();
            return allAnime;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Anime anime) {
        try {
            SqlSession sqlSession = factory.openSession();
            AnimeDAO animeDAO = sqlSession.getMapper(AnimeDAO.class);
            Anime updatee = animeDAO.findAnime(anime.getAnimeId());
            if(isNull(anime.getName())) {
                anime.setName(updatee.getName());
            }
            if(isNull(anime.getTotalEpisodes())) {
                anime.setTotalEpisodes(updatee.getTotalEpisodes());
            }
            if(isNull(anime.getCurrentEpisode())) {
                anime.setCurrentEpisode(updatee.getCurrentEpisode());
            }
            if(isNull(anime.getRating())) {
                anime.setRating(updatee.getRating());
            }
            if(isNull(anime.getStartDate())) {
                anime.setStartDate(updatee.getStartDate());
            }
            if(isNull(anime.getEndDate())) {
                anime.setEndDate(updatee.getEndDate());
            }
            if(isNull(anime.getTags())) {
                anime.setTags(updatee.getTags());
            }
            animeDAO.update(anime);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int animeId) {
        try {
            SqlSession sqlSession = factory.openSession();
            AnimeDAO animeDAO = sqlSession.getMapper(AnimeDAO.class);
            animeDAO.delete(animeId);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

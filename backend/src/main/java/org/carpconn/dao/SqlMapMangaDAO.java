package org.carpconn.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.carpconn.infrastructure.sqlsession.SqlSessionFactorySingleton;
import org.carpconn.model.Manga;

import java.util.List;

import static java.util.Objects.isNull;

/**
 * SqlMapMangaDAO
 *
 * @author carpc on 11/27/2021
 */
public class SqlMapMangaDAO implements MangaDAO {

    private final SqlSessionFactory sqlSessionFactory;

    public SqlMapMangaDAO() {
        sqlSessionFactory = SqlSessionFactorySingleton.getInstance();
    }

    public SqlMapMangaDAO(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public Long create(Manga manga) {
        try {
            SqlSession sqlSession = sqlSessionFactory.openSession();
            MangaDAO mangaDAO = sqlSession.getMapper(MangaDAO.class);
            mangaDAO.create(manga);
            Long createdMangaId = manga.getMangaId();
            sqlSession.commit();
            return createdMangaId;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Manga findManga(Long mangaId) {
        try {
            SqlSession sqlSession = sqlSessionFactory.openSession();
            MangaDAO mangaDAO = sqlSession.getMapper(MangaDAO.class);
            Manga manga = mangaDAO.findManga(mangaId);
            return manga;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Manga manga) {
        try {
            SqlSession sqlSession = sqlSessionFactory.openSession();
            MangaDAO mangaDAO = sqlSession.getMapper(MangaDAO.class);
            Manga updatee = mangaDAO.findManga(manga.getMangaId());
            if(isNull(manga.getName())) {
                manga.setName(updatee.getName());
            }
            if(isNull(manga.getCurrentChapter())) {
                manga.setCurrentChapter(updatee.getCurrentChapter());
            }
            if(isNull(manga.getTotalChapters())) {
                manga.setTotalChapters(updatee.getTotalChapters());
            }
            if(isNull(manga.getRating())) {
                manga.setRating(updatee.getRating());
            }
            if(isNull(manga.getStartDate())) {
                manga.setStartDate(updatee.getStartDate());
            }
            if(isNull(manga.getEndDate())) {
                manga.setEndDate(updatee.getEndDate());
            }
            if(isNull(manga.getTags())) {
                manga.setTags(updatee.getTags());
            }
            mangaDAO.update(manga);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Long mangaId) {
        try {
            SqlSession sqlSession = sqlSessionFactory.openSession();
            MangaDAO mangaDAO = sqlSession.getMapper(MangaDAO.class);
            mangaDAO.delete(mangaId);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Manga> findAll() {
        try {
            SqlSession sqlSession = sqlSessionFactory.openSession();
            MangaDAO mangaDAO = sqlSession.getMapper(MangaDAO.class);
            List<Manga> mangas = mangaDAO.findAll();
            return mangas;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

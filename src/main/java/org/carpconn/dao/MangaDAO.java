package org.carpconn.dao;

import org.apache.ibatis.annotations.Param;
import org.carpconn.model.Manga;

import java.util.List;

/**
 * MangaDAO
 *
 * @author carpc on 11/23/2021
 */
public interface MangaDAO {

    Integer create(@Param("manga") Manga manga);

    Manga findManga(@Param("mangaId") int mangaId);

    void update(@Param("manga") Manga manga);

    void delete(@Param("mangaId") int mangaId);

    List<Manga> findAll();

}

package org.carpconn.dao;

import org.apache.ibatis.annotations.Param;
import org.carpconn.model.Anime;

import java.util.List;

/**
 * AnimeDAO
 *
 * @author carpc on 11/23/2021
 */
public interface AnimeDAO {

    Long create(@Param("anime") Anime anime);

//    TODO: implement findByName query
    Anime findAnime(@Param("animeId") Long animeId);

    List<Anime> findAll();

    void update(@Param("anime") Anime anime);

    void delete(@Param("animeId") Long animeId);

}

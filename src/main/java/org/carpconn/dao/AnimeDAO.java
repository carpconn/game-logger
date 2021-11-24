package org.carpconn.dao;

import org.apache.ibatis.annotations.Param;
import org.carpconn.model.Anime;

/**
 * AnimeDAO
 *
 * @author carpc on 11/23/2021
 */
public interface AnimeDAO {

    Anime create(@Param("anime") Anime anime);

    Anime findAnime(@Param("animeId") int animeId);

    Anime update(@Param("anime") Anime anime);

    void delete(@Param("animeId") int animeId);

}

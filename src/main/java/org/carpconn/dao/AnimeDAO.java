package org.carpconn.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.carpconn.model.Anime;

/**
 * AnimeDAO
 *
 * @author carpc on 11/23/2021
 */
public interface AnimeDAO {

    @Insert("INSERT INTO anime(total_episodes, current_episode, name, start_date, end_date, rating) VALUES (" +
            "#{anime.totalEpisodes}, #{anime.currentEpisode}, #{anime.name}, #{anime.startDate}, #{anime.endDate}," +
            " #{anime.rating})")
    int create(@Param("anime") Anime anime);

    Anime findAnime(@Param("animeId") int animeId);

    int update(@Param("anime") Anime anime);

    boolean delete(@Param("animeId") int animeId);

}

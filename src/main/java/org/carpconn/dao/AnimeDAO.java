package org.carpconn.dao;

import org.carpconn.model.Anime;

/**
 * AnimeDAO
 *
 * @author carpc on 11/23/2021
 */
public interface AnimeDAO {

    void createAnime(Anime anime);

    Anime findAnime(int animeId);

    void updateAnime(Anime anime);

    void deleteAnime(int animeId);

}

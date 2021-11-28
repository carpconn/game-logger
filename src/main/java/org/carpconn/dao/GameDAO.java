package org.carpconn.dao;

import org.apache.ibatis.annotations.Param;
import org.carpconn.model.Game;

import java.util.List;

/**
 * GameDAO
 *
 * @author carpc on 11/23/2021
 */
public interface GameDAO {

    Integer create(@Param("game") Game game);

    Game findGame(@Param("gameId") int gameId);

    void update(@Param("game") Game game);

//    TODO: make this available to users? And how to handle tag relations?
    void delete(@Param("gameId") int gameId);

    List<Game> findAll();

}

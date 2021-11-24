package org.carpconn.dao;

import org.apache.ibatis.annotations.Param;
import org.carpconn.model.Game;

/**
 * GameDAO
 *
 * @author carpc on 11/23/2021
 */
public interface GameDAO {

    Game create(@Param("game") Game game);

    Game findGame(@Param("gameId") int gameId);

    Game update(@Param("game") Game game);

    void delete(@Param("gameId") int gameId);

}

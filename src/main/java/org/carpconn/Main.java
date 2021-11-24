package org.carpconn;

import org.carpconn.controllers.AnimeController;
import org.carpconn.controllers.GameController;
import org.carpconn.controllers.MangaController;

/**
 * Main
 *
 * @author carpc on 11/23/2021
 */
public class Main {

    /*
        Generate new game, anime, and manga controllers
     */
    public AnimeController animeController;
    public GameController gameController;
    public MangaController mangaController;

    public static void main(String[] args) {
        AnimeController animeController = new AnimeController();
        GameController gameController = new GameController();
        MangaController mangaController = new MangaController();
    }


}

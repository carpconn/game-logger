package org.carpconn;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Main
 *
 * @author carpc on 11/23/2021
 */
public class Main extends Application {

    /*
        Generate new game, anime, and manga SqlMap implementations
     */

    private Parent createContent() {
        return new StackPane(new Text("Hello World!"));
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(createContent(), 300, 300));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}

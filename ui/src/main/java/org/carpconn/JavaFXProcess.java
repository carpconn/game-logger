package org.carpconn;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFXProcess
 *
 * The process by which the JavaFX GUI is run.
 *
 * @author carpc on 11/23/2021
 */
public class JavaFXProcess extends Application {

    /*
        Generate new game, anime, and manga SqlMap implementations
     */

    private static JavaFXProcess process;

    private Parent createContent() {
        return new StackPane(new Text("Hello World!"));
    }

    @Override
    public void start(Stage stage) {
        try {
            stage.setScene(new Scene(createContent(), 300, 300));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public JavaFXProcess() {
    }

    public static JavaFXProcess getInstance() {
        try {
            if(process == null) {
                process = new JavaFXProcess();
            }
            return process;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void launchProcess(String[] args) {
        launch(args);
    }
}

package org.carpconn;

import javafx.stage.Stage;

/**
 * JavaFXRunner
 *
 * The runner for the JavaFXProcess
 *
 * @author carpc on 12/15/2021
 */
public class JavaFXRunner {

    private static final JavaFXProcess process = JavaFXProcess.getInstance();

    public static void main(String[] args) {
        process.launchProcess(args);
    }

}

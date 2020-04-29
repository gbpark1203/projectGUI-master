package com.company;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Random;

/*
 * This app displays a label at CENTER_LEFT, CENTER, or CENTER_RIGHT at random.
 * Starter code from Starting Out with Java by Gaddis
 * Modified by Laura K. Gross, laura.gross@bridgew.edu, November, 2018
 */

public class HelloRandomPosition extends Application {

    public static void main(String[] args) {
        // Launch the application.
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a Label component.
        Label messageLabel = new Label("Hello World");

        // Put the Label in an HBox.
        HBox hbox = new HBox(messageLabel);

        // Create a Scene with the HBox as its root node.
        Scene scene = new Scene(hbox, 300, 100);

        Random rand = new Random();
        int r = rand.nextInt(3);

        // Set the scene's alignment to one of three positions at random.
        if (r == 0){
            hbox.setAlignment(Pos.CENTER_LEFT);
        }
        else if (r == 1){
            hbox.setAlignment(Pos.CENTER);
        }
        else {
            hbox.setAlignment(Pos.CENTER_RIGHT);
        }

        // Add the Scene to the Stage.
        primaryStage.setScene(scene);

        // Set the stage title.
        primaryStage.setTitle("My First Scene");

        // Show the window.
        primaryStage.show();
    }

}




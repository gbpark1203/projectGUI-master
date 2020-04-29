package com.company;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.control.Button;

/**
 * VBox containing three Buttons
 * Starting Out with Java by Gaddis
 * Modified by Laura K. Gross, laura.gross@bridgew.edu, November, 2018
 */
public class VBoxDemo extends Application
{
    public static void main(String[] args)
    {
        // Launch the application.
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        // Create three Button components.
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        // Create a VBox.
        VBox vbox = new VBox(10, button1, button2, button3);

        // Set the scene's alignment to center.
        vbox.setAlignment(Pos.CENTER);

        vbox.setPadding(new Insets(10));

        // Create a Scene with the VBox as its root node.
        // The Scene is 300 pixels wide by 200 pixels high.
        Scene scene = new Scene(vbox, 300, 200);

        // Add the Scene to the Stage.
        primaryStage.setScene(scene);

        // Set the stage title.
        primaryStage.setTitle("VBox Demo");

        // Show the window.
        primaryStage.show();
    }
}

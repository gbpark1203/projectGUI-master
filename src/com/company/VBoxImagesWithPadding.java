package com.company;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * VBox with two ImageViews, spacing, and padding
 * Starting Out with Java by Gaddis
 * Modified by Laura K. Gross, laura.gross@bridgew.edu, November, 2018
 */

public class VBoxImagesWithPadding extends Application {
    public static void main(String[] args) {
        // Launch the application.
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create the Image components.
        Image flowerImage = new Image("file:Flower.jpg");

        // Create the ImageView components.
        ImageView flowerImage1 = new ImageView(flowerImage);
        ImageView flowerImage2 = new ImageView(flowerImage);

        // Resize the flower image, preserving its aspect ratio.
        flowerImage1.setFitWidth(200);
        flowerImage1.setPreserveRatio(true);

        // Resize the flower image, preserving its aspect ratio.
        flowerImage2.setFitWidth(200);
        flowerImage2.setPreserveRatio(true);

        // Put the ImageViews in a VBox with 10 pixels spacing.
        VBox vbox = new VBox(10, flowerImage1, flowerImage2);

        // Put 30 pixels of padding around the VBox.
        vbox.setPadding(new Insets(30));

        // Create a Scene with the VBox as its root node.
        Scene scene = new Scene(vbox);

        // Add the Scene to the Stage.
        primaryStage.setScene(scene);

        // Set the stage title.
        primaryStage.setTitle("Images");

        // Show the window.
        primaryStage.show();
    }
}
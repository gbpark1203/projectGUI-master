package com.company;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;

import java.awt.*;

/**
 * A code to demo nested layout containers
 * Starting Out with Java by Gaddis
 * Modified by Laura K. Gross, laura.gross@bridgew.edu, November, 2018
 */
public class TicTacToeBoard extends Application {
    public static void main(String[] args) {
        // Launch the application.
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Set the window's title.
        primaryStage.setTitle("Tic Tac Toe");

        // Create Image components.
        Image xImage = new Image("file:X.png");
        Image oImage = new Image("file:O.png");

        // Create ImageView components.
        ImageView playView00 = new ImageView(xImage);
        ImageView playView10 = new ImageView(xImage);
        ImageView playView20 = new ImageView(xImage);
        ImageView playView01 = new ImageView(xImage);
        ImageView playView11 = new ImageView(xImage);
        ImageView playView21 = new ImageView(xImage);
        ImageView playView02 = new ImageView(xImage);
        ImageView playView12 = new ImageView(xImage);
        ImageView playView22 = new ImageView(xImage);

        // Resize the images, preserving their aspect ratios.
        playView00.setFitWidth(100);
        playView00.setPreserveRatio(true);
        playView10.setFitWidth(100);
        playView10.setPreserveRatio(true);
        playView20.setFitWidth(100);
        playView20.setPreserveRatio(true);

        playView01.setFitWidth(100);
        playView01.setPreserveRatio(true);
        playView11.setFitWidth(100);
        playView11.setPreserveRatio(true);
        playView21.setFitWidth(100);
        playView21.setPreserveRatio(true);

        playView02.setFitWidth(100);
        playView02.setPreserveRatio(true);
        playView12.setFitWidth(100);
        playView12.setPreserveRatio(true);
        playView22.setFitWidth(100);
        playView22.setPreserveRatio(true);

        // Create a GridPane.
        GridPane gridpaneBoard = new GridPane();

        // Add the ImageViews to the GridPane.
        gridpaneBoard.add(playView00, 0, 0);
        gridpaneBoard.add(playView10, 1, 0);
        gridpaneBoard.add(playView20, 2, 0);

        gridpaneBoard.add(playView01, 0, 1);
        gridpaneBoard.add(playView11, 1, 1);
        gridpaneBoard.add(playView21, 2, 1);

        gridpaneBoard.add(playView02, 0, 2);
        gridpaneBoard.add(playView12, 1, 2);
        gridpaneBoard.add(playView22, 2, 2);

        // Set the gap sizes.
        gridpaneBoard.setVgap(10);
        gridpaneBoard.setHgap(10);

        // Create a label for each control you want.
        Label messageLabel = new Label("X wins!");
        Label messageLabel2 = new Label("X wins!");

        // Create HBoxes.
        HBox hbox = new HBox(10, messageLabel);
        HBox hbox2 = new HBox(10, messageLabel2);

        // Set the HBoxes' alignment to center.
        hbox.setAlignment(Pos.CENTER);
        hbox2.setAlignment(Pos.CENTER);

        // Create a VBox.
        VBox vboxContainer = new VBox(10, gridpaneBoard, hbox, hbox2);

        // Put padding around the VBox.
        vboxContainer.setPadding(new Insets(30));

        // Create a Scene with the VBox as its root node.
        // The leaf nodes are gridPaneBoard, hbox, and hbox2.
        Scene scene = new Scene(vboxContainer);

        // Add the Scene to the Stage.
        primaryStage.setScene(scene);

        // Show the window.
        primaryStage.show();

    }
}

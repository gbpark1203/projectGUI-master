package com.company;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * A minimal GUI application
 * Starting Out with Java by Gaddis
 * Modified by Laura K. Gross, laura.gross@bridgew.edu, November, 2018
 */
public class MyFirstGUI extends Application
{
        public static void main(String[] args)
        {
            // Launch the application.
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        // Set the window's title.
        primaryStage.setTitle("My First GUI Application");

        // Show the window.
        primaryStage.show();
    }
}
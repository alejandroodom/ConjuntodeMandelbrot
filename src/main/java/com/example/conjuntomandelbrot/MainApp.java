package com.example.conjuntomandelbrot;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Conjunto de Mandelbrot");
        MandelbrotPane mandelbrotPane = new MandelbrotPane();
        Scene scene = new Scene(mandelbrotPane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

package com.javafx;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainScene.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root,700,500);

            Controller controller = loader.getController();

            primaryStage.setTitle("JavaPaint");
            primaryStage.setScene(scene);

            primaryStage.setMinWidth(750);
            primaryStage.setMinHeight(550);

            primaryStage.setMaxWidth(1920);
            primaryStage.setMaxHeight(1080);

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

 public static void main(String[] args) {
        launch(args);
    }
}

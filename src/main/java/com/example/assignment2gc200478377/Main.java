package com.example.assignment2gc200478377;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application
{

    @Override
    public void start(Stage stage) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("search-superhero-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Search your Superhero");
        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/main/resources/com/example/assignment2gc200478377/favicon.png"));
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
/*
        System.out.println();

        ApiResponse api = APIUtility.getSearchFromAPI("man");
        System.out.println(api);

 */
    }
}
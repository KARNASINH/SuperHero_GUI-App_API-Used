//This class is a part of this package
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
        //Passing Superhero search view fxml into object
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("search-superhero-view.fxml"));
        //Scene will first load Superhero list view.
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Search your Superhero");
        //Loading scene into stage
        stage.setScene(scene);
        //Publishing icon on stage view
        stage.getIcons().add(new Image("file:src/main/resources/com/example/assignment2gc200478377/favicon.png"));
        //Publishing stage
        stage.show();
    }

    public static void main(String[] args)
    {
        //This is a static method located in Application class to launch JavaFX
        launch();
/*
        System.out.println();
        ApiResponse api = APIUtility.getSearchFromAPI("man");
        System.out.println(api);
 */
    }
}
//This class is a part of this package
package com.example.assignment2gc200478377;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneChanger
{
    /**
     * This is static method to change scene from Superhero search scene to Superhero detail scene.
     * @param fxmlFile This argument pass fxml file name to the method.
     * @param id This argument pass Superhero ID to the method and get data based on this ID.
     */
    public static void changeSceneWithId(ActionEvent event, String fxmlFile, String id) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFile));
        Scene scene = new Scene(fxmlLoader.load());

        //Created a SuperheroDetailsViewController object.
        SuperheroDetailsViewController controller = fxmlLoader.getController();
        //Calling static method and display data on the scene.
        controller.loadSuperheroInfo(id, event);

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        //Setting up title of the scene page.
        stage.setTitle("Character details for Id: " + id);
        //Publishing stage
        stage.show();
    }

    /**
     * This is a static method to change scene from Superhero Detail scene to Superhero search scene.
     * @param fxmlFile This argument pass fxml file name to the method.
     */
    public static void changeScene(ActionEvent event, String fxmlFile) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlFile));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        //Setting up title of the scene page.
        stage.setTitle("Search your Superhero");
        //Publishing stage
        stage.show();
    }
}

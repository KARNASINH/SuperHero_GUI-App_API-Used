/**
 * This is a Search superhero controller class; this class take superhhero name as an argument from USER and display list of superuser of available.
 * This class works as a bridge between "JSON parsed data into JAVA object" and View
 */

//This class is a part of this package
package com.example.assignment2gc200478377;

//Imported different classes to use their functionality
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * This class implements Initializable interface
 */
public class SearchSuperheroViewController implements Initializable
{
    /**
     * Private fields which mapped to Scene's items
     */
    @FXML
    private Button getDetailsButton;

    @FXML
    private ImageView imageView;

    @FXML
    private ListView<Result> listView;

    @FXML
    private Label notFoundLabel;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchTextField;

    /**
     * This method take user into second scene which displays Superhero statistics.
     */
    @FXML
    void getDetailsButtonOnClick(ActionEvent event) throws IOException
    {
        //Get an id of superhero clicked from the displayed data.
        String id = listView.getSelectionModel().getSelectedItem().getId();
        //System.out.println(id);

        //Calling static method to change a scene.
        SceneChanger.changeSceneWithId(event, "superhero-details-view.fxml", id);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        //Keep detail button turn off.
        getDetailsButton.setVisible(false);
        //Keep label text turn off.
        notFoundLabel.setText("");

        //If user select a Superhero from the list then displays a poster image.
        listView.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSuperheroSelected, newSuperheroSelected) ->
                {
                    getDetailsButton.setVisible(true);
                    try
                    {
                        //Displaying superhero image.
                        imageView.setImage(new Image(newSuperheroSelected.getImage().getUrl()));
                    }
                    catch (IllegalArgumentException e)
                    {
                        //Displaying default image if superhero doesn't have any image.
                        imageView.setImage(new Image("https://ih1.redbubble.net/image.1893341687.8294/poster,504x498,f8f8f8-pad,600x600,f8f8f8.jpg"));
                    }
                    catch (NullPointerException e)
                    {
                        imageView.setImage(new Image("https://ih1.redbubble.net/image.1893341687.8294/poster,504x498,f8f8f8-pad,600x600,f8f8f8.jpg"));
                    }
                });
    }

    /**
     * This method take allows user to enter name of superhero they want to search and display data if API respond data.
     */
    @FXML
    private void searchSuperhero()
    {
        //Calling static method and request API based on value entered into search text field.
        ApiResponse apiResponse = APIUtility.getSearchFromAPI(searchTextField.getText());
        listView.getItems().clear();

        //If response received then it will display data in the list view.
        if(apiResponse.getResults() != null)
        {
            listView.getItems().addAll(apiResponse.getResults());
            notFoundLabel.setText("");
        }
        else
        {
            //Displaying text label if no superhero is found.
            notFoundLabel.setText("Super Hero not found");
        }
    }

}

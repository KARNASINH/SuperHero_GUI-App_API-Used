package com.example.assignment2gc200478377;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class SearchSuperheroViewController implements Initializable
{

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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        getDetailsButton.setVisible(false);
        notFoundLabel.setText("");

        listView.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSuperheroSelected, newSuperheroSelected) ->
                {
                    try
                    {
                        imageView.setImage(new Image(newSuperheroSelected.getImage().getUrl()));
                    }
                    catch (IllegalArgumentException e)
                    {
                        imageView.setImage(new Image("https://ih1.redbubble.net/image.1893341687.8294/poster,504x498,f8f8f8-pad,600x600,f8f8f8.jpg"));
                    }
                    catch (NullPointerException e)
                    {
                        imageView.setImage(new Image("https://ih1.redbubble.net/image.1893341687.8294/poster,504x498,f8f8f8-pad,600x600,f8f8f8.jpg"));
                    }
                });
    }

    @FXML
    private void searchSuperhero()
    {
        ApiResponse apiResponse = APIUtility.getSearchFromAPI(searchTextField.getText());
        listView.getItems().clear();

        if(apiResponse.getResults() != null)
        {
            listView.getItems().addAll(apiResponse.getResults());
            notFoundLabel.setText("");
        }
        else
        {
            notFoundLabel.setText("Super Hero not found");
            imageView.setImage(new Image("https://ih1.redbubble.net/image.1893341687.8294/poster,504x498,f8f8f8-pad,600x600,f8f8f8.jpg"));
        }
    }

}

package com.example.assignment2gc200478377;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
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

    }

    @FXML
    private void searchSuperhero()
    {
        ApiResponse apiResponse = APIUtility.getSearchFromAPI(searchTextField.getText());
        listView.getItems().addAll(apiResponse.getResults());

    }

}

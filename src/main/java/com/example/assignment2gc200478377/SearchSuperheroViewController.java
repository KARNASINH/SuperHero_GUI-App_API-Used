package com.example.assignment2gc200478377;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class SearchSuperheroViewController {

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

}

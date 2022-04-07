package com.example.assignment2gc200478377;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SearchSuperheroViewController
{
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick()
    {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
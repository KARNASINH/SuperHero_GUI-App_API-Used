package com.example.assignment2gc200478377;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main
    //extends Application
{
/*
    @Override
    public void start(Stage stage) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hourly_stock_data.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
*/
    public static void main(String[] args)
    {
        //launch();

        System.out.println();

        ApiResponse api = APIUtility.getStockData("ABNB");
        System.out.println(api);
    }
}
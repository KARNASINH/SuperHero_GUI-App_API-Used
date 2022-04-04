package com.example.assignment2gc200478377;
import com.google.gson.Gson;
import javafx.event.Event;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIUtility
{
    public static ApiResponse getStockData(String stockName)
    {
        stockName = stockName.replace(" ", "%20");

        String uriOriginal = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=TSLA&outputsize=full&apikey=a95ba2b080msh83c3a3fe72eae71p1426fbjsn0a0c857b5ebb";
        String uri = uriOriginal.replace("TSLA", stockName);


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        try
        {
            HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            //System.out.println("Karna : " + response);
            Gson gson = new Gson();
            //System.out.println(response.body());
            return gson.fromJson(response.body(), ApiResponse.class);


            //System.out.println("KBG-Body : " + gson.fromJson(response.body(), ApiResponse.class));
        } catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }
}

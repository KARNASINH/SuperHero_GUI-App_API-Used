package com.example.assignment2gc200478377;
import com.google.gson.Gson;
import javafx.event.Event;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIUtility
{
    public static ApiResponse getSearchFromAPI(String searchName)
    {
        searchName = searchName.replace(" ", "%20");

        String uri = "https://www.superheroapi.com/api.php/1310202806140671/search/" + searchName;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        try {
            HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            return gson.fromJson(response.body(), ApiResponse.class);

        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }

    public static Result getSuperhero(String id)
    {
        String uri = "https://www.superheroapi.com/api.php/1310202806140671/" + id;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        try {
            HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            return gson.fromJson(response.body(), Result.class);

        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;
    }
}

//This class is a part of this package
package com.example.assignment2gc200478377;

//Imported different classes to use their functionality.
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * This class uses a GSON library to parse JSON objects into respective java variables and objects.
 */
public class APIUtility
{
    /**
     * This method will call the API and return the JAVA object.
     * @param searchName This method take a hero name as an argument.
     * @return This method will return a JAVA object.
     */
    public static ApiResponse getSearchFromAPI(String searchName)
    {
        //This will add "%20" instead of any space in search name because browser can't process with spaced name.
        searchName = searchName.replace(" ", "%20");

        //This is the API request string which gives us JSON format data.
        String uri = "https://www.superheroapi.com/api.php/1310202806140671/search/" + searchName;

        HttpClient client = HttpClient.newHttpClient();
        //Sending an HTTP request.
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        try {
            //Storing returned response string format JSON into the variable.
            HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            //Creating a GSON object.
            Gson gson = new Gson();
            //Mapping JSON Object to respective JAVA object and return as a output of this method.
            return gson.fromJson(response.body(), ApiResponse.class);

        }catch (Exception e)
        {
            //Display error if HTTP request doesn't succeed.
            e.printStackTrace();
        }

        //Return NULL if no JSON object is parsed successfully.
        return null;
    }

    /**
     * This method take ID as an argument, call API and return the JAVA object.
     * @param id This method take an ID as an argument.
     * @return This method will return a JAVA object.
     */
    public static Result getSuperhero(String id)
    {
        //This is the API request string which gives us JSON format data.
        String uri = "https://www.superheroapi.com/api.php/1310202806140671/" + id;

        HttpClient client = HttpClient.newHttpClient();
        //Sending an HTTP request.
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        try {
            //Storing returned response string format JSON into the variable.
            HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            //Creating a GSON object.
            Gson gson = new Gson();
            //Mapping JSON Object to respective JAVA object and return as a output of this method.
            return gson.fromJson(response.body(), Result.class);

        }catch (Exception e)
        {
            //Display error if HTTP request doesn't succeed.
            e.printStackTrace();
        }

        //Return NULL if no JSON object is parsed successfully.
        return null;
    }
}

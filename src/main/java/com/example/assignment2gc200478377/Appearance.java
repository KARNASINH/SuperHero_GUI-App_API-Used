//This class is a part of this package
package com.example.assignment2gc200478377;

//Imported different classes to use their functionality.
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/**
 * This class store all appearance of superhero into respective fields and returns them when getter method is called.
 */
public class Appearance
{
    //Declaring different field to store values in them.
    private String gender;
    private String race;

    //This field holds array datatype to store multiple values in indexes.
    private ArrayList<String> height;
    private ArrayList<String> weight;

    //@SerializedName is the name that is shown in the JSON file, this allows you to name your variable in Java to whatever you want.
    @SerializedName("eye-color")
    private String eyeColour;

    @SerializedName("hair-color")
    private String hairColour;

    //Getter method to access private field.
    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public ArrayList<String> getHeight() {
        return height;
    }

    public ArrayList<String> getWeight() {
        return weight;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public String getHairColour() {
        return hairColour;
    }
}
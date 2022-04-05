package com.example.assignment2gc200478377;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Appearance {
    private String gender;
    private String race;
    private ArrayList<String> height;
    private ArrayList<String> weight;

    @SerializedName("eye-color")
    private String eyeColour;

    @SerializedName("hair-color")
    private String hairColour;

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
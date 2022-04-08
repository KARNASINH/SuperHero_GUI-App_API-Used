//This class is a part of this package
package com.example.assignment2gc200478377;

/**
 * This class store all topmost Result object JSON data into respective fields and returns them when getter method is called.
 */
public class Result
{
    //Declaring different field to store values in them.
    private String id;
    private String name;
    private Powerstats powerstats;
    private Appearance appearance;
    private SuperheroImage image;

    //Getter method to access private field.
    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public Powerstats getPowerstats()
    {
        return powerstats;
    }

    public Appearance getAppearance()
    {
        return appearance;
    }

    public SuperheroImage getImage()
    {
        return image;
    }

    //This will return string of Superhero ID and name together.
    public String toString()
    {
        return String.format(id + "-" + name);
    }
}

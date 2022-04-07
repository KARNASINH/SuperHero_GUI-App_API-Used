package com.example.assignment2gc200478377;

public class Result
{
    private String id;
    private String name;
    private Powerstats powerstats;
    private Appearance appearance;
    private SuperheroImage image;

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

    public String toString()
    {
        return String.format(id + "-" + name);
    }
}

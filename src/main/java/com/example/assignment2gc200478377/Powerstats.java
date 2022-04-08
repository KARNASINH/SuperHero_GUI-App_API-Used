//This class is a part of this package
package com.example.assignment2gc200478377;

/**
 * This class store all Power statics of superhero into respective fields and returns them when getter method is called.
 */
public class Powerstats
{
    //Declaring different field to store values in them.
    private String intelligence;
    private String strength;
    private String speed;
    private String durability;
    private String power;
    private String combat;

    //Getter method to access private field.
    //In all getter method validation is added to check of there is "null" keyword in JSON object then it simply change to "-".
    public String getIntelligence() {
        if (intelligence.equalsIgnoreCase("null"))
        {
            return "-";
        }
        else
        {
            return intelligence;
        }
    }

    public String getStrength() {
        if (strength.equalsIgnoreCase("null"))
        {
            return "-";
        }
        else
        {
            return strength;
        }
    }

    public String getSpeed() {
        if (speed.equalsIgnoreCase("null"))
        {
            return "-";
        }
        else
        {
            return speed;
        }
    }

    public String getDurability() {
        if (durability.equalsIgnoreCase("null"))
        {
            return "-";
        }
        else
        {
            return durability;
        }
    }

    public String getPower() {
        if (power.equalsIgnoreCase("null"))
        {
            return "-";
        }
        else
        {
            return power;
        }
    }

    public String getCombat() {
        if (combat.equalsIgnoreCase("null"))
        {
            return "-";
        }
        else
        {
            return combat;
        }
    }
}

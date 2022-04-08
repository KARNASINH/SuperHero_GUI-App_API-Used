package com.example.assignment2gc200478377;

public class Powerstats
{
    private String intelligence;
    private String strength;
    private String speed;
    private String durability;
    private String power;
    private String combat;

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

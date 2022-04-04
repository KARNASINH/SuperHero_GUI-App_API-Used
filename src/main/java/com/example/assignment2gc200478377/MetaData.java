package com.example.assignment2gc200478377;

import com.google.gson.annotations.SerializedName;

public class MetaData
{
    @SerializedName("1. Information")
    private String information;

    @SerializedName("2. Symbol")
    private String symbol;

    @SerializedName("3. Last Refreshed")
    private String lastRefreshed;

    @SerializedName("4. Output Size")
    private String outputSize;

    @SerializedName("5. Time Zone")
    private String timeZone;

    public String getInformation()
    {
        return information;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public String getLastRefreshed()
    {
        return lastRefreshed;
    }

    public String getOutputSize()
    {
        return outputSize;
    }

    public String getTimeZone()
    {
        return timeZone;
    }
}

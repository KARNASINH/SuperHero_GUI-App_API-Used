package com.example.assignment2gc200478377;

import com.google.gson.annotations.SerializedName;

public class StockDetail
{
    @SerializedName("Information")
    private String information;

    @SerializedName("Symbol")
    private String symbol;

    @SerializedName("Last Refreshed")
    private String lastRefreshed;

    @SerializedName("Output Size")
    private String outputSize;

    @SerializedName("Time Zone")
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

package com.example.assignment2gc200478377;

import com.google.gson.annotations.SerializedName;

public class StockData
{

    @SerializedName("1. open")
    private float open;

    @SerializedName("2. high")
    private float high;

    @SerializedName("3. low")
    private float low;

    @SerializedName("4. close")
    private float close;

    @SerializedName("5. volume")
    private int volume;

    public float getOpen()
    {
        return open;
    }

    public float getHigh()
    {
        return high;
    }

    public float getLow()
    {
        return low;
    }

    public float getClose()
    {
        return close;
    }

    public int getVolume()
    {
        return volume;
    }
}

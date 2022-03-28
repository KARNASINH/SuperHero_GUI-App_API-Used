package com.example.assignment2gc200478377;
import com.google.gson.annotations.SerializedName;

public class ApiResponse
{
    @SerializedName("Meta Data")
    private StockDetail[] metaData;

    @SerializedName("Time Series (Daily)")
    private HourlyStockData[]  timeSeriesDaily;



    public StockDetail[] getMetaData()
    {
        return metaData;
    }

    public HourlyStockData[] getTimeSeriesDaily()
    {
        return timeSeriesDaily;
    }
}

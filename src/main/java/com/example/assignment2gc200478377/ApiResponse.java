package com.example.assignment2gc200478377;
import com.google.gson.annotations.SerializedName;

public class ApiResponse
{
    @SerializedName("Meta Data")
    private MetaData metaData;

    @SerializedName("Time Series (Daily)")
    private PeriodicsStockDetail timeSeriesDaily;


    public MetaData getMetaData()
    {
        return metaData;
    }

    public PeriodicsStockDetail getTimeSeriesDaily()
    {
        return timeSeriesDaily;
    }

}

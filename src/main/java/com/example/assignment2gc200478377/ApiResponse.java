//Imported different classes to use their functionality.
package com.example.assignment2gc200478377;

/**
 * This Class received API response in JSON format and map its object with defined variable name.
 */
public class ApiResponse
{
    //Declared instance field to map JSON object.
    private Result[] results;

    //Getter method to get the data.
    public Result[] getResults() {
        return results;
    }
}

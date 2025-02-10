package com.sap.taskcenter.model.TaskDefinitions;

// Class to handle DataDriven UI Settings
public class DataDrivenUISettings {
    private DataDetailsParameters dataDetailsParameters;

    // Constructor
    public DataDrivenUISettings(DataDetailsParameters dataDetailsParameters) {
        this.dataDetailsParameters = dataDetailsParameters;
    }

    // Getters and Setters
    public DataDetailsParameters getDataDetailsParameters() {
        return dataDetailsParameters;
    }

    public void setDataDetailsParameters(DataDetailsParameters dataDetailsParameters) {
        this.dataDetailsParameters = dataDetailsParameters;
    }

    // Method to convert to JSON (or String)
    public String toJSON() {
        return String.format("{\"dataDetailsParameters\": %s}",
                dataDetailsParameters.toJSON());
    }
}
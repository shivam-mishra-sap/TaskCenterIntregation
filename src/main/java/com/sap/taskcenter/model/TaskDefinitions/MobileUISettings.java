package com.sap.taskcenter.model.TaskDefinitions;

// Class to handle MobileUISettings (contains DataDriven UI Settings)
public class MobileUISettings {
    private String uiType;
    private DataDrivenUISettings dataDrivenUISettings;

    // Constructor
    public MobileUISettings(String uiType, DataDrivenUISettings dataDrivenUISettings) {
        this.uiType = uiType;
        this.dataDrivenUISettings = dataDrivenUISettings;
    }

    // Getters and Setters
    public String getUiType() {
        return uiType;
    }

    public void setUiType(String uiType) {
        this.uiType = uiType;
    }

    public DataDrivenUISettings getDataDrivenUISettings() {
        return dataDrivenUISettings;
    }

    public void setDataDrivenUISettings(DataDrivenUISettings dataDrivenUISettings) {
        this.dataDrivenUISettings = dataDrivenUISettings;
    }

    // Method to convert to JSON
    public String toJSON() {
        return String.format("{\"uiType\": \"%s\", \"dataDrivenUISettings\": %s}",
                uiType, dataDrivenUISettings.toJSON());
    }
}
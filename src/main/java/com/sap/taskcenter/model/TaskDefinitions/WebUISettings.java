package com.sap.taskcenter.model.TaskDefinitions;

// Class to handle WebUISettings (contains IFrame UI Settings)
public class WebUISettings {
    private String uiType;
    private IFrameUISettings iframeUISettings;

    // Constructor
    public WebUISettings(String uiType, IFrameUISettings iframeUISettings) {
        this.uiType = uiType;
        this.iframeUISettings = iframeUISettings;
    }

    // Getters and Setters
    public String getUiType() {
        return uiType;
    }

    public void setUiType(String uiType) {
        this.uiType = uiType;
    }

    public IFrameUISettings getIframeUISettings() {
        return iframeUISettings;
    }

    public void setIframeUISettings(IFrameUISettings iframeUISettings) {
        this.iframeUISettings = iframeUISettings;
    }

    // Method to convert to JSON
    public String toJSON() {
        return String.format("{\"uiType\": \"%s\", \"iframeUISettings\": %s}",
                uiType, iframeUISettings.toJSON());
    }
}
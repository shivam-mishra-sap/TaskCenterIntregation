package com.sap.taskcenter.model.TaskDefinitions;

// Class to handle Web and Mobile UI Settings
public class TaskDetailsSettings {
    private WebUISettings webUISettings;
    private MobileUISettings mobileUISettings;

    // Constructor
    public TaskDetailsSettings(WebUISettings webUISettings, MobileUISettings mobileUISettings) {
        this.webUISettings = webUISettings;
        this.mobileUISettings = mobileUISettings;
    }

    // Getters and Setters
    public WebUISettings getWebUISettings() {
        return webUISettings;
    }

    public void setWebUISettings(WebUISettings webUISettings) {
        this.webUISettings = webUISettings;
    }

    public MobileUISettings getMobileUISettings() {
        return mobileUISettings;
    }

    public void setMobileUISettings(MobileUISettings mobileUISettings) {
        this.mobileUISettings = mobileUISettings;
    }

    // Method to convert the entire settings to JSON
    public String toJSON() {
        return String.format("{\"webUISettings\": %s, \"mobileUISettings\": %s}",
                webUISettings.toJSON(), mobileUISettings.toJSON());
    }
}

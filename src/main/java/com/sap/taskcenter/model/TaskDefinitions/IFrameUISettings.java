package com.sap.taskcenter.model.TaskDefinitions;

// Class to handle IFrame UI Settings
public class IFrameUISettings {
    private boolean enableActions;
    private boolean enableAttachments;
    private boolean enableComments;
    private String urlParams;

    // Constructor
    public IFrameUISettings(boolean enableActions, boolean enableAttachments, boolean enableComments,
            String urlParams) {
        this.enableActions = enableActions;
        this.enableAttachments = enableAttachments;
        this.enableComments = enableComments;
        this.urlParams = urlParams;
    }

    // Getters and Setters
    public boolean isEnableActions() {
        return enableActions;
    }

    public void setEnableActions(boolean enableActions) {
        this.enableActions = enableActions;
    }

    public boolean isEnableAttachments() {
        return enableAttachments;
    }

    public void setEnableAttachments(boolean enableAttachments) {
        this.enableAttachments = enableAttachments;
    }

    public boolean isEnableComments() {
        return enableComments;
    }

    public void setEnableComments(boolean enableComments) {
        this.enableComments = enableComments;
    }

    public String getUrlParams() {
        return urlParams;
    }

    public void setUrlParams(String urlParams) {
        this.urlParams = urlParams;
    }

    // Method to convert the settings to a Map (or JSON)
    public String toJSON() {
        return String.format(
                "{\"enableActions\": %b, \"enableAttachments\": %b, \"enableComments\": %b, \"urlParams\": \"%s\"}",
                enableActions, enableAttachments, enableComments, urlParams);
    }
}
package com.sap.taskcenter.model.Response;

public class SourcingProjectResponse {
    private String title;
    private String description;
    private String internalId;
    private String templateProjectInternalId;
    private String templateProjectTitle;
    private String displayVersion;
    private String status;
    private String state;
    private String origin;
    private String baseLanguage;

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInternalId() {
        return internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public String getTemplateProjectInternalId() {
        return templateProjectInternalId;
    }

    public void setTemplateProjectInternalId(String templateProjectInternalId) {
        this.templateProjectInternalId = templateProjectInternalId;
    }

    public String getTemplateProjectTitle() {
        return templateProjectTitle;
    }

    public void setTemplateProjectTitle(String templateProjectTitle) {
        this.templateProjectTitle = templateProjectTitle;
    }

    public String getDisplayVersion() {
        return displayVersion;
    }

    public void setDisplayVersion(String displayVersion) {
        this.displayVersion = displayVersion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getBaseLanguage() {
        return baseLanguage;
    }

    public void setBaseLanguage(String baseLanguage) {
        this.baseLanguage = baseLanguage;
    }

    @Override
    public String toString() {
        return "SourcingProjectResponse [title=" + title + ", description=" + description + ", internalId=" + internalId
                + ", templateProjectInternalId=" + templateProjectInternalId + ", templateProjectTitle="
                + templateProjectTitle + ", displayVersion=" + displayVersion + ", status=" + status + ", state="
                + state + ", origin=" + origin + ", baseLanguage=" + baseLanguage + "]";
    }

}

package com.sap.taskcenter.model.TaskDefinitions;

public class DataDetailsParameters {
    private String path;
    private String accept;

    // Constructor
    public DataDetailsParameters(String path, String accept) {
        this.path = path;
        this.accept = accept;
    }

    // Getters and Setters
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    // Method to convert to JSON (or String)
    public String toJSON() {
        return String.format("{\"path\": \"%s\", \"accept\": \"%s\"}", path, accept);
    }
}
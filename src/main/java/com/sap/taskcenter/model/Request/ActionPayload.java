package com.sap.taskcenter.model.Request;

import java.util.Map;

public class ActionPayload {

    private String actionableType;
    private String uniqueName;
    private String actionName;
    private Map<String, Object> options;

    // Default constructor
    public ActionPayload() {
    }

    // Constructor with parameters
    public ActionPayload(String actionableType, String uniqueName, String actionName, Map<String, Object> options) {
        this.actionableType = actionableType;
        this.uniqueName = uniqueName;
        this.actionName = actionName;
        this.options = options;
    }

    // Getters and Setters
    public String getActionableType() {
        return actionableType;
    }

    public void setActionableType(String actionableType) {
        this.actionableType = actionableType;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public Map<String, Object> getOptions() {
        return options;
    }

    public void setOptions(Map<String, Object> options) {
        this.options = options;
    }

    // Override toString() for better object representation (optional)
    @Override
    public String toString() {
        return "ActionPayload{" +
                "actionableType='" + actionableType + '\'' +
                ", uniqueName='" + uniqueName + '\'' +
                ", actionName='" + actionName + '\'' +
                ", options=" + options +
                '}';
    }
}

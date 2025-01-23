package com.sap.taskcenter.model.TaskDefinitions;

import java.util.List;

import com.sap.taskcenter.model.TaskDefinitions.Enums.Capabilities;

public class TaskDefinition {

    private String urn;
    private String applicationId;
    private String applicationInstanceId;
    private String tenantId;
    private String localId;
    private List<LocalizedText> name;
    private List<ResponseDefinition> possibleResponses;
    private List<ActionDefinition> possibleActions;
    private List<CustomAttributeDefinition> customAttributes;
    private List<Capabilities> capabilities;
    private TaskDetailsSettings taskDetailsSettings;

    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationInstanceId() {
        return applicationInstanceId;
    }

    public void setApplicationInstanceId(String applicationInstanceId) {
        this.applicationInstanceId = applicationInstanceId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public List<LocalizedText> getName() {
        return name;
    }

    public void setName(List<LocalizedText> name) {
        this.name = name;
    }

    public List<ResponseDefinition> getPossibleResponses() {
        return possibleResponses;
    }

    public void setPossibleResponses(List<ResponseDefinition> possibleResponses) {
        this.possibleResponses = possibleResponses;
    }

    public List<ActionDefinition> getPossibleActions() {
        return possibleActions;
    }

    public void setPossibleActions(List<ActionDefinition> possibleActions) {
        this.possibleActions = possibleActions;
    }

    public List<CustomAttributeDefinition> getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(List<CustomAttributeDefinition> customAttributes) {
        this.customAttributes = customAttributes;
    }

    public List<Capabilities> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(List<Capabilities> capabilities) {
        this.capabilities = capabilities;
    }

    public TaskDetailsSettings getTaskDetailsSettings() {
        return taskDetailsSettings;
    }

    public void setTaskDetailsSettings(TaskDetailsSettings taskDetailsSettings) {
        this.taskDetailsSettings = taskDetailsSettings;
    }

}

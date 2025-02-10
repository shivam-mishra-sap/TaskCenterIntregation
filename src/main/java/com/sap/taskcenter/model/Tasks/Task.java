package com.sap.taskcenter.model.Tasks;

import java.util.List;
import com.sap.taskcenter.model.TaskDefinitions.LocalizedText;

public class Task {

    private String urn;
    private String applicationId;
    private String applicationInstanceId;
    private String tenantId;
    private String localId;
    private String definitionId;
    private String status;
    private String createdAt;
    private String createdBy;
    private String modifiedAt;
    private String modifiedBy;
    private String processor;
    private List<LocalizedText> subject;
    private String dueAt;
    private String completedAt;
    private String priority;
    private String uiLink;
    private String mobileUiLink;
    private String embeddableUiLink;
    private int attachmentsCount;
    private int commentsCount;
    private List<String> validResponseCodes;
    private List<String> validActionCodes;
    private List<CustomAttributes> customAttributes;
    private List<OperationErrors> operationErrors;
    private List<String> recipientUsers;
    private List<String> recipientGroups;

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
    public String getDefinitionId() {
        return definitionId;
    }
    public void setDefinitionId(String definitionId) {
        this.definitionId = definitionId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getModifiedAt() {
        return modifiedAt;
    }
    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
    public String getModifiedBy() {
        return modifiedBy;
    }
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public List<LocalizedText> getSubject() {
        return subject;
    }
    public void setSubject(List<LocalizedText> subject) {
        this.subject = subject;
    }
    public String getDueAt() {
        return dueAt;
    }
    public void setDueAt(String dueAt) {
        this.dueAt = dueAt;
    }
    public String getCompletedAt() {
        return completedAt;
    }
    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public String getUiLink() {
        return uiLink;
    }
    public void setUiLink(String uiLink) {
        this.uiLink = uiLink;
    }
    public String getMobileUiLink() {
        return mobileUiLink;
    }
    public void setMobileUiLink(String mobileUiLink) {
        this.mobileUiLink = mobileUiLink;
    }
    public String getEmbeddableUiLink() {
        return embeddableUiLink;
    }
    public void setEmbeddableUiLink(String embeddableUiLink) {
        this.embeddableUiLink = embeddableUiLink;
    }
    public int getAttachmentsCount() {
        return attachmentsCount;
    }
    public void setAttachmentsCount(int attachmentsCount) {
        this.attachmentsCount = attachmentsCount;
    }
    public int getCommentsCount() {
        return commentsCount;
    }
    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }
    public List<String> getValidResponseCodes() {
        return validResponseCodes;
    }
    public void setValidResponseCodes(List<String> validResponseCodes) {
        this.validResponseCodes = validResponseCodes;
    }
    public List<String> getValidActionCodes() {
        return validActionCodes;
    }
    public void setValidActionCodes(List<String> validActionCodes) {
        this.validActionCodes = validActionCodes;
    }
    public List<CustomAttributes> getCustomAttributes() {
        return customAttributes;
    }
    public void setCustomAttributes(List<CustomAttributes> customAttributes) {
        this.customAttributes = customAttributes;
    }
    public List<OperationErrors> getOperationErrors() {
        return operationErrors;
    }
    public void setOperationErrors(List<OperationErrors> operationErrors) {
        this.operationErrors = operationErrors;
    }
    public List<String> getRecipientUsers() {
        return recipientUsers;
    }
    public void setRecipientUsers(List<String> recipientUsers) {
        this.recipientUsers = recipientUsers;
    }
    public List<String> getRecipientGroups() {
        return recipientGroups;
    }
    public void setRecipientGroups(List<String> recipientGroups) {
        this.recipientGroups = recipientGroups;
    }

}
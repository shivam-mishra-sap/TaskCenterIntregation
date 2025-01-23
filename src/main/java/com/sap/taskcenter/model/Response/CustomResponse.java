package com.sap.taskcenter.model.Response;

public class CustomResponse {

    private int changeSequenceId;
    private String approvableId;
    private String approvableUniqueName;
    private String realm;

    public int getChangeSequenceId() {
        return changeSequenceId;
    }

    public void setChangeSequenceId(int changeSequenceId) {
        this.changeSequenceId = changeSequenceId;
    }

    public String getApprovableId() {
        return approvableId;
    }

    public void setApprovableId(String approvableId) {
        this.approvableId = approvableId;
    }

    public String getApprovableUniqueName() {
        return approvableUniqueName;
    }

    public void setApprovableUniqueName(String approvableUniqueName) {
        this.approvableUniqueName = approvableUniqueName;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }

    @Override
    public String toString() {
        return "CustomResponse [changeSequenceId=" + changeSequenceId + ", approvableId=" + approvableId
                + ", approvableUniqueName=" + approvableUniqueName + ", realm=" + realm + "]";
    }

}

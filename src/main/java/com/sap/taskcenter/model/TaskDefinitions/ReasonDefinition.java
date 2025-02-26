package com.sap.taskcenter.model.TaskDefinitions;

public class ReasonDefinition {
    private String code;
    private LocalizedText[] name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalizedText[] getName() {
        return name;
    }

    public void setName(LocalizedText[] name) {
        this.name = name;
    }
}

package com.sap.taskcenter.model.TaskDefinitions;

import java.util.List;

public class ReasonDefinition {
    private String code;
    private List<LocalizedText> name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<LocalizedText> getName() {
        return name;
    }

    public void setName(List<LocalizedText> name) {
        this.name = name;
    }
}

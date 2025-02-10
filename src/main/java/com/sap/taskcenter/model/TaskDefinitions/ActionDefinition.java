package com.sap.taskcenter.model.TaskDefinitions;

import java.util.List;

import com.sap.taskcenter.model.TaskDefinitions.Enums.CommentRequired;
import com.sap.taskcenter.model.TaskDefinitions.Enums.Nature;
import com.sap.taskcenter.model.TaskDefinitions.Enums.ReasonRequired;

public class ActionDefinition {

    private String code;
    private LocalizedText name;
    private Nature nature;
    private CommentRequired commentRequired;
    private ReasonRequired reasonRequired;
    private List<ReasonDefinition> possibleReasons;
    private Capabilities capabilities;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalizedText getName() {
        return name;
    }

    public void setName(LocalizedText name) {
        this.name = name;
    }

    public List<ReasonDefinition> getPossibleReasons() {
        return possibleReasons;
    }

    public void setPossibleReasons(List<ReasonDefinition> possibleReasons) {
        this.possibleReasons = possibleReasons;
    }

    public Capabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    @Override
    public String toString() {
        return "ActionDefinition [code=" + code + ", name=" + name + ", possibleReasons=" + possibleReasons
                + ", capabilities=" + capabilities + "]";
    }
}

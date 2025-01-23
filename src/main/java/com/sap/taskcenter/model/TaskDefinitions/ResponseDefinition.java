package com.sap.taskcenter.model.TaskDefinitions;

import java.util.List;

import com.sap.taskcenter.model.TaskDefinitions.Enums.Capabilities;
import com.sap.taskcenter.model.TaskDefinitions.Enums.CommentRequired;
import com.sap.taskcenter.model.TaskDefinitions.Enums.Nature;
import com.sap.taskcenter.model.TaskDefinitions.Enums.ReasonRequired;

public class ResponseDefinition {

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

    public Nature getNature() {
        return nature;
    }

    public void setNature(Nature nature) {
        this.nature = nature;
    }

    public CommentRequired getCommentRequired() {
        return commentRequired;
    }

    public void setCommentRequired(CommentRequired commentRequired) {
        this.commentRequired = commentRequired;
    }

    public ReasonRequired getReasonRequired() {
        return reasonRequired;
    }

    public void setReasonRequired(ReasonRequired reasonRequired) {
        this.reasonRequired = reasonRequired;
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
        return "ResponseDefinition [code=" + code + ", name=" + name + ", nature=" + nature + ", commentRequired="
                + commentRequired + ", reasonRequired=" + reasonRequired + ", possibleReasons=" + possibleReasons
                + ", capabilities=" + capabilities + "]";
    }

}

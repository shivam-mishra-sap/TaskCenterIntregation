package com.sap.taskcenter.model.TaskDefinitions;

import java.util.List;

public class CustomAttributeDefinition {

    private String code;
    private String type;
    private String format;
    private List<LocalizedText> name;
    private int rank;

    @Override
    public String toString() {
        return "CustomAttributeDefinition [code=" + code + ", type=" + type + ", format=" + format + ", name=" + name
                + ", rank=" + rank + "]";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public List<LocalizedText> getName() {
        return name;
    }

    public void setName(List<LocalizedText> name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

}

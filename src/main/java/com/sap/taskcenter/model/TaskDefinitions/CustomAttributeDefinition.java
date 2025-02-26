package com.sap.taskcenter.model.TaskDefinitions;

import java.util.Arrays;

public class CustomAttributeDefinition {

    private String code;
    private String type;
    private String format;
    private LocalizedText[] name;
    private int rank;

    public CustomAttributeDefinition(String code, String type, String format, LocalizedText[] name, int rank) {
        this.code = code;
        this.type = type;
        this.format = format;
        this.name = name;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "CustomAttributeDefinition [code=" + code + ", type=" + type + ", format=" + format + ", name="
                + Arrays.toString(name) + ", rank=" + rank + "]";
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

    public LocalizedText[] getName() {
        return name;
    }

    public void setName(LocalizedText[] name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

}

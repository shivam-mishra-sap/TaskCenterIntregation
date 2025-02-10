package com.sap.taskcenter.model.TaskDefinitions;

import com.sap.taskcenter.model.TaskDefinitions.Enums.Name;

public class Capabilities {

    private Name name;
    private boolean value;

    public Capabilities(Name name, boolean value) {
        this.name = name;
        this.value = value;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

}
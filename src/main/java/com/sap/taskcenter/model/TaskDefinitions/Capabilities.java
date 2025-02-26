package com.sap.taskcenter.model.TaskDefinitions;

import com.sap.taskcenter.model.TaskDefinitions.Enums.Name;

public class Capabilities {

    private String name;
    private boolean value;

    public Capabilities(Name name, boolean value) {
        this.name = name.getFormattedName();
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Capabilities [name=" + name + ", value=" + value + "]";
    }

}
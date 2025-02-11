package com.sap.taskcenter.model.Capabilities;

public class Capabilities {

    private String name;
    private String value;

    public Capabilities(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Capabilities [name=" + name + ", value=" + value + "]";
    }

}

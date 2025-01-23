package com.sap.taskcenter.model.TaskDefinitions.Enums;

public enum Capabilities {

    ATTACHMENTS("attachments"),
    ATTACHMENTS_CREATE("attachments.create"),
    COMMENTS("comments"),
    COMMENTS_CREATE("comments.create"),
    TASKDESCRIPTION("TASKS.DESCRIPTION");

    Capabilities(final String name) {
        this.name = name;
    }

    private final String name;
    private boolean value;

    public String getName() {
        return name;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

}
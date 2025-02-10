package com.sap.taskcenter.model.TaskDefinitions.Enums;

public enum Name {
    ATTACHMENTS("attachments"),
    ATTACHMENTS_CREATE("attachments.create"),
    COMMENTS("comments"),
    COMMENTS_CREATE("comments.create"),
    TASKS_DESCRIPTION("tasks.description");

    private final String value;

    // Constructor
    Name(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

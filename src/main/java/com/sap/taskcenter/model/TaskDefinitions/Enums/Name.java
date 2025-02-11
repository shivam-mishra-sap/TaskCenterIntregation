package com.sap.taskcenter.model.TaskDefinitions.Enums;

public enum Name {
    ATTACHMENTS,
    ATTACHMENTS_CREATE,
    COMMENTS,
    COMMENTS_CREATE,
    TASKS_DESCRIPTION,
    TASKS_BULK_OPERATIONS,
    SUBSTITUTIONS;

    // Convert enum name to a string (with lowercase and underscores replaced by
    // periods if needed)
    public String getFormattedName() {
        return name().toLowerCase().replace("_", ".");
    }
}

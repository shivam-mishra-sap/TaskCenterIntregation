package com.sap.taskcenter.model.TaskDefinitions.Enums;

// Enum to represent the possible values of commentRequired
public enum CommentRequired {
    REQUIRED("REQUIRED"),
    OPTIONAL("OPTIONAL"),
    UNSUPPORTED("UNSUPPORTED");

    private final String value;

    // Constructor
    CommentRequired(String value) {
        this.value = value;
    }

    // Getter to get the value of the enum
    public String getValue() {
        return value;
    }

    // Method to check if a given string is a valid enum value
    public static boolean isValid(String commentRequiredValue) {
        for (CommentRequired commentRequired : CommentRequired.values()) {
            if (commentRequired.value.equalsIgnoreCase(commentRequiredValue)) {
                return true;
            }
        }
        return false;
    }
}

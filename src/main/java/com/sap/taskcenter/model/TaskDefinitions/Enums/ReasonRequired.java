package com.sap.taskcenter.model.TaskDefinitions.Enums;

public enum ReasonRequired {
    REQUIRED("REQUIRED"),
    OPTIONAL("OPTIONAL"),
    UNSUPPORTED("UNSUPPORTED");

    private final String value;

    // Constructor
    ReasonRequired(String value) {
        this.value = value;
    }

    // Getter to get the value of the enum
    public String getValue() {
        return value;
    }

    // Method to check if a given string is a valid enum value
    public static boolean isValid(String ReasonRequiredValue) {
        for (ReasonRequired ReasonRequired : ReasonRequired.values()) {
            if (ReasonRequired.value.equalsIgnoreCase(ReasonRequiredValue)) {
                return true;
            }
        }
        return false;
    }
}
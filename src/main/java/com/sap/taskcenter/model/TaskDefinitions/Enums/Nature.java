package com.sap.taskcenter.model.TaskDefinitions.Enums;

public enum Nature {
    POSITIVE("POSITIVE"),
    NEGATIVE("NEGATIVE"),
    NEUTRAL("NEUTRAL");

    private final String value;

    // Constructor
    Nature(String value) {
        this.value = value;
    }

    // Getter to get the value of the enum
    public String getValue() {
        return value;
    }

    // Method to check if a given string is a valid enum value
    public static boolean isValid(String natureValue) {
        for (Nature nature : Nature.values()) {
            if (nature.value.equalsIgnoreCase(natureValue)) {
                return true;
            }
        }
        return false;
    }
}

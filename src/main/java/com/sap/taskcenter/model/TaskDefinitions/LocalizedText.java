package com.sap.taskcenter.model.TaskDefinitions;

public class LocalizedText {

    private LanguageCode languageCode;
    private String text;
    private boolean isDefault;

    @Override
    public String toString() {
        return "LocalizedText [languageCode=" + languageCode + ", text=" + text + ", isDefault=" + isDefault + "]";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
    }

}

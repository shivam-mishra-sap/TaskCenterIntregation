package com.sap.taskcenter.model.TaskDefinitions;

public class LocalizedText {

    private String languageCode;
    private String text;
    private boolean isDefault;

    @Override
    public String toString() {
        return "LocalizedText [languageCode=" + languageCode + ", text=" + text + ", isDefault=" + isDefault + "]";
    }

    public LocalizedText(String languageCode, String text, boolean isDefault) {
        this.languageCode = languageCode;
        this.text = text;
        this.isDefault = isDefault;
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

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

}

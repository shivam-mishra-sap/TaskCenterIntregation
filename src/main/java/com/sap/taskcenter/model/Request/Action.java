package com.sap.taskcenter.model.Request;

import java.util.Objects;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class Action {

    @NotNull(message = "Code is required")
    @Pattern(regexp = "^[^,]+$", message = "Code must not contain commas")
    private String code;
    private String comment = null;
    private String reasonCode = null;

    // Constructor
    public Action(String code, String comment, String reasonCode) {
        this.code = code;
        this.comment = comment;
        this.reasonCode = reasonCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    // Override equals() and hashCode() for object comparison (optional)
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Action action = (Action) o;
        return Objects.equals(code, action.code) &&
                Objects.equals(comment, action.comment) &&
                Objects.equals(reasonCode, action.reasonCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, comment, reasonCode);
    }

    // Override toString() for better representation (optional)
    @Override
    public String toString() {
        return "Action{" +
                ", code='" + code + '\'' +
                ", comment='" + comment + '\'' +
                ", reasonCode='" + reasonCode + '\'' +
                '}';
    }
}

package com.sap.taskcenter.model.Response;

import java.util.List;

public class SourcingProjectsListResponse {
    private List<Payload> payload;

    // Getter and Setter for payload
    public List<Payload> getPayload() {
        return payload;
    }

    public void setPayload(List<Payload> payload) {
        this.payload = payload;
    }

    public static class Payload {
        private String internalId;
        private String createDate;
        private String lastModified;

        // Getters and Setters for Payload fields
        public String getInternalId() {
            return internalId;
        }

        public void setInternalId(String internalId) {
            this.internalId = internalId;
        }

        public String getCreateDate() {
            return createDate;
        }

        public void setCreateDate(String createDate) {
            this.createDate = createDate;
        }

        public String getLastModified() {
            return lastModified;
        }

        public void setLastModified(String lastModified) {
            this.lastModified = lastModified;
        }
    }
}

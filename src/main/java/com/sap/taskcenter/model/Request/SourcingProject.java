package com.sap.taskcenter.model.Request;

public class SourcingProject {
    private Payload payload;

    // Getters and Setters
    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "SourcingProject [payload=" + payload + "]";
    }

    public static class Payload {
        private ActualSaving actualSaving;
        private String department;

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public ActualSaving getActualSaving() {
            return actualSaving;
        }

        public void setActualSaving(ActualSaving actualSaving) {
            this.actualSaving = actualSaving;
        }

        @Override
        public String toString() {
            return "Payload [actualSaving=" + actualSaving + ", department=" + department + "]";
        }

    }

    public static class ActualSaving {
        private double amount;
        private String currency;

        // Getters and Setters
        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        @Override
        public String toString() {
            return "ActualSaving [amount=" + amount + ", currency=" + currency + "]";
        }

    }
}

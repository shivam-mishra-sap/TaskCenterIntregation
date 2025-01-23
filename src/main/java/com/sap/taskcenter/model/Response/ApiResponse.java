package com.sap.taskcenter.model.Response;

import java.util.List;

public class ApiResponse {

    private int count;
    private List<CustomResponse> value;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<CustomResponse> getValue() {
        return value;
    }

    public void setValue(List<CustomResponse> value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ApiResponse [count=" + count + ", value=" + value + "]";
    }

}

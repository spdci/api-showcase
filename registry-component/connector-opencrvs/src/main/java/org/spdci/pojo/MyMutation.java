package org.spdci.pojo;

import java.util.Map;

public class MyMutation {

    private String mutation;
    private Map<String, Object> variables;

    public MyMutation(String mutation, Map<String, Object> variables) {
        this.mutation = mutation;
        this.variables = variables;
    }

    public String getMutation() {
        return mutation;
    }

    public Map<String, Object> getVariables() {
        return variables;
    }
}

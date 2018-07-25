package com.ezyy.tms.map.enums;

public enum DrivingPolicy {
    DEFAULT(0,"默认"),BMAP_DRIVING_POLICY_AVOID_HIGHWAYS(3,"避开高速");

    private int policy;
    private String description;

    private DrivingPolicy(int policy, String description) {
        this.policy = policy;
        this.description = description;
    }

    public int getPolicy() {
        return policy;
    }

    public void setPolicy(int policy) {
        this.policy = policy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

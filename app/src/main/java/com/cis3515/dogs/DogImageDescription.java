package com.cis3515.dogs;

// Helper class
public class DogImageDescription {
    private int resourceId;
    private String description;

    public DogImageDescription(int resourceId, String description) {
        this.resourceId = resourceId;
        this.description = description;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

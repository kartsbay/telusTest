package com.telusTest.api.model;


public class Todo {
    public Todo() {
        super();
    }

    public Todo(int id, String description, String completionStatus) {
        this.id = id;
        this.description = description;
        this.completionStatus = completionStatus;
    }

    private int id;
    private String description;
    private String completionStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(String completionStatus) {
        this.completionStatus = completionStatus;
    }

}

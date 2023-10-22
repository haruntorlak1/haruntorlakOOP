package org.example;

public class TaskItem {
    private int id;
    private String description;
    private Lab3Exercise1.DataStructures.Status status;

    public TaskItem(int id, String description, Lab3Exercise1.DataStructures.Status status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Lab3Exercise1.DataStructures.Status getStatus() {
        return status;
    }




}







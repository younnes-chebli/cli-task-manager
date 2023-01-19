package com.younnescode.Task;

import java.util.Objects;

public class Task {
    private int id;
    private String description;
    private boolean done;

    public Task(int id, String name) {
        this.id = id;
        this.description = name;
        this.done = false;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public boolean isDone() {
        return done == true;
    }

    public void setDone() {
        this.done = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + description + '\'' +
                ", done=" + done +
                '}';
    }
}

package main.model;

import java.time.LocalDate;
import java.util.List;

public class Task {
    private String taskName;
    private int duration;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> dependencies;

    public Task(String taskName, int duration, List<String> dependencies) {
        this.taskName = taskName;
        this.duration = duration;
        this.dependencies = dependencies;
    }

    // Getters and setters
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
    }
}
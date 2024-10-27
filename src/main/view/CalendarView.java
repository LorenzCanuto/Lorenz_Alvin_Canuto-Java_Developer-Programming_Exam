package main.view;

import main.model.Project;
import main.model.Task;

public class CalendarView {
    public void showSchedule(Project project) {
        System.out.println("Project: " + project.getProjectName());
        for (Task task : project.getTasks()) {
            System.out.println("Task: " + task.getTaskName());
            System.out.println("Start Date: " + task.getStartDate());
            System.out.println("End Date: " + task.getEndDate());
            System.out.println();
        }
    }
}
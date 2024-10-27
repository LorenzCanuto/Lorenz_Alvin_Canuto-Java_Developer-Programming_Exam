package main.controller;

import main.model.Project;
import main.model.Task;
import main.service.CalendarService;
import main.view.CalendarView;

import java.util.List;

public class CalendarController {
    private CalendarService calendarService;
    private CalendarView calendarView;

    public CalendarController(CalendarService calendarService, CalendarView calendarView) {
        this.calendarService = calendarService;
        this.calendarView = calendarView;
    }

    public void start() {
        Project project = new Project("Project 1", List.of(
                new Task("Task 1", 5, List.of()),
                new Task("Task 2", 3, List.of()),
                new Task("Task 3", 2, List.of("Task 1")),
                new Task("Task 4", 7, List.of("Task 1", "Task 2")),
                new Task("Task 5", 3, List.of("Task 4")),
                new Task("Task 6", 3, List.of("Task 1","Task 5")),
                new Task("Task 7", 3, List.of("Task 9","Task 5"))
        ));

        calendarService.calculateSchedule(project.getTasks());
        calendarView.showSchedule(project);
    }
}
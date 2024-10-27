package main.service;

import main.model.Task;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalendarService {

    public void calculateSchedule(List<Task> tasks) {
        Map<String, Task> taskMap = new HashMap<>();
        for (Task task : tasks) {
            taskMap.put(task.getTaskName(), task);
        }

        for (Task task : tasks) {
            if (task.getStartDate() == null) {
                scheduleTask(task, taskMap);
            }
        }
    }

    private void scheduleTask(Task task, Map<String, Task> taskMap) {
        if (task.getStartDate() != null) {
            return;
        }

        LocalDate startDate = null;
        for (String dependencyName : task.getDependencies()) {
            Task dependency = taskMap.get(dependencyName);
            if (dependency != null) {
                scheduleTask(dependency, taskMap);
                if (dependency.getEndDate() != null) {
                    if (startDate == null || dependency.getEndDate().isAfter(startDate)) {
                        startDate = dependency.getEndDate();
                    }
                }
            }
        }

        if (startDate == null) {
            startDate = LocalDate.now();
        }

        task.setStartDate(startDate);
        task.setEndDate(startDate.plusDays(task.getDuration()));
    }
}
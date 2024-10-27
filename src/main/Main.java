package main;

import main.controller.CalendarController;
import main.service.CalendarService;
import main.view.CalendarView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CalendarService calendarService = new CalendarService();
        CalendarView calendarView = new CalendarView();

        CalendarController calendarController = new CalendarController(calendarService, calendarView);

        calendarController.start();
    }
}
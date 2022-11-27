package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING_TASK";
    public static final String PAINTING = "PAINTING_TASK";
    public static final String DRIVING = "DRIVING_TASK";

    public final Task makeTask(final String newTask){
        return switch (newTask) {
            case SHOPPING -> new ShoppingTask("Buy product", "Yogurt", 4);
            case PAINTING -> new PaintingTask("Paint rooms", "White", "Windowsill");
            case DRIVING ->  new DrivingTask("Taxi", "City Center", "Home");
            default -> throw new IllegalArgumentException("Selected task is incorrect.");
        };
    }
}
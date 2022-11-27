package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName;
    private String colour;
    private String whatToPaint;
    private boolean isExecuted;

    public PaintingTask(String taskName, String colour, String whatToPaint) {
        this.taskName = taskName;
        this.colour = colour;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        if (!isExecuted) {
            System.out.println("[ " +taskName+ " ]" + " is now executing");
            isExecuted = true;
        }
    }

    @Override
    public String getTaskName () {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted () {
        return isExecuted;
    }
}
package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Task taskQueue) {
        System.out.println(mentorName + ": New task to check from user: " + taskQueue.getStudentName() +
                " (summary: " + taskQueue.getTasks().size() + " tasks to verify)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
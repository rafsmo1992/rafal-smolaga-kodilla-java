package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");
        Mentor mentor3 = new Mentor("Mentor 3");

        Task user1 = new Task("User 1");
        Task user2 = new Task("User 2");
        Task user3 = new Task("User 3");
        Task user4 = new Task("User 4");
        Task user5 = new Task("User 5");
        user1.registerObserver(mentor1);
        user1.registerObserver(mentor3);
        user2.registerObserver(mentor2);
        user3.registerObserver(mentor1);
        user4.registerObserver(mentor2);
        user5.registerObserver(mentor2);

        //When
        user1.sendTaskToCheck("Task 1");
        user1.sendTaskToCheck("Task 2");
        user1.sendTaskToCheck("Task 3");
        user2.sendTaskToCheck("Task 4");
        user2.sendTaskToCheck("Task 5");
        user3.sendTaskToCheck("Task 6");
        user4.sendTaskToCheck("Task 7");
        user4.sendTaskToCheck("Task 8");
        user5.sendTaskToCheck("Task 9");

        //Then
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(5, mentor2.getUpdateCount());
        assertEquals(3, mentor3.getUpdateCount());
    }
}
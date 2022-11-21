package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void getLastLogTest() {
        //Given
        String log = "Some log";
        Logger logger = Logger.INSTANCE;

        //When
        logger.log(log);

        //Then
        String result = logger.getLastLog();
        assertEquals("Some log", result);
    }
}
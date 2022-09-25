package com.kodilla.stream.array;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {2, 4, 6, 8, 10};
        //When
        double result = ArrayOperations.getAverage(numbers);
        double expected = 6.0;
        //Then
        assertEquals(expected, result);
    }
}
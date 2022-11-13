package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;

    @Test
    void testCalculatorAdd(){
        //Given

        //When
        double result = calculator.add(2.5, 2.5);

        //Then
        assertEquals(5, result);
    }

    @Test
    void testCalculatorSub(){
        //Given

        //When
        double result = calculator.sub(15.5, 5.5);

        //Then
        assertEquals(10, result);
    }

    @Test
    void testCalculatorMul(){
        //Given

        //When
        double result = calculator.mul(15.0, 2.0);

        //Then
        assertEquals(30, result);
    }

    @Test
    void testCalculatorDiv(){
        //Given

        //When
        double result = calculator.div(9.0, 3.0);

        //Then
        assertEquals(3.0, result);
    }
}
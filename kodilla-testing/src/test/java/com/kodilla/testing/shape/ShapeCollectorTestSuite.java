package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("TDD: Forum Test Suite 6.4")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Executing test #" + testCounter);
    }
    @Nested
    @DisplayName("Tests")
    class TestShapeCollector {


        @Test
        void testAddShape() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape shape = new Circle(2);
            //Then
            Assertions.assertEquals(0, shapeCollector.getShapeCollection().size());

        }

        @Test
        void testRemoveFigure() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(2);
            shapeCollector.addFigure(shape);

            //When
            boolean result = shapeCollector.removeFigure(shape);

            //Then
            assertTrue(result);
            Assertions.assertNotEquals(1,shapeCollector.getShapeCollection().size());
        }

        @Test
        void testGetFigure() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(3);
            shapeCollector.addFigure(shape);

            //When

            Shape shapeResult = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(shape,shapeResult);

        }

        @Test
        void testShowFigures() {

            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(4);
            shapeCollector.addFigure(shape);
            List<Shape> shapeList = new ArrayList<>();
            shapeList.add(shape);

            //When
            List<Shape> shapeResultList = shapeCollector.getShapeCollection();

            //Then
            Assertions.assertEquals(shapeList.toString(),shapeResultList.toString());

        }
    }
}


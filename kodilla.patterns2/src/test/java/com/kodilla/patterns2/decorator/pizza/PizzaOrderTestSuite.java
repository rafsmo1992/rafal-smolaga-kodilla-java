package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testLargePizzaOrderWithExtraCheeseAndMushroomsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new LargePizzaOrder(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        BigDecimal price = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(35), price);
    }

    @Test
    public void testLargePizzaOrderWithExtraCheeseAndMushroomsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new LargePizzaOrder(theOrder);
        theOrder = new ExtraMushroomDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Large size, tomato sauce, cheese + mushrooms + extra cheese", description);
    }

    @Test
    public void testPizzaOrderWithExtraCheeseAndMushroomsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new GarlicSauceDecorator(theOrder);
        theOrder = new ExtraMushroomDecorator(theOrder);
        //When
        BigDecimal price = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(24), price);
    }

    @Test
    public void testPizzaOrderWithExtraCheeseAndMushroomsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new GarlicSauceDecorator(theOrder);
        theOrder = new ExtraMushroomDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("tomato sauce, cheese + extra cheese + garlic sauce + mushrooms", description);
    }
}
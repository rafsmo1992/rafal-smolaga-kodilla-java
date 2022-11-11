package com.kodilla.good.patterns.challenges.food2door;

import static com.kodilla.good.patterns.challenges.food2door.CollectionContractors.*;

public class Application {

    public static void main(String[] args) {

        OrderProcessor orderProcessor = new OrderProcessor();

        OrderDTO order1 = new OrderDTO("Bread", 12);
        OrderDTO order2 = new OrderDTO("Ham", 8);
        OrderDTO order3 = new OrderDTO("Cheese", 5);

        orderProcessor.buyProcess(GLUTEN_FREE_SHOP, order1);
        orderProcessor.buyProcess(HEALTHY_SHOP, order2);
        orderProcessor.buyProcess(EXTRA_FOOD_SHOP, order3);
    }
}
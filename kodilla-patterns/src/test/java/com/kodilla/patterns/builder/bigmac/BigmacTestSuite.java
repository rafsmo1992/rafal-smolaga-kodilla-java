package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Roll")
                .bun("Roll with sesame")
                .burgers(5)
                //.sauce("Standard")
                .sauce("Thousand Island dressing")
                //.sauce("Barbecue")
                .ingredient("Salad")
                .ingredient("Onion")
                .ingredient("Bacon")
                .ingredient("Pickles")
                .ingredient("Chilli")
                .ingredient("Mushrooms")
                .ingredient("Shrimps")
                .ingredient("Cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        //Then
        Assertions.assertEquals(8, howManyIngredients);
        Assertions.assertEquals(5, howManyBurgers);
        Assertions.assertEquals("Roll with sesame", bigmac.getBun());
        Assertions.assertEquals("Thousand Island dressing", bigmac.getSauce());
    }
}
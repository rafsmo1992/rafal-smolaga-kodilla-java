package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity(){
        //Given
        BigDecimal polandPopulation = new BigDecimal("37000000");
        BigDecimal frenchPopulation = new BigDecimal("83019200");
        BigDecimal germanPopulation = new BigDecimal("67390000");
        BigDecimal ukPopulation = new BigDecimal("67220000");
        BigDecimal chinaPopulation = new BigDecimal("1500000000");
        BigDecimal japanPopulation = new BigDecimal("125800000");
        BigDecimal koreaPopulation = new BigDecimal("51860000");
        BigDecimal egyptPopulation = new BigDecimal("102300000");
        BigDecimal kongoPopulation = new BigDecimal("50000000");
        Country poland = new Country("Poland", polandPopulation);
        Country france = new Country("France", frenchPopulation);
        Country germany = new Country("Germany", germanPopulation);
        Country uk = new Country("United Kingdom", ukPopulation);
        Country china = new Country("China", chinaPopulation);
        Country japan = new Country("Japan", japanPopulation);
        Country korea = new Country("Korea", koreaPopulation);
        Country egypt = new Country("Egypt", egyptPopulation);
        Country kongo = new Country("Kongo", kongoPopulation);
        //Continents
        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();
        //World
        World world = new World();
        //Adding countries
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(uk);
        asia.addCountry(china);
        asia.addCountry(japan);
        asia.addCountry(korea);
        africa.addCountry(egypt);
        africa.addCountry(kongo);
        //Adding countries to continents
        world.worldAdd(europe);
        world.worldAdd(asia);
        world.worldAdd(africa);

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("2084589200");
        assertEquals(expectedPeopleQuantity, peopleQuantity);
    }
}
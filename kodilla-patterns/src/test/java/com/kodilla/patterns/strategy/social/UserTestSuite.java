package com.kodilla.patterns.strategy.social;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User rafal = new Millenials("Rafal");
        User patrycja = new YGeneration("Patrycja");
        User karolina = new ZGeneration("Karolina");

        //When
        String rafalShares = rafal.share();
        System.out.println("Rafal shares: " + rafalShares);
        String patrycjaShares = patrycja.share();
        System.out.println("Patrycja shares: " + patrycjaShares);
        String karolinaShares = karolina.share();
        System.out.println("Karolina shares: " + karolinaShares);

        //Then
        assertEquals("Facebook", rafalShares);
        assertEquals("Twitter", patrycjaShares);
        assertEquals("Snapchat", karolinaShares);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User anna = new ZGeneration("Anna");

        //When
        String annaShares = anna.share();
        System.out.println("Anna shares: " + annaShares);
        anna.setSocialPublisher(new FacebookPublisher());
        annaShares = anna.share();
        System.out.println("Anna shares: " + annaShares);

        //Then
        assertEquals("Facebook", annaShares);
    }
}
package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import java.util.ArrayList;


public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @DisplayName("when compare emptyList with resultList, " +
            "then compare emptiness"
    )
        @Test
        void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        ArrayList<Integer> resultList = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(emptyList, resultList);
    }
    @DisplayName("when add numers to NrList " +
            "then compare numbers with expectedResultList"
    )
        @Test
        void testOddNumbersExterminatorNormalLis(){
        //Given
        ArrayList<Integer> NrList = new ArrayList<>();
        NrList.add(19);
        NrList.add(8);
        NrList.add(24);
        NrList.add(2);
        NrList.add(11);
        NrList.add(17);
        NrList.add(10);
        ArrayList<Integer>expectedResultList = new ArrayList<>();
        expectedResultList.add(8);
        expectedResultList.add(24);
        expectedResultList.add(2);
        expectedResultList.add(10);
        //When
        ArrayList<Integer> resultList = OddNumbersExterminator.exterminate(NrList);
        System.out.println("Testing list");
        //Then
        Assertions.assertEquals(expectedResultList, resultList);
    }
}

package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsMainTestSuite {
    @Mock
    private Statistics statisticsDatabaseMock;
    @Mock
    private StatisticsMain statisticsMain;
   @BeforeEach
   public void beforeEachTest(){
       statisticsDatabaseMock = mock(Statistics.class);
       List<String>listOfUsers = new ArrayList<>();
       for(int i=0; i<10; i++){
           listOfUsers.add("User");
       }
       when(statisticsDatabaseMock.usersNames()).thenReturn(listOfUsers);
       //when(statisticsDatabaseMock.postsCount()).thenReturn(20);
      // when(statisticsDatabaseMock.commentsCount()).thenReturn(40);
       statisticsMain = new StatisticsMain();
   }
    @Test
    void testCalculateAverageStatisticsZeroPosts() {
        //Given
        //When
        statisticsMain.calculateAdvStatistics(statisticsDatabaseMock);
        statisticsMain.showStatistics();

        //Then
        Assertions.assertEquals(0, statisticsMain.getUsersQuantity());
        Assertions.assertEquals(0, statisticsMain.getPostsQuantity());
        Assertions.assertEquals(0, statisticsMain.getCommentsQuantity());
        Assertions.assertEquals(0, statisticsMain.getAverageUsersPosts(), 0);
        Assertions.assertEquals(0, statisticsMain.getAverageUsersComments(), 0);
        Assertions.assertEquals(0, statisticsMain.getAveragePostsComments(), 0);
    }
    @Test
    void testCalculateAverageStatisticsWithThousandPosts() {
        //Given
        //When
        when(statisticsDatabaseMock.postsCount()).thenReturn(1000);
        //when(statisticsDatabaseMock.usersNames()).thenReturn(usersQuantity);
       // when(statisticsDatabaseMock.postsCount()).thenReturn(postQuantity);
       // when(statisticsDatabaseMock.commentsCount()).thenReturn(commentQuantity);


        //Then
        Assertions.assertEquals(0, statisticsMain.getUsersQuantity());
        Assertions.assertEquals(0, statisticsMain.getPostsQuantity());
        Assertions.assertEquals(0, statisticsMain.getCommentsQuantity());
        Assertions.assertEquals(0, statisticsMain.getAverageUsersPosts(), 0);
        Assertions.assertEquals(0, statisticsMain.getAverageUsersComments(), 0);
        Assertions.assertEquals(0, statisticsMain.getAveragePostsComments(), 0);
    }

}

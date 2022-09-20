package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsMainTestSuite {

    @Test
    public void testCalculateStatisticsWithZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listMock.add("User" +i);
        }
        StatisticsMain StatisticsMain = new StatisticsMain();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        StatisticsMain.calculateAdvStatistics(statisticsMock);

        //Then
        Assertions.assertEquals(0, StatisticsMain.getPostsQuantity());
        Assertions.assertEquals(0, StatisticsMain.getAverageNumberOfPostsPerUser(), 0.01);
        Assertions.assertEquals(0, StatisticsMain.getAverageNumberOfCommentsPerPost(), 0.01);

    }
    @Test
    public void testCalculateStatisticsWithThousandPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listMock.add("User " +i);
        }
        StatisticsMain StatisticsMain = new StatisticsMain();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        StatisticsMain.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(1000, StatisticsMain.getPostsQuantity());
        Assertions.assertEquals(100, StatisticsMain.getAverageNumberOfPostsPerUser(), 0.001);
        Assertions.assertEquals(0.5, StatisticsMain.getAverageNumberOfCommentsPerPost(), 0.001);
    }
    @Test
    public void testCalculateStatisticsWithZeroComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listMock.add("User " +i);
        }
        StatisticsMain StatisticsMain = new StatisticsMain();
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(listMock);
        //When
        StatisticsMain.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, StatisticsMain.getCommentsQuantity());
        Assertions.assertEquals(0, StatisticsMain.getAverageNumberOfCommentsPerUser(), 0.001);
        Assertions.assertEquals(0, StatisticsMain.getAverageNumberOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateStatisticsWithLessCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listMock.add("User " +i);
        }
        StatisticsMain StatisticsMain = new StatisticsMain();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(20);
        //When
        StatisticsMain.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(10, StatisticsMain.getUsersQuantity());
        Assertions.assertEquals(20, StatisticsMain.getPostsQuantity());
        Assertions.assertEquals(5, StatisticsMain.getCommentsQuantity());
        Assertions.assertEquals(2, StatisticsMain.getAverageNumberOfPostsPerUser(), 0.001);
        Assertions.assertEquals(0.5, StatisticsMain.getAverageNumberOfCommentsPerUser(), 0.001);
        Assertions.assertEquals(0.25, StatisticsMain.getAverageNumberOfCommentsPerPost(), 0.001);
    }

    @Test
    public void testCalculateStatisticsWithMoreCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<10; i++){
            listMock.add("User " +i);
        }
        StatisticsMain StatisticsMain = new StatisticsMain();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.commentsCount()).thenReturn(120);
        when(statisticsMock.postsCount()).thenReturn(20);
        //When
        StatisticsMain.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(10, StatisticsMain.getUsersQuantity());
        Assertions.assertEquals(20, StatisticsMain.getPostsQuantity());
        Assertions.assertEquals(120, StatisticsMain.getCommentsQuantity());
        Assertions.assertEquals(2, StatisticsMain.getAverageNumberOfPostsPerUser(), 0.001);
        Assertions.assertEquals(12, StatisticsMain.getAverageNumberOfCommentsPerUser(), 0.001);
        Assertions.assertEquals(6, StatisticsMain.getAverageNumberOfCommentsPerPost(), 0.001);
    }
    @Test
    public void testCalculateStatisticsWithZeroUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        StatisticsMain StatisticsMain = new StatisticsMain();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(200);
        //When
        StatisticsMain.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0, StatisticsMain.getUsersQuantity());
        Assertions.assertEquals(0, StatisticsMain.getAverageNumberOfPostsPerUser(), 0.001);
        Assertions.assertEquals(0, StatisticsMain.getAverageNumberOfCommentsPerUser(), 0.001);

    }

    @Test
    public void testCalculateStatisticsWithHundredUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String>listMock = new ArrayList<>();
        for(int i=0; i<100; i++){
            listMock.add("User " +i);
        }
        StatisticsMain StatisticsMain = new StatisticsMain();
        when(statisticsMock.usersNames()).thenReturn(listMock);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(25);
        //When
        StatisticsMain.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(100, StatisticsMain.getUsersQuantity());
        Assertions.assertEquals(0.25, StatisticsMain.getAverageNumberOfPostsPerUser(), 0.01);
        Assertions.assertEquals(1, StatisticsMain.getAverageNumberOfCommentsPerUser(), 0.01);
    }
}
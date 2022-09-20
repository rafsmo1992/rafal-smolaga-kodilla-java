package com.kodilla.testing.forum.statistics;

public class StatisticsMain {
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAverageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;
    }

    public double getAverageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        averageNumberOfPostsPerUser = calculateAverageNumbersOfPostsPerUser();
        averageNumberOfCommentsPerUser = calculateAverageNumbersOfCommentsPerUser();
        averageNumberOfCommentsPerPost = calculateAverageNumbersOfCommentsPerPosts();
    }

    private double calculateAverageNumbersOfPostsPerUser () {

        if (usersQuantity > 0) {
            return (double) postsQuantity / usersQuantity;
        } else {
            return 0;
        }
    }

    private double calculateAverageNumbersOfCommentsPerUser () {
        if (usersQuantity > 0) {
            return (double) commentsQuantity / usersQuantity;
        } else {
            return 0;
        }
    }

    private double calculateAverageNumbersOfCommentsPerPosts () {
        if (postsQuantity > 0) {
            return (double) commentsQuantity / postsQuantity;
        } else {
            return 0;
        }
    }

    public void showStatistics () {
        System.out.println("Users numbers: " + usersQuantity);
        System.out.println("Posts numbers: " + postsQuantity);
        System.out.println("Comments numbers: " + commentsQuantity);
        System.out.println("Posts average per user" + averageNumberOfPostsPerUser);
        System.out.println("Comments average per user" + averageNumberOfCommentsPerUser);
        System.out.println("Comments average per post" + averageNumberOfCommentsPerPost);
    }
}
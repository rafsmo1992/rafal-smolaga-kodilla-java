package com.kodilla.testing.forum.statistics;

public class StatisticsMain {
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double averageUsersPosts;
    private double averageUsersComments;
    private double averagePostsComments;

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAverageUsersPosts() {
        return averageUsersPosts;
    }

    public double getAverageUsersComments() {
        return averageUsersComments;
    }

    public double getAveragePostsComments() {
        return averagePostsComments;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        averageUsersPosts = calculateAveragePostsPerUser();
        averageUsersComments = calculateAverageCommentsPerUser();
        averagePostsComments = calculateAverageCommentsPerPost();
    }
    public double calculateAveragePostsPerUser() {
        if (getUsersQuantity() > 0) {
            return getPostsQuantity() / getUsersQuantity();
        } else {
            return 0;
        }
    }
    public double calculateAverageCommentsPerUser() {
        if (getUsersQuantity() > 0) {
            return getCommentsQuantity() / getUsersQuantity();
        } else {
            return 0;
        }
    }

    public double calculateAverageCommentsPerPost() {
        if (getPostsQuantity() > 0) {
            return getCommentsQuantity() / getPostsQuantity();
        } else {
            return 0;
        }
    }
    public void showStatistics(){
        System.out.println("All forum statistics:");
        System.out.println("Total users quantity:"+ usersQuantity);
        System.out.println("Total posts quantity:"+ postsQuantity);
        System.out.println("Total comments quantity:"+ commentsQuantity);
        System.out.println("Total posts average per user:"+ averageUsersPosts);
        System.out.println("Total comments average per user:"+ averageUsersComments);
        System.out.println("Total comments average per post:"+ averagePostsComments);
    }
}

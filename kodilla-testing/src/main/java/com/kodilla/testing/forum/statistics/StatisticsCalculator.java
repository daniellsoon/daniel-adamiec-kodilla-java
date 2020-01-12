package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;

public class StatisticsCalculator {

    Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;

    private String noUser = "Cannot calculate - no any user";
    private String noPost = "Cannot calculate - no any post";


    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        postsPerUser = (double) numberOfPosts / numberOfUsers;
        commentsPerUser = (double) numberOfComments / numberOfUsers;
        commentsPerPost = (double) numberOfComments / numberOfPosts;

    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public void showStatistics(){
        System.out.println("Forum Statistics:");
        System.out.println("Users: " + numberOfUsers);
        System.out.println("Posts: " + numberOfPosts);
        System.out.println("Comments: " + numberOfComments);
        if (numberOfUsers != 0) {
            System.out.println("Posts per user: " + postsPerUser);
            System.out.println("Comments per user: " + commentsPerUser);
        } else {
            System.out.println("Posts per user: " + noUser);
            System.out.println("Comments per user: " + noUser);
        }
        if (numberOfPosts != 0) {
            System.out.println("Comments per post: " + commentsPerPost);
        } else {
            System.out.println("Comments per post: " + noPost);
        }
    }


}

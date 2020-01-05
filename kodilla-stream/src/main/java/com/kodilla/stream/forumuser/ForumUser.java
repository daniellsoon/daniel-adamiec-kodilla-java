package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private int userId;
    private String userName;
    private char sex = 'M' / 'F';
    private LocalDate birthDate;
    private  int postCount;

    public ForumUser(int userId, String userName, char sex, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth , int postCount) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postCount = postCount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postCount=" + postCount +
                '}';
    }
}

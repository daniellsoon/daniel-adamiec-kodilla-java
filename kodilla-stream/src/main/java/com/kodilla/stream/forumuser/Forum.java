package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theUsers = new ArrayList<ForumUser>();

    public Forum() {
        theUsers.add(new ForumUser(001, "NO",
                'F', 1997, 1, 16, 120));
        theUsers.add(new ForumUser(002, "YES",
                'M', 1985, 2, 18, 1));
        theUsers.add(new ForumUser(003, "NO",
                'F', 2000, 3, 23, 200));
        theUsers.add(new ForumUser(004, "NO",
                'M', 2010, 4, 30, 0));
        theUsers.add(new ForumUser(005, "NO",
                'M', 2001, 5, 1, 50));
        theUsers.add(new ForumUser(005, "NO",
                'F', 1990, 6, 15, 12));
        theUsers.add(new ForumUser(006, "YES",
                'M', 1997, 7, 11, 10));
        theUsers.add(new ForumUser(007, "TEST_2000_beforeLocalDate",
                'M', 2000, 1, 7, 10));
        theUsers.add(new ForumUser(007, "TEST_2000_afterLocalDate",
                'M', 2000, 12, 7, 10));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<ForumUser>(theUsers);
    }
}

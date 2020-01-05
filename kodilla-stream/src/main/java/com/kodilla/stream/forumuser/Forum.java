package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theUsers = new ArrayList<ForumUser>();

    public Forum() {
        theUsers.add(new ForumUser(001, "danny",
                'F', 1997, 1, 16, 120));
        theUsers.add(new ForumUser(002, "Slaves",
                'M', 1985, 2, 18, 1));
        theUsers.add(new ForumUser(003, "Osman",
                'F', 2000, 3, 23, 200));
        theUsers.add(new ForumUser(004, "xyz",
                'M', 2010, 4, 30, 0));
        theUsers.add(new ForumUser(005, "Gangster",
                'M', 2001, 5, 1, 50));
        theUsers.add(new ForumUser(005, "Cod",
                'F', 1990, 6, 15, 12));
        theUsers.add(new ForumUser(006, "Pillar",
                'M', 1997, 7, 11, 10));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<ForumUser>(theUsers);
    }
}

package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum(){

        theForumUsersList.add(new ForumUser(1,"UserName 1",'m',LocalDate.of(2001, 3, 24), 25));
        theForumUsersList.add(new ForumUser(2,"UserName 2",'m',LocalDate.of(1956, 11, 05), 53));
        theForumUsersList.add(new ForumUser(3,"UserName 3",'f',LocalDate.of(1936, 5, 12), 23));
        theForumUsersList.add(new ForumUser(4,"UserName 4",'m',LocalDate.of(1998, 4, 11), 11));
        theForumUsersList.add(new ForumUser(5,"UserName 5",'m',LocalDate.of(2005, 9, 07), 2));
        theForumUsersList.add(new ForumUser(6,"UserName 6",'f',LocalDate.of(1979, 3, 02), 78));
        theForumUsersList.add(new ForumUser(7,"UserName 7",'f',LocalDate.of(1998, 1, 01), 3));
    }
    public List<ForumUser> getUsersList() {
        return theForumUsersList;
    }

}

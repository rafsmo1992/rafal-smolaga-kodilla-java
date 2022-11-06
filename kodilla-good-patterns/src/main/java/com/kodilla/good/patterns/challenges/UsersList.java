package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class UsersList {
    static User janKowalski = new User("Jan", "Kowalski", 1);
    static User annaNowak = new User("Anna", "Nowak", 2);
    static User barbaraKowalska = new User("Barbara", "Kowalska", 3);
    static User piotrLewandowski = new User("Piotr", "Lewandowski", 4);
    static User wojciechKowalczyk = new User("Wojciech", "Kowalczyk", 5);

    public static List usersList () {
        List<User> userList = new ArrayList<>();
        userList.add(janKowalski);
        userList.add(annaNowak);
        userList.add(barbaraKowalska);
        userList.add(piotrLewandowski);
        userList.add(wojciechKowalczyk);
        return userList;
    }
}
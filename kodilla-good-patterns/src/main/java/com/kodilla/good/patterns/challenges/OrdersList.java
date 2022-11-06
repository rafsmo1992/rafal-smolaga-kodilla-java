package com.kodilla.good.patterns.challenges;


import java.util.ArrayList;
import java.util.List;



public class OrdersList {

    public static List <Order> ordersList() {
        List<Order> ordersList= new ArrayList<>();
        ordersList.add(new Order(UsersList.janKowalski , ItemsList.smartphone3, 1));
        ordersList.add(new Order(UsersList.barbaraKowalska , ItemsList.buty4, 2));
        ordersList.add(new Order(UsersList.wojciechKowalczyk , ItemsList.bluza2, 3));
        ordersList.add(new Order(UsersList.annaNowak , ItemsList.skarpetki5 , 5));
        return ordersList;
    }

}
package com.kodilla.good.patterns.challenges;


import java.util.List;
import java.util.Map;

public class Service {

    Map mapOfItems = ItemStockRepository.itemStockRepository();
    List<Order> newOrders = OrdersList.ordersList();

    public boolean ifUserIsRegistered (Order order) {
        if (!UsersList.usersList().contains(order.getUser())){
            System.out.println("Złożone zostało zamówienie od niezarejestrowanego użytkowanika: " + order.getUser().getFirstName() +" " +order.getUser().getLastName()  + " konieczna jest rejestracja");
        } return (UsersList.usersList().contains(order.getUser()));
    }

    public boolean ifItemIsAvailable(Order order) {
        if (!mapOfItems.containsKey(order.getItem())){
            System.out.println("Brak towaru: " +order.getItem().getName());
        } return (mapOfItems.containsKey(order.getItem()));
    }

    public boolean ifExceededQuantityOfItems(Order order) {
        Item requestedItem = order.getItem();
        Object requestedItemAmountObject = mapOfItems.get(requestedItem);
        int requestedItemAmount = (int)requestedItemAmountObject;

        if (!(requestedItemAmount >= order.getQuantity())){
            System.out.println("Brak wystarczającej ilości produktów: "  +order.getItem().getName());
        } return (requestedItemAmount >= order.getQuantity());
    }

    public  Map <Item, Integer> Service (Order order) {
        Item requestedItem = order.getItem();
        int requestedAmount = order.getQuantity();
        Object requestedAmountObject = mapOfItems.get(requestedItem);
        int requestedItemAmount = (int)requestedAmountObject;
        int actualAmount = requestedItemAmount - requestedAmount;
        mapOfItems.put(requestedItem,actualAmount );
        System.out.println("Zrealizowane zostało zamówinie użytkownika: " + order.getItem().getName() + " w ilości sztuk: " + requestedAmount );
        return mapOfItems;
    }

    public void runOrders(){
        for (Order order:  newOrders ) {
            if  (ifUserIsRegistered (order)){
                if (ifItemIsAvailable(order)){
                    if (ifExceededQuantityOfItems(order)) {
                        Service (order);
                    }
                }
            }
        }
        System.out.println("Stan magazynu po realizacji zamówień");
        System.out.println(mapOfItems.get(ItemsList.smartphone3));
        System.out.println(mapOfItems.get(ItemsList.buty4));
        System.out.println(mapOfItems.get(ItemsList.bluza2));
        System.out.println(mapOfItems.get(ItemsList.skarpetki5));
    }
}
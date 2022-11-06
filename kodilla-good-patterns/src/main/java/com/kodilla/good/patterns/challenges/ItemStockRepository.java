package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class ItemStockRepository {
    public static Map <Item, Integer> itemStockRepository() {
        Map <Item, Integer>  itemStockRepository = new HashMap<>();
        itemStockRepository.put(ItemsList.telewizor1, 1);
        itemStockRepository.put(ItemsList.buty4, 2);
        itemStockRepository.put(ItemsList.skarpetki5, 4);
        return itemStockRepository;
    }

    public void supply (Item item, int amount) {
        int actualCondition = itemStockRepository().get(item);
        int newCondition = actualCondition +amount;
        itemStockRepository().put( item,newCondition);
    }

}

package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class Item {
    public final String itemName;
    public int cost;

    public Item(String itemName, int cost) {
        this.itemName =itemName;
        this.cost = cost;
    }

    public String getName() {
        return itemName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (cost != item.cost) return false;
        return Objects.equals(itemName, item.itemName);
    }

    @Override
    public int hashCode() {
        int result = itemName != null ? itemName.hashCode() : 0;
        result = 31 * result + cost;
        return result;
    }
}
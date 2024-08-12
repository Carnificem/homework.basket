package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Integer> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void addItems(List<Integer> itemsId) {
        this.items.addAll(itemsId);
    }

    public List<Integer> getItems() {
        return new ArrayList<>(items);
    }

}

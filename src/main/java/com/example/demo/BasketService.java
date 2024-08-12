package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class BasketService {
    private final Basket basket;


    public BasketService() {
        this.basket = new Basket();
    }


    public void addItem(List<Integer> itemsId) {
        basket.addItems(itemsId);
    }

    public List<Integer> getItems() {
        return basket.getItems();
    }
}

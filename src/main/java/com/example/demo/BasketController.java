package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/store/order")
public class BasketController {

    private final BasketService basketService;

    @Autowired
    public BasketController(BasketService basketService){
        this.basketService=basketService;
    }
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public void addItems(@RequestParam List<Integer>itemsId){
        basketService.addItem(itemsId);
    }
    @GetMapping("/get")
    public List<Integer>getItems(){
        return basketService.getItems();
    }
}

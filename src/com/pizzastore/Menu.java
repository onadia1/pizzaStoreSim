package com.pizzastore;

import java.util.HashMap;
import java.util.Map;

//Menu class representing the menu of the pizza store
public class Menu {
    //Private field to store the menu items and their prices
    private Map<String, Double> menuItems;

    //Constructor that initializes the menu with some default items and their prices
    public Menu() {
        menuItems = new HashMap<>();
        menuItems.put("Pizza", 10.0);
        menuItems.put("Pasta", 8.0);
        menuItems.put("Soda", 2.0);
        menuItems.put("Salad", 5.0);
    }

    //Getter method to return the menu items and their prices
    public Map<String, Double> getMenuItems() {
        return menuItems;
    }
}

package com.pizzastore;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<String, Double> menuItems;

    public Menu() {
        menuItems = new HashMap<>();
        menuItems.put("Pizza", 10.0);
        menuItems.put("Pasta", 8.0);
        menuItems.put("Soda", 2.0);
        menuItems.put("Salad", 5.0);
    }

    public Map<String, Double> getMenuItems() {
        return menuItems;
    }
}

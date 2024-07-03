package com.pizzastore;

//interface representing an item in an order
public interface OrderItem {
    //Method which gets the name of the order item
    String getName();
    //Method which gets the price of a single unit of the order item
    double getPrice();
    //method which gets the quantity of the order item
    int getQuantity();
    //Method which gets the total price of the order item
    double getTotalPrice();
}

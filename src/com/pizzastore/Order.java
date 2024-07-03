package com.pizzastore;

import java.util.ArrayList;
import java.util.List;

//Order class representing a customer's order, which is generic and accepts any type that extends OrderItem
public class Order<T extends OrderItem> {
    //Private field to store the list of order items
    private List<T> orderItems;

    //Constructor that initializes an empty list of order items
    public Order() {
        orderItems = new ArrayList<>();
    }
    //Method to add an order item to the list
    public void addOrderItem(T orderItem) {
        orderItems.add(orderItem);
    }
    
    //Method to calculate the total price of the order
    public double getTotal() {
        double total = 0;
        for (T item : orderItems) {
            total += item.getTotalPrice();
        }
        return total;
    }

    //Method to print the receipt with each order item and the total price
    public void printReceipt() {
        for (T item : orderItems) {
            System.out.println(item);
        }
        System.out.println("Total: $" + getTotal());
    }
}

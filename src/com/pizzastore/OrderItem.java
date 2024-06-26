package com.pizzastore;

public interface OrderItem {
    String getName();
    double getPrice();
    int getQuantity();
    double getTotalPrice();
}

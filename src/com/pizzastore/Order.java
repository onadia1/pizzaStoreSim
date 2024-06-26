package com.pizzastore;

import java.util.ArrayList;
import java.util.List;

public class Order<T extends OrderItem> {
    private List<T> orderItems;

    public Order() {
        orderItems = new ArrayList<>();
    }

    public void addOrderItem(T orderItem) {
        orderItems.add(orderItem);
    }

    public double getTotal() {
        double total = 0;
        for (T item : orderItems) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void printReceipt() {
        for (T item : orderItems) {
            System.out.println(item);
        }
        System.out.println("Total: $" + getTotal());
    }
}

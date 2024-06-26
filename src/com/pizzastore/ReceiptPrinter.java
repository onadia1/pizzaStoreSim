package com.pizzastore;

import java.util.List;

public class ReceiptPrinter {
    public static void printReceipt(Customer customer, List<OrderItem> items, double total) {
        System.out.println("Receipt for " + customer.getName() + ":");
        for (OrderItem item : items) {
            System.out.printf("%s x %d - $%.2f%n", item.getName(), item.getQuantity(), item.getTotalPrice());
        }
        System.out.printf("Total: $%.2f%n", total);
    }
}

package com.pizzastore;

import java.util.List;

//class for printing receipts
public class ReceiptPrinter {
    public static void printReceipt(Customer customer, List<OrderItem> items, double total) {
        //Print the receipt header with the customer's name
        System.out.println("Receipt for " + customer.getName() + ":");
        //Print each order item with its name, quantity, and total price
        for (OrderItem item : items) {
            System.out.printf("%s x %d - $%.2f%n", item.getName(), item.getQuantity(), item.getTotalPrice());
        }
        //Print the total amount
        System.out.printf("Total: $%.2f%n", total);
    }
}

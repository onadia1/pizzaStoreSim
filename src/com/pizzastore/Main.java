package com.pizzastore;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize store and menu
        Store.printWelcomeMessage();
        Menu menu = new Menu();

        // Create customer
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        Customer customer = new Customer(customerName);

        // Create order
        Order<OrderItemImpl> order = new Order<>();

        // Display menu and take orders
        boolean ordering = true;
        while (ordering) {
            System.out.println("Menu:");
            int index = 1;
            for (Map.Entry<String, Double> entry : menu.getMenuItems().entrySet()) {
                System.out.printf("%d. %s - $%.2f%n", index++, entry.getKey(), entry.getValue());
            }
            System.out.println("Enter the number of the item you want to order or type 'done' to finish:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                ordering = false;
            } else {
                try {
                    int choice = Integer.parseInt(input);
                    if (choice > 0 && choice <= menu.getMenuItems().size()) {
                        String itemName = (String) menu.getMenuItems().keySet().toArray()[choice - 1];
                        double itemPrice = menu.getMenuItems().get(itemName);
                        System.out.print("Enter quantity: ");
                        int quantity = scanner.nextInt();
                        scanner.nextLine(); // Consume newline left-over
                        order.addOrderItem(new OrderItemImpl(itemName, itemPrice, quantity));
                    } else {
                        System.out.println("Invalid choice, please select a valid menu item.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input, please enter a number.");
                }
            }
        }

        // Print the receipt
        order.printReceipt();
    }
}

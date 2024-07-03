package com.pizzastore;

//Product class representing a product in the pizza store
public class Product {
    //Private fields to store the name and price of the product
    private String name;
    private double price;

    //Constructor that initializes the name and price of the product
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //Getter method to return the name of the product
    public String getName() {
        return name;
    }

    // Getter method to return the price of the product
    public double getPrice() {
        return price;
    }

    //Override the toString method to return a string representation of the product
    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

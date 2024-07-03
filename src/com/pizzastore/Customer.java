package com.pizzastore;

//Customer class representing a customer of the pizza store
public class Customer {
    //Private field to store the name of the customer
    private String name;

    //Constructor that initializes the name of the Customer
    public Customer(String name) {
        this.name = name;
    }
    //Get method to return the name of the customer
    public String getName() {
        return name;
    }
}

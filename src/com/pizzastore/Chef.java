package com.pizzastore;

public class Chef extends Employee {
    public Chef(String name) {
        super(name);
    }

    public void preparePizza() {
        System.out.println(name + " is preparing pizza.");
    }
}

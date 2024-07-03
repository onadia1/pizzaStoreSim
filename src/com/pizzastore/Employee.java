package com.pizzastore;

//Abstract Employee class representing an employee of the pizza store
public abstract class Employee {
    //Protected field to store the name of the employee
    protected String name;

    //Constructor that initializes the name of the Employee
    public Employee(String name) {
        this.name = name;
    }
    
    //Getter method to return the name of the employee
    public String getName() {
        return name;
    }
}

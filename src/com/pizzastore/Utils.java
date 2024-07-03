package com.pizzastore;

import java.util.Date;
import java.util.Random;

//Class providing utils
public class Utils {
    //Static method to get current date and time
    public static Date getCurrentDate() {
        return new Date();
    }

    //Static method to get a random quantity between 1 and 5
    public static int getRandomQuantity() {
        Random random = new Random();
        return random.nextInt(5) + 1; // Random quantity between 1 and 5
    }
}

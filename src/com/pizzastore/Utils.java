package com.pizzastore;

import java.util.Date;
import java.util.Random;

public class Utils {
    public static Date getCurrentDate() {
        return new Date();
    }

    public static int getRandomQuantity() {
        Random random = new Random();
        return random.nextInt(5) + 1; // Random quantity between 1 and 5
    }
}

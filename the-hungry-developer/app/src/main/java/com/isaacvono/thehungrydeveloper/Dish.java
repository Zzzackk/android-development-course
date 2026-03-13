package com.isaacvono.thehungrydeveloper;

import androidx.annotation.NonNull;

public class Dish {

    //Fields
    String title;
    String description;
    int price;

    // Constructor
    Dish(String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}

package com.example.mylenovo.friendsr;

import java.io.Serializable;

public class Friend implements Serializable {
    // Initialize parameters
    private String name, bio;
    private int drawableId;
    private float rating;

    // Assign parameters
    public Friend(String name, String bio, int drawableId) {
        this.name = name;
        this.bio = bio;
        this.drawableId = drawableId;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public float getRating() {
        return rating;
    }

    // Setter
    public void setRating(float rating) {
        this.rating = rating;
    }
}

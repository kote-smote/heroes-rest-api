package com.sorsix.angular.angulartutorial;

public class Hero {

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private final int id;
    private final String name;

    public Hero(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

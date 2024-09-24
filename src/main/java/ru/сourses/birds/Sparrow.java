package ru.сourses.birds;

public class Sparrow extends Bird {
    String name;

    public Sparrow(String name) {
        this.name = name;
    }

    @Override
    public void sing() {
        System.out.println("чырык");
    }
}
package ru.сourses.birds;

import java.util.Random;

public class Parrot extends Bird {
    String name;
    String text;

    public Parrot(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public void sing() {
        Random random = new Random();
        int randomNumber = random.nextInt(text.length());
        for (int i = 0; i < randomNumber; i++) {
            System.out.print(text.charAt(i));
        }
    }
}

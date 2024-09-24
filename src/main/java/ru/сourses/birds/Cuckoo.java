package ru.сourses.birds;

import java.util.Random;

public class Cuckoo extends Bird {
    String name;

    public Cuckoo(String name) {
        this.name = name;
    }

    @Override
    public void sing() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        for (int i = 0; i < randomNumber; i++) {
            System.out.println("ку-ку");
        }
    }
}

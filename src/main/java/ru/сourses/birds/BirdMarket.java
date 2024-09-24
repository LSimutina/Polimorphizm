package ru.сourses.birds;

import java.util.Random;

public abstract class BirdMarket {
    public abstract void sing();
}

class SparrowMarket extends Bird {
    String name;

    public SparrowMarket(String name) {
        this.name = name;
    }

    @Override
    public void sing() {
        System.out.println("чырык");
    }
}

class CuckooMarket extends Bird {
    String name;

    public CuckooMarket(String name) {
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

class ParrotMarket extends Bird {
    String name;
    String text;

    public ParrotMarket(String name, String text) {
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
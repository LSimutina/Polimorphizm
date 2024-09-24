package ru.сourses.geometry;

import ru.сourses.main.Main;

public class StringText implements Main.LengthAble {
    String text;

    public StringText(String text) {
        this.text = text;
    }

    public double getLength(){
        return text.length();
    }
}

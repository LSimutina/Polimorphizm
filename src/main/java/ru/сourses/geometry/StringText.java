package ru.сourses.geometry;

public class StringText implements Main.LengthAble {
    String text;

    public StringText(String text) {
        this.text = text;
    }

    public double getLength(){
        return text.length();
    }
}

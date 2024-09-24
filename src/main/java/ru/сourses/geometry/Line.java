package ru.сourses.geometry;

public class Line implements Main.LengthAble {
    Point start;
    Point finish;

    public Line(Point start, Point finish) {
        this.start = start;
        this.finish = finish;
    }

    public String toString() {
        return "Линия от " +
                start +
                " до " + finish;
    }

    public double getLength() {
        double sum = 0, len1, len2;
        len1 = start.x - finish.x;
        len2 = start.y - finish.y;
        sum += Math.sqrt(len1 * len1 + len2 * len2);
        return sum;
    }
}
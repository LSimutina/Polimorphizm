package ru.сourses.main;

import ru.сourses.geometry.Point;

import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        Point point=new Point(1,2);
        java.awt.Point p1 = new java.awt.Point(2,3);

        System.out.println(point);
        System.out.println(p1);
    }

    public static double raisingToAPower(String x, String y){
       return (double) pow(parseInt(x), parseInt(y));
    }

    static double mGetLength(LengthAble object) {
        double result;
        result = object.getLength();
        return result;
    }

    public interface LengthAble {
        double getLength();
    }

    public static void birdMarket(SingAble object){
        object.sing();
    }

    interface SingAble{
        void sing();
    }

    public static double sumAllAreas(sumAllAreasAble object){
        return object.getArea();
    }

    public interface sumAllAreasAble {
        double getArea();
    }
}
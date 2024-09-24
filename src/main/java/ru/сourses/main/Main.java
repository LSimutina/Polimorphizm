package ru.сourses.main;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Main {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Вводим первое число");
        String x = sc1.next();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Вводим второе число");
        String y = sc2.next();
        System.out.println(raisingToAPower(x,y));

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
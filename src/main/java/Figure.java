import java.util.Random;

public abstract class Figure {
    public abstract double getArea();
}


class Сircle extends Figure {
    Point point;
    int radius;
    double Pi = 3.14;

    public Сircle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Pi * radius * radius;
    }
}

class Square extends Figure {
    Point point;
    int length;

    public Square(Point point, int length) {
        this.point = point;
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}

class Rectangle extends Figure {
    Point point;
    int length1, length2;

    public Rectangle(Point point, int length1, int length2) {
        this.point = point;
        this.length1 = length1;
        this.length2 = length2;
    }

    @Override
    public double getArea() {
        return length1 * length2;
    }
}
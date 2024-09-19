public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2,2);

        Сircle circle1 = new Сircle(p1,2);
        System.out.println(circle1.getArea());

        Square square = new Square(p1, 2);
        System.out.println(square.getArea());

        Rectangle rectangle = new Rectangle(p1,3,4);
        System.out.println(rectangle.getArea());

    }
}
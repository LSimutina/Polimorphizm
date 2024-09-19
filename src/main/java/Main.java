public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2,2);

        Сircle1 c1 = new Сircle1(p1,2);
        Square square = new Square(p1, 2);
        Rectangle rectangle = new Rectangle(p1,3,4);

        System.out.println(sumAllAreas(c1));
        System.out.println(sumAllAreas(square));

    }

    public static double sumAllAreas(sumAllAreasAble object){
        return object.getArea();
    }

    interface sumAllAreasAble{
        double getArea();
    }
}
public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 1);
        Point p3 = new Point(2, 2);
        Point p4 = new Point(1, 2);

        Point[] arrPoint = {p1, p2, p3, p4};

        Line line = new Line(p1, p2);
        PolyLine polyLine = new PolyLine(arrPoint);
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(arrPoint);

        System.out.println(polyLine.getLength());
        System.out.println(closedPolyLine.closedLength());
        System.out.println(mGetLength(line));
        System.out.println(mGetLength(polyLine));
        System.out.println(mGetLength(closedPolyLine));

    }

    static double mGetLength(LengthAble object){
        double result = 0;
        result = object.getLength();
        return result;
    }

    interface LengthAble{
        double getLength();
    }
}
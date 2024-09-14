public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(1,1);
        Point p2 = new Point(2,1);
        Point p3 = new Point(2,2);
        Point p4 = new Point(1,2);

        Point[] arrPoint = {p1, p2, p3, p4};

        PolyLine polyLine = new PolyLine(arrPoint);

        ClosedPolyLine closedPolyLine = new ClosedPolyLine(arrPoint);

        System.out.println(polyLine.length());
        System.out.println(closedPolyLine.closedLength());

    }
}
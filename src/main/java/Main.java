public class Main {
    public static void main(String[] args) {

        Fraction fraction = new Fraction(2,3);
        System.out.println(fraction.toString());
        System.out.println(fraction.intValue());
        System.out.println(fraction.longValue());
        System.out.println(fraction.floatValue());
        System.out.println(fraction.doubleValue());

    }

    static double mGetLength(LengthAble object) {
        double result;
        result = object.getLength();
        return result;
    }

    interface LengthAble {
        double getLength();
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println(sum(2, new Fraction(3,5), 2.3));
        System.out.println(sum(3.6, new Fraction(49,12), 3, new Fraction(3,2)));
        System.out.println(sum(new Fraction(1,3), 1));
    }

    public static double sum(Number... numbers){
        double result=0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i].doubleValue();
        }
        return result;
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
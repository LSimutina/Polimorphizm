public class Main {
    public static void main(String[] args) {

        Sparrow tom = new Sparrow("tom");
        tom.sing();

        Cuckoo kukusha = new Cuckoo("Kukusha");
        kukusha.sing();

        String text = "Карусель, карусель\n" +
                "Начинает рассказ\n" +
                "Это сказки, песни и веселье\n" +
                "Карусель, карусель —\n" +
                "Это радость для нас\n" +
                "Прокатись на нашей карусели\n";
        Parrot grisha = new Parrot("Grisha", text);
        grisha.sing();

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
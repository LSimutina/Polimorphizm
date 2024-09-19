public class Main {
    public static void main(String[] args) {
        String text = "Карусель, карусель\n" +
                "Начинает рассказ\n" +
                "Это сказки, песни и веселье\n" +
                "Карусель, карусель —\n" +
                "Это радость для нас\n" +
                "Прокатись на нашей карусели\n";

        Sparrow tom = new Sparrow("tom");
        Cuckoo kukusha = new Cuckoo("Kukusha");
        Parrot grisha = new Parrot("Grisha", text);

        birdMarket(tom);
        birdMarket(kukusha);
        birdMarket(grisha);
    }

    public static void birdMarket(SingAble object){
        object.sing();
    }

    interface SingAble{
        void sing();
    }
}
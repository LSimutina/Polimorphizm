import java.util.Random;

public abstract class Bird implements Main.SingAble {
    String name;

    public abstract void sing();
}

class Sparrow extends Bird {
    String name;

    public Sparrow(String name) {
        this.name = name;
    }

    @Override
    public void sing() {
        System.out.println("чырык");
    }
}

class Cuckoo extends Bird {
    String name;

    public Cuckoo(String name) {
        this.name = name;
    }

    @Override
    public void sing() {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        for (int i = 0; i < randomNumber; i++) {
            System.out.println("ку-ку");
        }
    }
}

class Parrot extends Bird {
    String name;
    String text;

    public Parrot(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public void sing() {
        Random random = new Random();
        int randomNumber = random.nextInt(text.length());
        for (int i = 0; i < randomNumber; i++) {
            System.out.print(text.charAt(i));
        }
    }
}
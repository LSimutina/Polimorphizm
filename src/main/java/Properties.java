public class Properties {
    String name;
    Object object;

    public Properties(String name, Object object) {
        this.name = name;
        this.object = object;
    }

    @Override
    public String toString() {
        return name + ": " + object;
    }
}
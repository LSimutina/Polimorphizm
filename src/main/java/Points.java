import java.util.Arrays;

public class Points {
    Properties[] properties;

    public Points(Properties...properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return Arrays.toString(properties);
    }
}
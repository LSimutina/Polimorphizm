public class Main {
    public static void main(String[] args) {
        Properties p1X = new Properties("x", 3);
        Properties color1 = new Properties("color", "red");

        Properties p2X = new Properties("x", 4);
        Properties p2Y = new Properties("y", 2);
        Properties p2Z = new Properties("z", 5);
        Properties time2 = new Properties("время", "11:00");

        Properties p3X = new Properties("x", 7);
        Properties p3Y = new Properties("y", 7);
        Properties time3 = new Properties("время", "15:35");
        Properties color3 = new Properties("color", "yellow");

        Points p1 = new Points(p1X, color1);
        Points p2 = new Points(p2X, p2Y, p2Z, time2);
        Points p3 = new Points(p3X, p3Y, time3, color3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);



//        Property x = new Property("Коорд.х", 7);
//        Property weight = new Property("Вес", 7.0);
//        Property color = new Property("Цвет", "желтый");
//        Property time = new Property("Время","10:15");
//        SuperDot sd1 = new SuperDot(x,weight,color,time);
//        System.out.println(sd1.toString());

    }
}
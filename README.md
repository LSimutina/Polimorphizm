Дано 2 класса, один описывает точку координат, а другой ломаную линию:

```
public class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class PolyLine {
    Point[] points;

    public PolyLine(Point... arrPoints) {
        this.points = arrPoints;
    }

    public double length() {
        double sum = 0, len1, len2;
        for (int i = 0; i < points.length - 1; i++) {
            len1 = points[i].x - points[i + 1].x;
            len2 = points[i].y - points[i + 1].y;
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }
        return sum;
    }
}
```

Создайте такой подкласс класса PolyLine (также вместо него можно использовать Ломаную сделанную в более ранних задачах), который будет представлять собой замкнутую ломанную линию (ClosedPolyLine), то есть последовательность точек, начинающихся и заканчивающихся на одной и той же точке (см. рисунок 1). Данная сущность во всех отношениях совпадает с обычной Ломаной, кроме расчета длины (она, очевидно, длиннее). Учтите, что не следует просто копировать код метода length из PolyLine, вместо этого следует переиспользовать его.

![image](https://github.com/user-attachments/assets/46423646-ee48-47cf-a361-36bbe4b2c7f0)

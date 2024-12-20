public class Circle {
    double radius; // 数据字段

    Circle() {
        radius = 1.0;
    }

    Circle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

     double getPerimeter() {
        return 2 * Math.PI * radius;
    }

     void setRadius(double newRadius) {
        radius = newRadius;
    }
}

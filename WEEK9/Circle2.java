public class Circle2 {
    /* The radius of the circle */
    double radius;

    /* The number of objects created */
    static int numberOfObjects = 0;

    /* Construct a circle with radius 1 */
    public Circle2(int r) {
        radius = r;
        numberOfObjects++;
    }
    public Circle2() {
        radius = 1;
        numberOfObjects++;
    }
    /* Return number of objects */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /* Return the area of this circle */
    public double getArea() {
        return radius * radius * Math.PI;
    }
}

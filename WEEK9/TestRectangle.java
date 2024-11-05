public class TestRectangle {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        System.out.println("The information of these rectangles is:");
        System.out.println("The first rectangle is " + rectangle1.width +
                " width and " + rectangle1.height + " height");
        System.out.println("The area of this rectangle is " + rectangle1.getArea() +
                "\nThe perimeter of this rectangle is " + rectangle1.getPerimeter());
        System.out.println("The second rectangle is " + rectangle2.width +
                " width and " + rectangle2.height + " height");
        System.out.println("The area of this rectangle is " + rectangle2.getArea() +
                "\nThe perimeter of this rectangle is " + rectangle2.getPerimeter());
    }
}
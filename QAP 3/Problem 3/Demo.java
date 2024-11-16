public class Demo {

    public static void main(String[] args) {
        System.out.println();
        Shape s1 = new Circle("Circle", "Red", true, 2.0);
        s1.getArea();
        s1.getPerimeter();
        System.out.println(s1);

        Shape s2 = new Ellipse("Ellipse", "Blue", false, 3.0, 4.0);
        s2.getArea();
        s2.getPerimeter();
        System.out.println(s2);

        Shape s3 = new Triangle("Triangle", "Green", true, 5.0, 6.0, 11.0);
        s3.getArea();
        s3.getPerimeter();
        System.out.println(s3);

        Shape s4 = new EquilateralTriangle("Equilateral Triangle", "Yellow", false, 7.0, 7.0, 7.0);
        s4.getArea();
        s4.getPerimeter();
        System.out.println(s4);
    }
}

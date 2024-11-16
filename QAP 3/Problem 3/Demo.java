public class Demo {

    public static void main(String[] args) {
        System.out.println();

        Shape[] shapes = new Shape[] {
        new Circle("Circle", "Red", true, 2.0),
        new Ellipse("Ellipse", "Blue", false, 3.0, 4.0),
        new Triangle("Triangle", "Green", true, 5.0, 6.0, 4.0),
        new EquilateralTriangle("Equilateral Triangle", "Yellow", false, 7.0, 7.0, 7.0)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area of " + shape.getName() + ": " + shape.getArea());
            System.out.println("Perimeter of " + shape.getName() + ": " + shape.getPerimeter());
            System.out.println();
        }
    }
}

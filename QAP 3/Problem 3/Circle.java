public class Circle extends Shape {
    // Attributes
    private double radius = 1.0;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Methods
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

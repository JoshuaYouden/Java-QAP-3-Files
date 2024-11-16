public class Circle extends Shape {
    // Attributes
    private double radius = 1.0;

    // Constructor
    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String name, String color, boolean filled, double radius) {
        super(name, color, filled);
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

    @Override
    public String toString() {
        return "A Circle with radius " + radius + ", which is a subclass of Shape";
    }
}

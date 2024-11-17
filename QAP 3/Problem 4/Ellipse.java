public class Ellipse extends Shape {
    // Attributes
    private double majorAxis;
    private double minorAxis;

    // Constructor
    public Ellipse() {
        majorAxis = 1.0;
        minorAxis = 1.0;
    }
    public Ellipse(double majorAxis, double minorAxis) {
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }
    public Ellipse(String name, String color, boolean filled, double majorAxis, double minorAxis) {
        super(name, color, filled);
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    // Getters
    public double getMajorAxis() {
        return majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    // Setters
    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    // Methods
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((majorAxis * majorAxis + minorAxis * minorAxis) / 2);
    }

    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public void scale(double scaleFactor) {
        majorAxis *= scaleFactor;
        minorAxis *= scaleFactor;
    }

    @Override
    public String toString() {
        return "An Ellipse with major axis " + majorAxis + " and minor axis " + minorAxis + ", which is a subclass of Shape";
    }
}
public class Triangle extends Shape {
    // Attributes
    private double sideA;
    private double sideB;
    private double sideC;

    // Constructor
    public Triangle() {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.err.println("Error: All sides must be greater than 0.");
            System.exit(1);
        }
        if (sideA + sideB <= sideC || sideB + sideC <= sideA || sideC + sideA <= sideB) {
            System.err.println("Error: The sides do not form a valid triangle.");
            System.exit(1);
        }

        sideA = 1.0;
        sideB = 2.0;
        sideC = 3.0;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(String name, String color, boolean filled, double sideA, double sideB, double sideC) {
        super(name, color, filled);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Getters
    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    // Setters
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    // Methods
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
        public void scale(double scaleFactor) {
            sideA *= scaleFactor;
            sideB *= scaleFactor;
            sideC *= scaleFactor;
        }

    @Override
    public String toString() {
        return "A Triangle with sides " + sideA + ", " + sideB + ", and " + sideC + ", which is a subclass of Shape";
    }
}

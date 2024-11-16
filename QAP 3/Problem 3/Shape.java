public abstract class Shape {
    // Attributes
    private String name;
    private String color;
    private boolean filled;

    // Constructor
    public Shape() {
        name = "default";
        color = "blue";
        filled = true;
    }

    public Shape(String name, String color, boolean filled) {
        this.name = name;
        this.color = color;
        this.filled = filled;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Methods
    public abstract double getArea();
    
    public abstract double getPerimeter();

    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "not filled");
    }
}

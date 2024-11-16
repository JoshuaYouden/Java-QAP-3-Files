public class Point {
    // Attributes
    private float x;
    private float y;

    // Constructor
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x = 0.0f;
        y = 0.0f;
    }

    // Getters
    public float getX() {
        return x;
    }

    public float getXY() {
        return x + y;
    }

    public float getY() {
        return y;
    }

    // Setters
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Methods
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}
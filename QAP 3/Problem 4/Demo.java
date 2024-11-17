public class Demo {

    public static void main(String[] args) {
        System.out.println();
        Scalable[] scalableObjects = new Scalable[] {
            new Circle("Circle", "Red", true, 2.0),
            new Ellipse("Ellipse", "Blue", false, 3.0, 4.0),
            new Triangle("Triangle", "Green", true, 5.0, 6.0, 4.0),
            new EquilateralTriangle("Equilateral Triangle", "Yellow", false, 7.0, 7.0, 7.0)
        };

        System.out.println("Before scaling:");
        for (Scalable object : scalableObjects) {
            System.out.println(object);
        }

        scaleObjects(scalableObjects, 4.0);

        System.out.println("\nAfter scaling:");
        for (Scalable object : scalableObjects) {
            System.out.println(object);
        }
    }

    public static void scaleObjects(Scalable[] objects, double scaleFactor) {
        for (Scalable object : objects) {
            object.scale(scaleFactor);
        }
    }
}


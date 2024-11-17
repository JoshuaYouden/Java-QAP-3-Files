public class Demo {

    public static void scaleObjects(Scalable[] objects, double scaleFactor) {
        System.out.println();

        Scalable[] scalableObjects = new Scalable[] {
        new Circle("Circle", "Red", true, 2.0),
        new Ellipse("Ellipse", "Blue", false, 3.0, 4.0),
        new Triangle("Triangle", "Green", true, 5.0, 6.0, 4.0),
        new EquilateralTriangle("Equilateral Triangle", "Yellow", false, 7.0, 7.0, 7.0)
        };

        for (Scalable object : scalableObjects) {
            System.out.println("Before scaling:");
            System.out.println(object);
        }

        for (Scalable object : scalableObjects) {
            object.scale(2);
        }

        for (Scalable object : scalableObjects) {
            System.out.println("After scaling:");
            System.out.println(object);
        }
    }
}

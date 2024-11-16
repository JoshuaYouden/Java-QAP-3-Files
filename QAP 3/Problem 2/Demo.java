public class Demo {
    static void main(String[] args) {
        Point p = new Point(2, 3);
        System.out.println();
        System.out.println(p);

        MovablePoint mp = new MovablePoint(2, 3, 4, 5);
        System.out.println(mp);

        mp.move();
        System.out.println(mp);
    }
}

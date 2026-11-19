public class TestPoint {
    public static void main(String[] args) {

        Point p = new Point();
        Point q = new Point(5, 2);
        Point r = new Point(7);
        Point s = new Point(p);

        System.out.println("p = " + p);
        System.out.println("q = " + q);
        System.out.println("r = " + r);
        System.out.println("s = " + s);
    }
}
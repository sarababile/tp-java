
public class TestRectangle {
    public static void main(String[] args) {

        Point h = new Point(1, 5);
        Point b = new Point(6, 2);

        Rectangle r = new Rectangle(h, b);
        System.out.println("Rectangle :");
        r.afficher();
        System.out.println("Surface = " + r.surface());
        System.out.println("Perimetre = " + r.perimetre());

        r.zoom(4, 4);

        System.out.println("Apres zoom :");
        r.afficher();

        System.out.println("Nouvelle surface = " + r.surface());

        r.setHg(new Point(0, 4));
        r.setBd(new Point(3, 0));

        System.out.println("Apres modification :");
        r.afficher();
    }
}

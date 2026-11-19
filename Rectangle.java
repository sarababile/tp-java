
public class Rectangle {
    private Point hg;
    private Point bd;

    public Rectangle() {
        hg = new Point(0, 1);
        bd = new Point(1, 0);
    }
    public Rectangle(Point h, Point b) {
        hg = new Point(h);
        bd = new Point(b);
    }
    public void afficher() {
        System.out.println("Haut gauche: " + hg);
        System.out.println("Bas droite: " + bd);
    }
    public float surface() {
        int largeur = Math.abs(bd.getX() - hg.getX());
        int hauteur = Math.abs(hg.getY() - bd.getY());

        return largeur * hauteur;
    }
    public float perimetre() {
        int largeur = Math.abs(bd.getX() - hg.getX());
        int hauteur = Math.abs(hg.getY() - bd.getY());

        return 2 * (largeur + hauteur);
    }
    public void zoom(int deltax, int deltay) {
        hg.setX(hg.getX() * deltax);
        hg.setY(hg.getY() * deltay);

        bd.setX(bd.getX() * deltax);
        bd.setY(bd.getY() * deltay);
    }

    public Point getHg() {
        return hg;
    }
    public Point getBd() {
        return bd;
    }
    public void setHg(Point hg) {
        this.hg = hg;
    }
    public void setBd(Point bd) {
        this.bd = bd;
    }
}

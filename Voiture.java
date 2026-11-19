
public class Voiture {
    private String modele;
    private String marque;
    private double vitesse;
    private boolean estDemarree;

    private Moteur moteur;
    private Roue[] les4Roues;
    private Roue roueDeSecours;

    public Voiture(String marque, String modele, Moteur moteur,
                   int largeur, int diametreJante) {

        this.marque = marque;
        this.modele = modele;
        this.moteur = moteur;
        this.vitesse = 0;
        this.estDemarree = false;

        les4Roues = new Roue[4];

        for (int i = 0; i < 4; i++) {
            les4Roues[i] = new Roue(largeur, diametreJante);
        }

        if (moteur != null) {
            moteur.setVoiture(this);
        }
    }

    public int deQuellePuissance() {
        if (moteur == null) {
            return 0;
        }

        return moteur.getPuissance();
    }

    public void demarre() {
        estDemarree = true;
    }

    public void accelere(double reel) {
        if (estDemarree && reel > 0) {
            vitesse += reel;
        }
    }

    public void arrete() {
        estDemarree = false;
        vitesse = 0;
    }

    public void changerLeMoteur(Moteur nouveauMoteur) {
        if (moteur != null) {
            moteur.setVoiture(null);
        }

        moteur = nouveauMoteur;

        if (nouveauMoteur != null) {
            nouveauMoteur.setVoiture(this);
        }
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public boolean isEstDemarree() {
        return estDemarree;
    }

    public void setEstDemarree(boolean estDemarree) {
        this.estDemarree = estDemarree;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        changerLeMoteur(moteur);
    }

    public Roue[] getLes4Roues() {
        return les4Roues.clone();
    }

    public void setRoue(int indice, Roue roue) {
        if (indice >= 0 && indice < 4) {
            les4Roues[indice] = roue;
        }
    }

    public Roue getRoueDeSecours() {
        return roueDeSecours;
    }

    public void setRoueDeSecours(Roue roue) {
        roueDeSecours = roue;
    }
}

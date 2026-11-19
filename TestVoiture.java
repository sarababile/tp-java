
public class TestVoiture {
    public static void main(String[] args) {

        Moteur m1 = new Moteur("Diesel", 110);

        Voiture v = new Voiture(
            "Dacia",
            "Logan",
            m1,
            195,
            15
        );

        System.out.println("Marque : " + v.getMarque());
        System.out.println("Modele : " + v.getModele());

        System.out.println("Puissance : "
                + v.deQuellePuissance());

        System.out.println("Nombre de roues : "
                + v.getLes4Roues().length);

        System.out.println("Moteur associe a la voiture : "
                + (m1.getVoiture() == v));

        v.setRoueDeSecours(new Roue(195, 15));

        v.demarre();
        v.accelere(30);

        System.out.println("Vitesse : " + v.getVitesse());

        Moteur m2 = new Moteur("Essence", 130);

        v.changerLeMoteur(m2);

        System.out.println("Nouvelle puissance : "
                + v.deQuellePuissance());

        System.out.println("Ancien moteur associe : "
                + (m1.getVoiture() == null));

        System.out.println("Nouveau moteur associe : "
                + (m2.getVoiture() == v));
    }
}

package ConceptsObjets.TP.entities;

public class Representant extends Commercial {

    private static double POURCENT_REPRESENTANT = 0.2;
    private static double BONUS_REPRESENTANT = 800;



    @Override
    public double calculerSalaire() {
        return getChiffreAffaire() * Representant.POURCENT_REPRESENTANT + Representant.BONUS_REPRESENTANT;
    }

    public Representant(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree, chiffreAffaire);

    }

    @Override
    public String getTitre() {
        return "Le représentant ";
    }
}

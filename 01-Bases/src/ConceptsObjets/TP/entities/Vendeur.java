package ConceptsObjets.TP.entities;

public class Vendeur extends Commercial {

    private static double POURCENT_VENDEUR = 0.2;
    private static double BONUS_VENDEUR = 400;



    @Override
    public double calculerSalaire() {
        return getChiffreAffaire() * Vendeur.POURCENT_VENDEUR + Vendeur.BONUS_VENDEUR;
    }

    public Vendeur(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
        super(nom, prenom, age, dateEntree, chiffreAffaire);

    }



    @Override
    public String getTitre() {
        return "Le vendeur ";
    }
}

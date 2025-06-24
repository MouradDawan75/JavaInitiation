package ConceptsObjets.TP.entities;

public class Technicien extends Employe {

    private double unites;
    private static double FACTEUR_UNITE = 5;



    @Override
    public double calculerSalaire() {
        return unites * Technicien.FACTEUR_UNITE;
    }

    public Technicien(String nom, String prenom, int age, String dateEntree, double unites) {
        super(nom, prenom, age, dateEntree);
        this.unites = unites;
    }

    @Override
    public String getTitre() {
        return "Le technicien ";
    }
}

package ConceptsObjets.Abstraction;

/**
 * Classes filles: Femme, Homme
 */
public abstract class Humain {
    private String nom;
    private String prenom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    //nécessaire pour les classes
    public Humain(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Humain() {
    }

    public void test(){

    }

    //méthode abstraite: méthode non implémentée
    public abstract void identite();
}

package ConceptsObjets.Composition;

public class Client {

    private String nom;

    /*
    Composition (association) d'objet: c'est qu'un objet de type Adresse fasse partie des attributs d'un objet de type Client
     */
    private Adresse adresse;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Client(String nom, Adresse adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    public Client() {
    }
}

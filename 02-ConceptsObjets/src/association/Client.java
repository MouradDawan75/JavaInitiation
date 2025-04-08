package src.association;

import java.io.Serializable;

public class Client implements Serializable {

    private String nom;

    //Composition (association): c'est e fait qu'un objet de type Adresse puisse faire partie des attributs d'un objet de type Client
    //Dans pratique, utilisé pour la gestion des dépendences
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

    public Client() {
    }

    public Client(String nom, Adresse adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }
}

package src;

import java.io.Serializable;

public class Product implements Serializable{

    //clé de chiffrage: si clé différente lors de la désérialisation -> une exception est générée
    private static final long serialVersionUID = 42L;

    private int id;
    private String nom;
    private double prix;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Product() {
    }

    public Product(int id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Product[" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ']';
    }
}

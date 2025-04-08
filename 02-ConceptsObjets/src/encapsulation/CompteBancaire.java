package src.encapsulation;

import java.io.Serializable;
import java.util.Objects;

public class CompteBancaire extends Object implements Serializable {

    //Attributs d'instance
    private String numero;
    private double solde;


    //attribut partagé par toutes les instances
    private static String banque = "bnp";

    public static String getBanque() {
        return banque;
    }

    public static void setBanque(String banque) {
        CompteBancaire.banque = banque;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws Exception {
        if(numero.length() < 6)
            throw new Exception("Numéro doit contenir au minimum 6 caractères....");
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    //Constructeurs
    public CompteBancaire() {
    }

    public CompteBancaire(String numero, double solde) throws Exception {
        setNumero(numero);
        setSolde(solde);
    }

    //Méthodes
    public void depot(double montant){
        this.solde += montant;
    }

    public void retrait(double montant) throws Exception {
        if(this.solde < montant)
            throw new Exception("Solde insuffisant......");

        this.solde += montant;
    }

    public static void modifierBanque(String banque){
        CompteBancaire.banque = banque;
    }

    @Override
    public String toString() {
        return "Numéro: "+this.numero+" Solde: "+this.solde;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CompteBancaire that = (CompteBancaire) o;
        return Objects.equals(numero, that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }

    //Méthode appelée lors de la destruction d'un objet CompteBancaire en mémoire
    //Destructeur
    @Override
    protected void finalize() throws Throwable {
        System.out.println(">>>> objet détruit...........");
    }
}

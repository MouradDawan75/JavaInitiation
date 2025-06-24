package ConceptsObjets.Encapsulation;

import java.util.Objects;

public class CompteBancaire extends Object{

    /*
    Le num d'un compte doit contenir au min 6 caractères
     */

    //attributs
    private String numero;
    private double solde;

    private static String banque = "BNP";

    public static String getBanque() {
        return banque;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if(numero.length() >= 6) {
            this.numero = numero;
        }else{
            System.out.println("Numéro doit contenir au minimum 6 caractères.");
        }
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    //Constructeurs

    public CompteBancaire(String numero, double solde) {
        this.setNumero(numero);
        this.solde = solde;
    }

    public CompteBancaire() {
    }

    //Méthodes:
    public void depot(double montant){
        this.solde += montant;
    }

    public void retrait(double montant){
        if(this.solde >= montant){
            this.solde -= montant;
        }else{
            System.out.println("Solde insuffisant.....");
        }
    }

    public static void modifierBanque(String nomBanque){
        CompteBancaire.banque = nomBanque;
    }

    //toString: permet de personnaliser l'afficher d'un objet -> choisir les attributs à afficher
    @Override
    public String toString() {
        return "Numéro: "+this.numero+" Solde: "+this.solde;
    }

    //Equals + hashcode: permet de dire a quel moment 2 comptes sont égaux

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
}

package Enumeration;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User{
    public String nom;
    public app.Profil profil;
    public List<app.Autorisation> autorisations = new ArrayList<>();
}

public class app {

    public enum Profil{
        ADMIN,
        MANAGER,
        RH
    }

    public enum Autorisation{
        LECTURE,
        SUPPRESSION,
        MODIFICATION,
        ALL
    }

    public enum Erreur{
        CRITIQUE,
        MAJEURE,
        MINEURE
    }



    public static void main(String[] args) {
        /*
        Enum: est une liste de valeurs constantes connues d'avance
         */
        Priority p = Priority.MEDIUM;
        System.out.println(p);

        System.out.println("Index dans l'enum: "+p.ordinal());

        //Lister tous les éléments d'une enum
        Profil[] profilTab = Profil.values();
        for(Profil profil : profilTab){
            System.out.println(profil);
        }

        User u = new User();
        u.nom = "Jean";
        u.profil = Profil.ADMIN;
        u.autorisations.add(Autorisation.LECTURE);
        u.autorisations.add(Autorisation.SUPPRESSION);

        if(u.autorisations.contains(Autorisation.SUPPRESSION)){
            System.out.println("Suppression ok..........");
        }else{
            System.out.println("Action interdite.............");
        }

        System.out.println("Quel est e code de votre erreur (0,1 ou 2) ?");
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt(); //code est l'index de l'élément de l'enum

        //Conversion en tableau -> récupération de l'élément via son index
        Erreur er = Erreur.values()[code];
        System.out.println("votre erreur est: "+er);

    }
}

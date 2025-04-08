package src;

import src.encapsulation.CompteBancaire;
import src.encapsulation.Rectangle;

import java.lang.reflect.Type;

public class App {

    public static void main(String[] args) throws Exception {



        /*

        Approche procédurale: repose principalement sur l'utilisation de paramètres et de fonctions
        Approche objets: repose principalement sur l'utilisation de classes et d'objets

        c'est une approche algorithmétique de résolution de problèmes permettant de produire des programmes modulaires.

        Avantages:

        - Développer une partie de l'application sans qu'il soit nécessaire de connaitre les détails des autres parties.
        - Apporter des modifications locales à un module de l'application sans que cela n'affecte les autres parties
        - Réutiliser  ces modules dans un autre cadre.

        ** Objet:
         est élément identifiable du monde réel: il peut être concrêt (voiture..), ou abstrait (entreprise, temps...).
         Il possède:
         - Une identité: id
         - Un état: ses attributs
         - Un comportement: ses méthodes

         ** Classe: est un type de données. Elle a pour tâche principale de décrire la structure d'un objet.
         Elle définie une sorte de template à partir duquel on crée nos objets. Contient généralement 3 choses:
         - Attributs
         - Méthodes
         - Un constructeur: méthode spéciale qui porte le nom de classe, permettant d'instancier la classe en question
         (initialiser tous les attributs de l'objet)

         Toute classe possède un constructeur généré implicitement par le compilateur


         */

        User u = new User(); // id =  0    nom = null
        String s = "test";
       u.afficherNom();


        System.out.println(User.role);
        User.modifierRole("Manager");

        User u2 = new User(2,"nom", 1500); //problème avec l'âge

        /*
        Concepts Objets: Encapsulation - Héritage - Polymorphisme - Abstraction - Association (Composition)
         */

        double hauteur =10;
        double largeur = 15;
        double surf = surface(hauteur,largeur);

        /*
        Encapsulation:
        1- Regrouper dans une seule classe tous les attributs et les fonctions qui concernent le mm objet
        2- Pas d'accès publique aux attributs d'une classe. L'accès passe obligatoirement par les accésseurs get/set
         */

//        Rectangle rec = new Rectangle();
//        rec.setHauteur(-10);
//        rec.setLargeur(15);
//        System.out.println(rec.surface());

        Rectangle rec1 = new Rectangle(-25,25);
        System.out.println(rec1.surface());

        CompteBancaire cpt = new CompteBancaire("QSqs145", 1000);
        cpt.depot(500);
        cpt.retrait(350);
        System.out.println(cpt);

        CompteBancaire cpt1 = new CompteBancaire("QSqs145", 1000);
        CompteBancaire cpt2 = new CompteBancaire("QSqs145", 5000);

        System.out.println(cpt1.equals(cpt2));

        String s1 = "test";
        String s2 = "test";

        System.out.println(s1.equals(s2));

        cpt1 = null;

        System.gc(); //appel expilicte du Garbage collector qui garantit pas son passage immédiat


    }

    private static double surface(double hauteur, double largeur) {
        return hauteur * largeur;
    }
}

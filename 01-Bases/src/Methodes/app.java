package Methodes;

import java.beans.XMLEncoder;

public class app {

    public static void main(String[] args) {

        /*
        Méthodes: un ensemble d'instructions réutilisable -> Permet de factoriser le code
        Il existe 2 types de méthodes:
        Procédure: est une méthode qui ne renvoie aucun résultat (void)
        Fonction: est une méthode qui renvoie un résultat
        Syntaxe pour déclarer une méthode:

        visibilité(public-private) [static] void (ou type retour) nomMethode(paramètres) { instructions; }

         */

        MesMethodes m = new MesMethodes();
        m.afficher();

        MesMethodes.imprimer();

        int r = MesMethodes.somme(10,20);
        System.out.println(r);

        int[] tab = {10,2,5,17,25};
        MesMethodes.afficher(tab);





    }
}

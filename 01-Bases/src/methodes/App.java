package src.methodes;

import java.beans.XMLEncoder;
import java.sql.SQLOutput;

public class App {

    public static void main(String[] args) {

        /*
        Méthode: est un ensemble d'instructions réutilisable (permet de factoriser le code)
        2 types de méthodes:
        Procédure: méthode qui ne renvoie aucun résultat (void)
        Fonction: méthode qui renvoie un résultat - type du résultat retourné

        Syntaxe:

        accésseur (public - private) [static] type_du_retour (void) nomMethode(paramètres) {instructions}
         */

        MyMethods m = new MyMethods();
        m.afficher();

       int resultat = MyMethods.somme(10,15);
        System.out.println(resultat);

        System.out.println( MyMethods.somme(10.5,11.6));

        int[] tab = {10,2,15,33,45};
        MyMethods.afficher(tab);


        System.out.println(">>>>>>>>> Passage de paramètres par valeurs:");

        int a = 12;
        MyMethods.changeInt(a);

        System.out.println(a);

        System.out.println(">>>>>>>>> Passage de paramètres par réferences:");
        MyMethods.changeArray(tab);

        MyMethods.afficher(tab);

        a = MyMethods.changeOtherInt(a);
        System.out.println(a);

        System.out.println(MyMethods.sum(10,20));
        System.out.println(MyMethods.sum(10,20,30));
        System.out.println(MyMethods.sum(10,20,30,40));

        int[] t = {1,2};
        System.out.println(MyMethods.moyenneTableau(t));
        System.out.println("Somme tab = "+MyMethods.sommeTableau(tab));
        System.out.println("Moyenne tab = "+MyMethods.moyenneTableau(tab));
        System.out.println("Min tab = "+MyMethods.minTableau(tab));



    }
}

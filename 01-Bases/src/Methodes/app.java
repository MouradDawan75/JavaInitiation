package Methodes;


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

        System.out.println("Moyenne = "+MesMethodes.moyenneTableau(new int[]{1, 2}));

        MesMethodes.triCroissantTableau(tab);
        MesMethodes.afficher(tab);

        System.out.println(">>>>>>>> changeInt():");
        int valeur1 = 10;
        MesMethodes.changeInt(10);
        MesMethodes.changeInt(valeur1);

        System.out.println(valeur1);

        MesMethodes.changeTableau(tab);

        MesMethodes.afficher(tab);

        valeur1 = MesMethodes.changeIntValue(valeur1);

        System.out.println(MesMethodes.sommeVariable(10,20));
        System.out.println(MesMethodes.sommeVariable(10,20,30));
        System.out.println(MesMethodes.sommeVariable(10,20,30,40));

        /*
        Convention de nommage:
        PascalCase: MesMethodes -> classes et packages
        camelCase: méthodes et variables
        snake_case: convention utilisée par Python
         */



    }
}

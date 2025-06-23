package Conditions;

public class app {

    public static void main(String[] args) {
        /*
        Bloc conditionnel: est un ensemble d'instructions qui ne s'exécute que si une condition est vérifié
         */


        //if / else if /else
        int x = 0;
        if (x > 0){
            System.out.println("x positif");
        }
        else if (x < 0){
            System.out.println("x est négatif");
        }
        else{
            System.out.println("x est nulle");
        }

        //Opérateur ternaire: syntaxe simplifiée du if/else

        //if/else classique:

        String resultat = null;
        if (x > 0){
            resultat = "positif";
        }
        else {
            resultat = "négatif";
        }

        //syntaxe ternaire: permet de faire des affectations conditionnelles
        // variable = (condition) ? valeur_si_vraie : valeur_si_fausse
        resultat = (x > 0) ? "positif":"negatif";

        //switch/case: syntaxe simplifiée
        int note = 10;
        switch(note)
        {
            case 0:
                System.out.println("null");
                break;

            case 10:
                System.out.println("juste la moyenne");


            case 11:
                System.out.println("juste la moyenne");
                break;

            default:
                System.out.println("Autre note......");

        }

        //Depuis Java 13: ajout de switch expression

        int experience = 3;
        switch (experience){
            case 1,2 -> {
                System.out.println("Débutant");
                System.out.println("Junior");
            }

            case 3,4 ->  System.out.println("Confirmé et sénior");
            case 5 -> System.out.println("Expert");
            default -> System.out.println("Valeur incorrecte......");

        }

        //On a la possibilité d'affecter le résultat à une variable avec le switch expression

        String result = switch(experience){
            case 1,2 -> "débutant et junior";
            case 3,4 -> "confrmé et sénior";
            case 5 -> "expert";
            default -> "Valeur incorrecte........";
        };

        System.out.println(result);

    }
}

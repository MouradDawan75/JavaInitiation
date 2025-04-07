package src;

public class Conditions {

    public static void main(String[] args) {
        /*
        Bloc conditionnel: est un ensembe d'instructions qui ne s'exécute que si une condition est vérifiée
         */

        System.out.println("if, else if, else");
        int x = 0;
        if(x > 0)
            System.out.println("x positif");
        else if (x < 0)
            System.out.println("x négatif");
        else
            System.out.println("x égale 0");

        System.out.println("Opérateur ternaire:");
        //permet de faire des affectations conditionnelles

        int y = 10, z = 15;

        int r = (y > z) ? 11 : 9;
        System.out.println(r);

        System.out.println("switch case:");
        int note = 10;

        switch (note){

            case 0:
                System.out.println("Nulle.....");
                break;
            case 10:
                System.out.println("Juste la moyenne.....");
                break;
            case 20:
                System.out.println("Excellent.......");
            default:
                System.out.println("Autre note........");
                break;

        }
        System.out.println(">>>>>>>> Switch expression:");

        //Depuis Java 13: le switch expression
        int experience = 3;
        switch (experience){
            case 1,2 -> {
                System.out.println("Débutant");
                System.out.println("Junior");
            }
            case 3,4 -> System.out.println("Confirmé et sénior");
            case 5 -> System.out.println("Expert");
            default -> System.out.println("Valeur invalide....");
        }

        //On a la possibilté d'affecter le résultat du switch à une variable

        String resutat = switch (experience){
            case 1,2 -> "Débutant et Junior";
            case 3,4 -> "Confirmé et sénior";
            case 5 -> "Expert";
            default -> throw new IllegalArgumentException("Valeur invalide..........");
        };

        System.out.println(resutat);

    }
}

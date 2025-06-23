package Exo_Calculatrice;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {
            //Affichage d'un menu
            System.out.println(">>>>>>>>> Opérations possibles");
            System.out.println("- Addition: tapez a");
            System.out.println("- Soustraction: tapez s");
            System.out.println("- Multiplication: tapez m");
            System.out.println("- Division: tapez d");
            System.out.println("- Quitter: tapez q");


            String choix = sc.nextLine();

            //Gestion de la fin de la boucle infinie
            if (choix.equals("q")){
                System.out.println(">>> Fin du programme..........");
                 break;
            }

            //Gestion d'un choix invalide
            while( !(choix.equals("a") || choix.equals("s") || choix.equals("m") || choix.equals("d"))){
                System.out.println("Choix invalide. Merci de saisir une autre:");
                choix = sc.nextLine();
            }

            //Saisie de 2 nombres
            System.out.println("Premier nombre: ");
            double nb1 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Second nombre:");
            double nb2 = sc.nextDouble();
            sc.nextLine();

            //Gestion de la division par 0
            if(choix.equals("d") && nb2 == 0){
                System.out.println("Attention, tentative de division par 0");
                while(nb2 == 0){
                    System.out.println("Second nombre différent de 0");
                    nb2 = sc.nextDouble();
                    sc.nextLine();
                }
            }

            switch (choix){
                case "a":
                    System.out.println(nb1 + " + " + nb2 + " = " + (nb1 + nb2));
                    break;

                case "s":
                    System.out.println(nb1 + " - " + nb2 + " = " + (nb1 - nb2));
                    break;

                case "m":
                    System.out.println(nb1 + " x " + nb2 + " = " + (nb1 * nb2));
                    break;

                case "d":
                    System.out.println(nb1 + " / " + nb2 + " = " + (nb1 / nb2));
                    break;
            }

        }



        /*
        Tant que choix est différent de q, le menu s'affiche
        Le programme doit gérer le cas d'un choix saisi invalide
        Si choix valide, lire 2 nombres doubles saisis à la console
        Affichez le résultat.
        Le programme doit gérer le cas d'une division par 0
          */
    }
}

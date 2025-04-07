package src;

import java.util.Scanner;

public class Exo {

    public static void main(String[] args) {
        /*
        Le programme choisit un nombre aléatoire compris entre 1 et 100
        Demandez a l'utilisateur de deviner ce nombre aléatoire
        Il aura droit à 6 tentatives max
        Le programme indiquera au user si le nombre aléatoire est supérieur ou inférieur au nombre saisi.
         */
        int aleatoire = (int) (Math.random() * 100);

        Scanner sc = new Scanner(System.in);

        System.out.println("""
                >>>>>>>>>>>> Devinez le nombre aéatoire compris entre 1 et 100 <<<<<<<<<<<<
                Vous avez droit à 6 tentatives.
                              
                """);

        for (int i = 1; i <= 6; i++){
            System.out.println("Votre nombre: ");
            int nb = sc.nextInt();

            if(nb == aleatoire){
                System.out.println("Trouvé en "+i+" tentatives. Aléatoire = "+aleatoire);
                break;
            }

            if(i == 6){
                System.out.println("Perdu! Aléatoire = "+aleatoire);
                break;
            }

            if(nb < aleatoire){
                System.out.println("Plus grand");
            }
            if (nb > aleatoire){
                System.out.println("Plus petit");
            }


        }

    }
}

package Tableaux;

public class app {

    public static void main(String[] args) {
        /*
        Tableaux statiques
         */
        //Si le contenu n'est pas connu:
        int[] tab = new int[3]; //tableau de 3 cases avec un index qui commence à 0
        tab[0] = 10;
        tab[1] = 20;
        tab[2] = 30;

        //Si le contenu est connu d'avance:
        int[] tableau = {10,20,30};

        System.out.println("Taille du tableau: "+tableau.length);

        //Parcourir
        //for each
        for(int i : tableau){
            System.out.println(i);
        }

        //for
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }

        //tableau à 2 dimensions: tableau de tableaux
        int[][] t2d = new int[2][];
        t2d[0] = new int[2];
        t2d[1] = new int[3];

        //si contenu est connu d'avance:
        int[][] matrice = {{1,2}, {3,4,5}};

        System.out.println("Taille matrice: "+matrice.length);

        //Parcourir le tableau

        //fixer les lignes
        for (int ligne = 0; ligne < matrice.length; ligne++) {
            //fixer les colonnes
            for (int colonne = 0; colonne < matrice[ligne].length; colonne++) {
                System.out.println(matrice[ligne][colonne]);
            }
        }


    }
}

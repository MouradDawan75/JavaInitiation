package src;

public class Tableaux {

    public static void main(String[] args) {

        //Collection statique: possède une taille
        // 2 syntaxes:
        int[] tab = new int[3]; //taille est obligatoire
        tab[0] = 10;
        tab[1] = 20;
        tab[2] = 30;

        //Si le contenu est connu:
        int[] tab2 = {10,20,30};

        //Parcourir un tableau

        //foreach
        for(int i : tab2)
            System.out.println(i);

        //for
        for (int i = 0; i < tab2.length; i++) {
            System.out.println(tab2[i]);
        }

        //Tableau à 2 dimensions: tableau de tableaux
        int[][] matrice = new int[2][]; //nombre de lignes obligatoire
        matrice[0] = new int[2];
        matrice[1] = new int[3];
        matrice[0][0] = 10;
        matrice[0][1] = 20;

        matrice[1][0] = 40;
        matrice[1][1] = 50;
        matrice[1][2] = 60;

        //parcourir la matrice:
        //foreach:

        System.out.println(">>>>>>>>> foreach");
        for(int[] t : matrice)
        {
            for(int v : t){
                System.out.println(v);
            }
        }

        System.out.println(">>>>>>>>> for");
        //for

        //fixer les lignes
        for (int i = 0; i < matrice.length ; i++) {

            //fixer les colonnes
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.println(matrice[i][j]);
            }

        }



    }
}

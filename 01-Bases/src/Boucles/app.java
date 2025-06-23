package Boucles;

public class app {

    public static void main(String[] args) {

        System.out.println(">>>>>>>>> for:");
        //permet de gérer un traitement répététif dont le nbre d'itérations est connu d'avance
        //Ex: affichez hello 5 fois
        for (int i = 1; i < 6 ; i++) {
            System.out.println("Hello");
        }

        System.out.println(">>>>> for each:");
        //permet de parcourir tous les éléments d'un collection: liste, tableau, chaine........
        int[] tab = {10,20,30,40};

        // pour chaque int i contenu dans le tablea tab
        for (int i : tab){
            System.out.println(i);
        }

        System.out.println(">>>>>>>>>>> while:");

        //permet de gérer les traitemenst répététifs dont le nbre d'itérations n'est pas connu d'avance mais qui dépend d'une condition
        //Appelée boucle conditionnelle
        int value = 3;

        //Affichez hello tant que value est inférieur à 5
        while (value < 5 ){
            System.out.println("Hello");
            value++;
        }

        System.out.println(">>>>>>>>> do while");
        //le do while s'exécute au moins 1 fois

        do{
            System.out.println(value);
            value++;
        }while (value < 10);


    }
}

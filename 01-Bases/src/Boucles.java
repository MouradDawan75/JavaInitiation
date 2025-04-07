package src;

public class Boucles {

    public static void main(String[] args) {
        /*
        Bloc répététif: est un ensemble d'instructions répététif.
        For: si nombre d'itérations est connu
        Foreach: permet de parcourir d'une collection
        While: si nombre d'intérations inconnu, mais que le bloc d'instructions dépend d'une condition
        Do while: si nombre d'intérations inconnu, mais que le bloc d'instructions dépend d'une condition
         Le Do while s'exécute au moins une fois.
         */

        System.out.println(">>> for:");

        //Affichez un texte 5 fois:
        for (int i = 1; i <= 5; i++){
            System.out.println("ceci est un texte.......;");
        }

        System.out.println(">>> foreach:");
        int[] tab = {10,20,30};
        for(int i : tab){
            System.out.println(i);
        }

        System.out.println(">>> while et do while");
        int value = 3;

        //Tant que value < 5, affichez un texte -> nbre itérations inconnu
        while (value < 5){
            System.out.println("texte à afficher.......");
            value++;
        }

        //Tant que value < 10 -> affichez un texte -> nbre itérations inconnu
        do{
            System.out.println("do while texte");
            value++;
        }while (value < 10);

        System.out.println(">>>>>>>> continue et break:");

        System.out.println("__ break:");
        for (int i = 0; i < 5; i++){
            if(i == 3)
                break;
            System.out.println("Index: "+i); //0,1,2
        }

        System.out.println("__ continue:");
        for (int i = 0; i < 5; i++){
            if(i % 2 == 0)
                continue; //force le passage à l'itération suivante -> la suite de la boucle n'est pas exécutée
            System.out.println("i = "+i); //1,3
        }

        System.out.println(">>>>>>>>> Labels:");

        loop1:for (int i = 0; i < 5; i++){
            System.out.println("i: "+i);

            loop2:for (int j = 0; j < 5; j++){
                System.out.println("j: "+j);
                if(j>=0 && j<3){
                    System.out.println("continue loop2");
                    continue loop2;
                }else{
                    System.out.println("break loop1");
                    break loop1;
                }
            }
        }

    }
}

package Variables;

import java.util.Scanner;

public class TypeDonnees {

    // main: est le point d'entrée de l'application
    // méthode exécutée au démarrage de l'application

    public static void main(String[] args) {

        //Variable: zone mémoire contenant une valeur typée
        /*
        types primitifs (types valeurs): entiers, réels, char, boolean

        entiers: byte (8 bits), short (16 bits), int(32 bits), long(64 bits)
        char: 2 bits
        boolean: 1 bit
        réels: float (32 bits), double(64 bits)

        Les types primitifs possèdent une taille prédéfinie.

        Java utilise le typage statique

        types complèxes (types réferences): string, dates, classes/objets
         */
        byte myByte = 10;
        int myInt = 15;
        boolean myBool = true;
        char myChar = 'a';
        long myLong = 15;
        String myStr = "chaine";

        //conventions de nommage:
        /*
        Le nom d'une variable pour commencé: soit par une lettre, un undescore ou symbôle monetaire
         */

        int _x = 15;
        int $x = 20;

        System.out.println(myInt);

        //Constante: est une variable dont le contenu ne peut pas être modifiée:
        /*
        Convention de nommage: le nom d'une constante est majuscules

         /*
        Convention de nommage:
        PascalCase: MesMethodes -> classes et packages
        camelCase: méthodes et variables
        snake_case: convention utilisée par Python
         */


        final double LONGUEUR = 15.6;

        final int i =25;
        //i = 55;

        // Variables nulles:
        /*
        Par définition les types primitifs ne sont pas nullables.
        Wrapper: pour chaque primitif, Java propose un type complèxe qui lui associé
        int -> Integer
        char -> Character
        byte -> Byte
        double -> Double
         */

        //int y = null;
        Integer y = null;

        System.out.println(">>>>> Conversion de types:");

        //conversion implicite: concerne le passage d'un type inférieur à un type supérieur
         byte b = 15;
         int t = b;

        //conversion explicite: concerne le passage d'un type supérieur à un type inferieur

        // CAST: (byte), (int), (double) -> risque de perte de données

        int e = 15;
        byte d = (byte) e;

        //conversion de types incompatibes: utilisation des Wrappers
        String s = "35";
        int r = Integer.parseInt(s);

        //Lecture à partir de la console:
        Scanner sc = new Scanner(System.in);
        System.out.println("Votre âge: ");
        int age = sc.nextInt();
        System.out.println("Vous avez: "+age+" ans.");



    }
}

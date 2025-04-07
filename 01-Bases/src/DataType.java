package src;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        /*

        Variable: est une zone mémoire contenant une valeur typée
        En Java, le typage est statique

        Types primitifs (types valeurs): entiers, réels, char, bool -> possèdent une taille prédéfinie
        Types complèxes (types réfernces): classes et objets

         */

        //Variables:
        int x = 10;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        //Constantes:
        final double My_CONSTANTE = 10.5;

        /*
        Convention de nommages:
        Le nom d'une variable peut commencé soit: une lettre, un underscore,ou un symbôle monétaire
        Le nom d'une constante doit être en majuscule.
         */

        int _x = 25;
        long €n = 125;

        //Variables nulles:
        //Les types simples ne sont pas nullables par définition.
        //Wrapper: Une sorte d'objet qui enveloppe un type primitif
        /*
        int -> Integer
        char -> Character
        pour les autres types: mettre la première lettre en majscule
        double -> Double
        float -> Float
        .................
         */
        //int age = null;
        Integer age = null;

        String s = null;

        System.out.println(">>>>>>>>>>> Conversions:");

        System.out.println(">> Conversion implicite");

        //concerne le passage d'un type inférieur à un type supérieur
        short sh = 15; //codé sur 2 octets
        int i = sh;

        System.out.println(">> Conversion explicite");
        //Concerne le passage d'un supérieur à un type inférieur

        int z = 15;
        short sh2 = (short) z; //risque de perte de données

        //Types incompatibles: utilisation des Wrapper

        String chaine = "55";
        int r = Integer.parseInt(chaine);

        //Générer des nombres aléatoires:

        //nombre aléatoire compris entre 1 et 100

        int value = (int)(Math.random() * 100);

        System.out.println(Math.round(15.566));

        //Lecture à partir du terminal:
        Scanner sc = new Scanner(System.in);
        System.out.print("Un nombre entier: ");
        int nb = sc.nextInt();
        System.out.println(nb);

        sc.close();


    }
}

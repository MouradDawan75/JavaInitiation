package src;

public class App {

    public static void main(String[] args) {

        /*
        Le type String est un type complèxe
        Par définition: le type String est immuable.
         */

        String s = "test"; //possibilité d'instancier la classe String sans faire appel au constructeur -> via une chaine littérale
        String ss = new String("chaine");

        s = s.concat("e");

        System.out.println(s);

        String texte = " hello ";

        System.out.println("texte.trim()"+texte.trim()); //suppression des éspaces de début et fin de chaine
        System.out.println("Taille: "+texte.length()); //7
        System.out.println(texte.startsWith("h")); //false
        System.out.println(texte.endsWith("o ")); //true
        System.out.println(texte.replace("ll", "LL"));

        System.out.println(texte.substring(2)); // du char 2 jusqu'à a fin
        System.out.println(texte.substring(1,5)); //du premier char au 4 char (n-1)

        //en mémoire une chaine est un tableau de char

        System.out.println(texte.charAt(1)); //h
        System.out.println(texte.toCharArray()); // conversion en tableau de char

        System.out.println(">>>>>>> Découpage d'une chaine:");

        String chaine = "word1,word2 word3@word4.word5";
        String[] mots = chaine.split("[, @.]");

        for(String m : mots)
            System.out.println(m);

        //Join: méthode statique

        System.out.println(String.join(" ", "ceci","est","une","phrase"));

        //Méthode qui renvoie le nbre de mots dans une chaine

        System.out.println(MyMethods.nombreMots("ceci est une chaine"));

        //Méthode pour inverser une chaine

        System.out.println(MyMethods.inverserChaine("hello"));

        //Méthode qui vérifie si une chaine est un palindrôme: sms, sos.....

        System.out.println(MyMethods.verifPalindrome("Sms"));

        System.out.println(">>>>>>>>>> StringBuilder:");

        //Contrairement au Type String, StringBuilder est muable: 1 seul objet en mémoire

        StringBuilder sb = new StringBuilder("test");

        sb.append("e");

        System.out.println(sb.toString());

    }
}

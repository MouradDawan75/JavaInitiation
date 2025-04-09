package src;

public class MyMethods {

    //Méthode qui renvoie le nbre de mots dans une chaine
    public static int nombreMots(String chaine){
        return chaine.trim().replace("  "," ").split(" ").length;
    }

    //Méthode pour inverser une chaine

    public static String inverserChaine(String chaine){
        String chaineInversee = "";

        for (int i = chaine.length() - 1; i >= 0 ; i--) {
            chaineInversee += chaine.charAt(i);
        }

        return chaineInversee;
    }

    //Méthode qui vérifie si une chaine est un palindrôme: sms, sos.....

    public static boolean verifPalindrome(String chaine){
        chaine = chaine.toLowerCase();
        return chaine.equals(inverserChaine(chaine));
    }
}

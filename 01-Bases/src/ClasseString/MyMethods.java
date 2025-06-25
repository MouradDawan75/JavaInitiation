package ClasseString;

public class MyMethods {

    //méthode qui renvoie le nbre de mots dans une chaine

    public static int nombreMots(String chaine){
        return chaine.trim().replace("  "," ").split(" ").length;
    }

    //méthode qui renvoie la chaine inversée

    public static String inverserChaine(String chaine){
        String chaineInverse = "";

        for (int i = chaine.length() - 1; i >= 0; i--) {
            chaineInverse += chaine.charAt(i);
        }

        return chaineInverse;
    }

    //méthode qui renvoie le nbre d'occurrences d'un mot dans un paragraphe

    public static int nombreOccurrences(String paragraphe, String mot){
        int nb = 0;

        String[] mots = paragraphe.split("[ .:,;!?]");
        for(String m : mots){
            if(m.equalsIgnoreCase(mot)){
                nb++;
            }
        }

        return nb;
    }

    //méthode qui vérifie si une chaine est un palindrôme: sms, sos

    public static boolean verifPalindrome(String chaine){
        chaine = chaine.toUpperCase();
        return chaine.equals(inverserChaine(chaine));
    }
}

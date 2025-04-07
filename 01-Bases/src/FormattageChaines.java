package src;

public class FormattageChaines {

    public static void main(String[] args) {

        int age = 35;
        String prenom = "Marie";

        //Concaténation:
        System.out.println("Prénom: "+prenom+" Age: "+age);

        // Fonction format de la classe String: lien doc: https://www.w3schools.com/java/ref_string_format.asp

        String format = "Prénom: %s Age: %d";
        String resultat = String.format(format, prenom,age);
        System.out.println(resultat);

        //Printf: syntaxe simplifiée de String.format()
        System.out.printf("Prénom: %s Age: %d", prenom,age);

        //Caractères d'échappement:
        /*
        \n: retour à la ligne
        \t: tabulation
        \s: space
        \b: backspace
         */
        String chemin = "c:\\test\\notes.txt";
        System.out.println();

        System.out.println(chemin);

        //Depuis Java 15: ajout de texte bloc: chaine multilignes -> chaine verbatime
        System.out.println("""
                Ceci est une
                chaine sur 
                plusieurs lignes.                
                """);


    }
}

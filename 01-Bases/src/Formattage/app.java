package Formattage;

public class app {

    public static void main(String[] args) {
        int age = 40;
        String prenom = "Marie";

        //Chaine a afficher: Prénom: Marie Age: 40

        //Option1: Concaténation:
        System.out.println("Prénom: "+prenom+" Age: "+age);

        //Option2: la fonction format du type String
        //lien doc: https://www.w3schools.com/java/ref_string_format.asp
        String resultat = String.format("Prénom: %s Age: %d", prenom,age);
        System.out.println(resultat);

        //printf(): syntaxe simplifiée de la fonction format
        System.out.printf("Prénom: %s Age: %d\n", prenom,age);

        //caractères d'échappement:
        /*
        \t: tabulation
        \n: retour à a ligne
        \s: space
        \b: backspace
         */
        System.out.println("\tceci est une chaine\nsur plusieurs\nlignes.");

        String cheminFichier = "c:\\test\\notes.txt";

        //Depuis Java 15: ajout de text bloc -> chaines multilignes -> chaine verbatime

        String bloc = """
                ceci est une chaine
                sur plusieurs
                lignes.
                """;

        System.out.println(bloc);
    }
}

package ClasseString;

public class app {

    public static void main(String[] args) {

        String s = "test"; // possibilité d'instancier la classe String sans faire appel au constructeur (via une chaine littérale)
        s = s.toUpperCase();
        System.out.println(s);
        /*
        Le type String par définition est immuable
         */
        System.out.println(">>>> Quelques fonctions de la classe String:");

        String texte = " ceci est un texte ";
        System.out.println("Suppression d'espaces: "+texte.trim());
        System.out.println("Taille du texte: "+texte.length()); //espace pris en compte
        System.out.println("Texte contient ceci? "+texte.contains("ceci"));
        System.out.println("Texte commence par ceci? "+texte.startsWith("ceci"));
        System.out.println("Texte se termine par texte ? "+texte.endsWith("texte "));
        System.out.println(texte.replace('a', 'e'));
        System.out.println(texte.replace("un texte", "un paragraphe"));



        //en mémoire une chaine est un tableau de char
        System.out.println("premier char dans texte: "+texte.charAt(1));
        System.out.println(texte.substring(2)); //de index 2 jusqu'au dernier
        System.out.println(texte.substring(1,5));

        System.out.println(">>>>> split: découpage d'une chaine");

        String chaineCsv = "mot1,mot2,mot3";
        String[] mots = chaineCsv.split(",");

        for(String m : mots){
            System.out.println(m);
        }

        String chaine = "mot1 mot2,mot3:mot4?";
        String[] tab = chaine.split("[ ,:?]");
        for(String mot : tab)
            System.out.println(mot);

        //Jojn:
        String result = String.join(" ", "ceci","est","une","chaine");
        System.out.println(result);

        System.out.println(">>>>>< StringBuilder:");
        //StringBuilder est un type muable contrairement au type String
        StringBuilder sb = new StringBuilder("test");

        sb.append("e");
        sb.append(" ");
        sb.append("string");
        sb.append(" ");
        sb.append("builder");

        String st = sb.toString();
        System.out.println(st);

        System.out.println(MyMethods.verifPalindrome("Sos"));

        String paragraphe = "Dawan dawan test dawan, dawan.";

        System.out.println(MyMethods.nombreOccurrences(paragraphe, "dawan"));

    }
}

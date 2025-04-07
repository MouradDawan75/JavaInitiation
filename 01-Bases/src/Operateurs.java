package src;

public class Operateurs {

    public static void main(String[] args) {

        System.out.println(">>>> Opérateurs arithmétiques:");

        int i = 25, j = 7;
        int modulo = i % j; //rest de la division
        System.out.println(modulo);

        System.out.println(">>>> Opérateurs de comparaison:");

        //> >= < <= == !=: renvoient un boolean

        System.out.println(">>>> Opérateurs logiques:");

        // &&, ||, ! : renvoient un boolean

        System.out.println("Incrémentation et décrementation:");
        int r = 10, n = 15;
        System.out.println(++r); //pré incrémentation - incrémente la variable ensuite l'utilise
        System.out.println(n++); //post incrémentation - utilise la variable et ensuite l'incrémente -> 15
        System.out.println(n); // 16

        r += 15; // équivalent: r = r + 15;


    }
}

package Operateurs;

public class app {
    public static void main(String[] args) {

        System.out.println(">>>>> Opérateurs arithmériques:");
        int i = 10, j = 3;

        int somme = i + j;
        int soustraction = i - j;
        int multiplication = i * j;
        int division = i / j;
        int modulo = i % j; // modulo: reste de la division entière
        System.out.println("Modulo = "+modulo);

        System.out.println(">>>> Incrémentation - Décrémentation:");

        int r = 10, n = 10;
        System.out.println(r++); //post incrémentation -> utilise la varibale et l'incrémente par la suite
        System.out.println(++n); //pré incrémentation -> incrémente la variable et l'utilise par la suite

        System.out.println(r--); // post décrépmentation
        System.out.println(--n); //pré décrémentation

        r += 5; //syntaxe simplifiée de: r = r + 5
        n -= 2; // n = n - 2

        System.out.println(">>>>>>>>>>> Les opérateurs de comparaison:");
        // > >= < <= égalité (==), différent != -> renvoient un boolean

        System.out.println(">>>>> Les opérateurs logiques:");
        // && (et logique), || (ou logique), ! (non logique) -> renvoient un boolean
        /*
        Table logique:
        A   B   A && B  A || B
        v   v     v        v
        v   f     f        v
        f   f     f        f
         */

        int v1 = 10, v2 = 15;

        System.out.println((v1 > 0) && (v1 > v2)); // false
        System.out.println((v1 > 0) || (v1 > v2)); // true

    }
}

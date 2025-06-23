package Methodes;

public class MesMethodes {
    /*
    Une peut contenir 2 types de méthodes:
    - Méthode de classe (static): est une méthode accéssible via le nom de la classe
    - Méthode d'instance: est une méthode accésible via une instance de classe. Instancier une classe c'est créer un objet à partir de la classe
     */

    //méthode d'instance
    public void afficher(){
        System.out.println("méthode afficher............");
    }

    //méthode de classe
    public static void imprimer(){
        System.out.println("méthode imprimer.......");
    }

    /**
     * Fonction qui renvoie la somme de 2 entiers
     * @author dawan
     * @param x: est un entier
     * @param y: est un entier
     * @return: la somme de x et y
     */
    public static int somme(int x, int y){
        return x + y;
    }

    public static int sommePositive(int x, int y){
//        if(x>0 && y>0){
//            return x+y;
//        }else{
//            return 0;
//        }
        if(isPositif(x) && isPositif(y)){
            return x+ y ;
        }else{
            return 0;
        }
    }

    //A définir lorsqu'on souhaite découper une méthode complèxe en petites méthodes ne gérant qu'un seul besoin fonctionnel
    /*
    Une méthode complèxe est généralement une méthode dont e nombre de lignes de code dépasse 25 lignes
     */
    private static boolean isPositif(int i){
        return i > 0;
    }

    /*
    Surcharge de méthodes: c'est pouvoir définir la même méthode dans le mm classe, en modifiant les paramètres soit en nombre
    soit en type
     */

    public static void afficher(int[] tab){
        for (int i : tab)
            System.out.println(i);
    }

    //surcharge en modifiant le type des params
    public static double somme(double x, double y){
        return x + y;
    }

    //surcharge en modifiant le nombre de params
    public static double somme(double x, double y, double z){

        return x + y + z;
    }

    //méthode qui renvoie la somme des éléments d'un tableau d'entiers

    public static int sommeTableau(int[] tab){
        int s = 0;
        for(int i:tab){
            s += i;
        }

        return s;
    }

    //méthode qui renvoie la moyenne des éléments d'un tableau d'entiers

    public static double moyenneTableau(int[] tab){
        double somme = sommeTableau(tab);
        int nbElemenst = tab.length;
        return somme/nbElemenst;

        /*
        int/int: Java exécute une division entière
         */
    }

    //méthode qui renvoie l'élément le plus petit d'un tableau d'entiers

    public static int minTableau(int[] tab){
        int m = Integer.MAX_VALUE;
        for(int e : tab) {
            if (e < m) {
                m = e;
            }
        }
        return m;

    }

    //méthode pour un tri croissant des éléments d'un tableau d'entiers

    public static void triCroissantTableau(int[] tab){

        int tmp= 0;
        for (int i = 0; i < tab.length - 1; i++) {

            if(tab[i] > tab[i+1]){
                tmp = tab[i];
                tab[i] = tab[i+1];
                tab[i+1] = tmp;
            }

        }
    }

    //méthode qui permute 2 entiers
    //passage de paramètres par valeur
     public static void changeInt(int x){
        x += 100;
     }

     public static int changeIntValue(int x){
        return x += 100;
     }

     //Passage de paramètres par réference
     public static void changeTableau(int[] tab){
        tab[0] += 100;
     }

     //méthode récursive:
    public static int factoriel(int x){
        if(x==0){
            return 1;
        }else{
            return x * factoriel(x-1);
        }
    }

    //méthode avec un nombre variable de paramètres:

    public static int sum(int x, int y){
        return x + y;
    }
    public static int sum(int x, int y, int z){
        return x + y + z;
    }

    public static int sum(int x, int y, int z, int d){
        return x + y + z + d;
    }

    //Permet d'éviter de définir les différentes surcharges possible pour une méthode dont le nombre de params change
    public static int sommeVariable(int... entiers){
        //entiers: il s'agit d'un tableau à taille variable
        int s = 0;
        for(int i : entiers)
            s += i;

        return s;
    }

    public static void produit( int x, int... entiers){

    }

}

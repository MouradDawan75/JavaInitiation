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
    //méthode qui renvoie la moyenne des éléments d'un tableau d'entiers
    //méthode qui renvoie l'élément le plus petit d'un tableau d'entiers
    //méthode pour un tri croissant des éléments d'un tableau d'entiers

}

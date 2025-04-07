package src.methodes;

/*
Dette technique: désigne un code non documenté, pas assez documenté ou mal documenté
 */

/**
 * Classe qui propose des méthodes très utiles
 */
public class MyMethods {

    /*
    Une classe peut contenir 2 types de méthodes:
    - méthode d'instance: accéssible via une instance de la classe
    - méthode de classe (static): accéssible via la classe
     */

    //Méthode d'instance
    public void afficher(){
        System.out.println("exemple de procédure.....");
    }

    //Méthode de classe:

    /**
     * Méthode qui renvoie la somme de 2 entiers
     * @author Dawan
     * //@exception
     * @param x: est un entier
     * @param y: est un entier
     * @return return x+y
     */
    public static int somme(int x, int y){
        return x + y;
    }

    /*
    Surcharge de méthode: c'est pouvoir définir la même méthode dans la même en modifiant la liste des params
    soit en nombre, soit en type
     */

    public static int somme(int x, int y, int z){
        return x + y + z;
    }

    public static double somme(double x, double y){
        return x + y;
    }

    //surchage de la méthode d'instance afficher
    public static void afficher(int[] tab){
        for(int i : tab)
            System.out.println(i);
    }

    /*
    Passage de paramètres par valeur
     */

    public static void changeInt(int x){
        x += 15;
    }

    public static void changeArray(int[] tab){
        tab[1] = 99;
    }

    //Méthode pour modifier le contenu d'un type simple:
    public static int changeOtherInt(int x){
        return x += 15;
    }

    //Méthode récursive:

    public static int calculFactorial(int i){
        if(i == 0) {
            return 1;
        }
        else{
            return i * calculFactorial(i - 1);
        }
    }

    //Méthode avec un nombre variable de paramètres
    /*
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
     */

    public static int sum(int... ints){
        //int... est un tableau a taille variable
        int s = 0;
        for(int e : ints){
            s += e;
        }

        return s;
    }

    /*
    Le nombre variable de paramètres dans la liste des params est à définir en dernier
     */
    public static void m(int x, int... entiers){

    }

    //Méthode qui renvoie la somme des éléments d'un tableau d'entiers
    //Méthode qui renvoie la moyenne des éléments d'un tableau d'entiers
    //Méthode qui renvoie l'élément le plus petit d'un tableau d'entiers



}

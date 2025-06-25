package Exceptions;

import ConceptsObjets.Encapsulation.CompteBancaire;

public class app {
    public static void main(String[] args) {

        /*
        Il existe 3 types d'erreurs possibles:
        - Erreurs de syntaxe (compilation): sont détectées automatiquement par l'IDE
        - Exception: erreur qui provoque l'arrêt de l'application
        - Code fonctionnel qui renvoi un résultat inattendu -> debbugage

        Pour éviter l'arrêt de l'application, une exception doit être gérée
        Pour gérer une exception, on utilise le try/catch

        Il existe plusieurs types d'exceptions, chacun d'elles porte e nom de l'erreur qu'elle génère.
        Toutes les exception dérivent de la classe Exception

         */

        //Obligation: une ressource (fichier,BD) doit être fermée libérée à la fin de son utilisation
        //Bonne pratique: prévoir un try/catch lors de manipulation de ressource

        int x = 10;
        int[] tab = {10,20};

        try {
            System.out.println(tab[0]);
            System.out.println(x / 2);
            //ouverture d'un lecture

//        } catch (ArithmeticException e) {
//            System.out.println("Exception gérée......");
//        } catch (IndexOutOfBoundsException e1){
//            System.out.println(e1.getMessage());
//            e1.printStackTrace();
//        }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            //bloc optionnel qui s'exécute tout le temps
            System.out.println(">> bloc finally....");
            //Fermeture du fichier
            //Le bloc finally sert dans la pratique à libérer les ressources utilisée dans le try
            }

        try {
            division(0);
        } catch (Exception e) {
            //remplir un fichier de logs
            //remplir une table.......
        }

        CompteBancaire cb = null;
        try {
            cb = new CompteBancaire("sdf", 1500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(cb.getSolde());


        System.out.println(">>>> suite de l'application....");

    }


    /**
     * Méthode qui génère une exception si x = 0
     * @param x: est un entier
     * @throws Exception: exception générique
     */
    private static void division(int x) throws Exception {
        //option1: la méthode gère sa propre exception
//        try {
//            System.out.println(10 / x);
//        } catch (Exception e) {
//            System.out.println("Exception gérée dans la méthode.....");
//        }
        //option2: faire une remontée d'exception
        if(x != 0){
            System.out.println(10 / x);
        }else {
            /*
            throw permet de déclencher une exception
            throws permet de remonter l'exception aux appelants de la méthode
             */
            throw new Exception("Message de l'exception.....");
        }
    }
}

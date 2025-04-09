package src;

public class App {

    public static void main(String[] args) {
        /*
        Types d'erreurs possibles dans un code:
        - Erreurs de compilation: elles sont détectées automatiquement par l'IDE
        - Exception: est une qui provoque l'arrêt de l'application
        - Code fonctionnel mais qui renvoi un résultat inattendu: faire du debuggage

        Pour éviter l'arrêt de l'application, une exception doit être gérée.
        Pour gérer l'exception, on utilise le bloc try/catch

        Il existe plusieurs types d'exceptions, chacune d'elle porte le nom de l'erreur qu'elle génère.
        Il existe aussi le type générique (anonyme) Exception qui est la classe mère de toutes les autres exceptions

         */

        int x =10;
        int[] tab = {10,20};


        try {
            System.out.println(tab[2]);
            System.out.println(x / 0);

        }catch (ArithmeticException e){
            System.out.println("exception gérée.........");
            System.out.println(e.getMessage());
           // e.printStackTrace();
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(">>>>>>>> Utilisation du type Exception:");
        /*
        Obligation: une ressource (fichier, BD....) doit être libérée à la fin de son utilisation

        Bonne pratique: prévoir un try/catch lors de l'utilisation de ressources, plus le bloc finally pour es libérer
         */


        try {
            System.out.println(x / 2);
            System.out.println(tab[0]);
            //Ouverture d'un fichier lecture
            //.................echec de lecture



        }catch (Exception e){
            System.out.println("exception gérérique.........");
            System.out.println(e.getMessage());
            //remplir un fichier de logs
            //Fermeture du fichier
        }finally {
            //bloc optionnel qui s'exécute tout le temps: exception ou pas
            System.out.println("bloc finally.......");
            //Fermeture du fichier
            //Sert dans la pratque à libérer les ressources utilisées dans le try
        }

        try {
            division(0);
        } catch (Exception e) {
            System.out.println("Exception gérée par l'appelant.........");
        }

        System.out.println(">>> suite de l'application.......");

    }


    // Bonne pratique: en cas de remontée d'exception, générez la doc technique pour le mentionner explicitement
    /**
     * Méthode qui génère une exception si le paramètre x est égale à 0
     * @param x
     * @throws Exception
     */
    public static void division(int x) throws Exception {

        //Option1: la méthode gère sa propre exception
//        try {
//            System.out.println(10 / x);
//        }catch (Exception e){
//            System.out.println("exception gérée par la méthode......");
//        }

        //Option2: faire une remontée d'exception - l'appelant doit gérer l'exception
        if(x != 0){
            System.out.println(10 / x);
        }else{
            //throw: permet de déclencher des exceptions
            throw new Exception("x doit être différent de 0");
        }
    }
}

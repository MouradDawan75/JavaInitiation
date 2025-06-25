package Collections;

import ConceptsObjets.Encapsulation.CompteBancaire;

import java.util.*;


public class app {

    public static void main(String[] args) throws Exception {
        /*
        Collections: se sont des tableaux dynamiques qui ne peuvent contenir que des objets
        Pour les types primitifs, utilisez les Wrappers
         */

        System.out.println(">>>>>>>>> List et ArrayList:");

        //liste polymorphique
        List array = new ArrayList();
        array.add("test");
        array.add(15);
        array.add(true);

        //liste fortement typée
        List<Integer> entiers = new ArrayList<>();

        //ajouts
        entiers.add(10);
        entiers.add(0,15); //index commence à 0

        //modifications
        entiers.set(0, 44);

        //suppressions
        System.out.println("Taille: "+entiers.size());

        //supprimer 10 dans a la liste
        System.out.println("liste contient 10: "+entiers.contains(10));

        Integer i = 10;
        entiers.remove(i);

        System.out.println("liste contient 10: "+entiers.contains(10));

        //Les doublons sont autorisés:
        entiers.add(55);
        entiers.add(55);
        entiers.add(55);

        for(int e : entiers){
            System.out.println(e);
        }

        //Supprimer toutes les occurrences de 55:
        Integer e = 55;

        entiers.remove(e);
        System.out.println(">>>>>>>>>>> suppressions des doublons:");
        for(int x : entiers){
            System.out.println(x);
        }

        entiers.removeAll(List.of(55));
        System.out.println(">>>>>>>>>>> suppressions des doublons avec removeall():");
        for(int x : entiers){
            System.out.println(x);
        }

        System.out.println(">>>>>>>> stack:");
        //stack: pile -> stockage LIFO -> Last In First Out
        //stack polymorphique ou fortement typée

        Stack<String> pile = new Stack<>();
        pile.add("test1");
        pile.add("test2");
        pile.add("test3");

        System.out.println("Pile contient test3 ?"+pile.contains("test3"));

        pile.pop(); //supprime e dernier par défaut

        System.out.println("Pile contient test3 après pop() ?"+pile.contains("test3"));

        System.out.println("Prochaine élément à supprimer: "+pile.peek());

        System.out.println(">>>>>> Queue:");
        //Stockage FIFO -> First In First Out

        // Queue polymorphique - fortement typée
        Queue queue = new LinkedList();

        queue.add(true);
        queue.add(10);
        queue.add("test");

        queue.remove(); //supprime le premier par defaut

        System.out.println("queue contient true ? "+queue.contains(true));

        System.out.println("Prochain élément à supprimer: "+queue.peek());

        System.out.println(">>>>>>>>>>>> Map:");
        //Map: est une collection qui fonctionne par association clé:valeur
        Map<String,String> dictionnaire = new HashMap<>();

        dictionnaire.put("user", "admin");
        dictionnaire.put("password", "@@pwd@@");

        if(dictionnaire.containsKey("password")){
            System.out.println(dictionnaire.get("password"));
        }

        List<CompteBancaire> debiteurs = new ArrayList<>();
        debiteurs.add(new CompteBancaire("sdqd154", -1500));
        debiteurs.add(new CompteBancaire("458dert", -900));

        List<CompteBancaire> crediteurs = new ArrayList<>();
        crediteurs.add(new CompteBancaire("sdqd154", 1589));
        crediteurs.add(new CompteBancaire("458dert", 7598));

        Map<String, List<CompteBancaire>> comptesMap = new HashMap<>();

        comptesMap.put("crediteurs", crediteurs);
        comptesMap.put("debiteurs", debiteurs);

        //Affichez les comptes créditeurs depuis la Map

        if(comptesMap.containsKey("crediteurs")){
            for(CompteBancaire c : comptesMap.get("crediteurs")){
                System.out.println(c);
            }
        }



    }
}

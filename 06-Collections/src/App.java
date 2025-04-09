package src;

import src.comparators.SoldeCroissantComparator;
import src.comparators.SoldeDecroissantComparator;

import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {

        /*
        L'API collection de Java porpose 2 types de collections qui sont des tableaux dynamiques qui ne peuvent contenir que des objets:
        - Collections de type Array
        - Collections de type Mapping

         */

        System.out.println(">>>>>>>>>>>>> Collections faiblement typées:");
        ArrayList array = new ArrayList();

        array.add("test");
        array.add(2);
        array.add(true);

        System.out.println("Taille: "+array.size());
        System.out.println("Index d'un élément: "+array.indexOf(true)); //index commence 0 -> renvoie: 2

        //Ajouts:
        array.add(2, 15.5);
        System.out.println("Index d'un élément: "+array.indexOf(true)); // 3

        //Modifications:
        array.set(3,false);

        System.out.println("array contient true? :"+array.contains(true));
        System.out.println(array.size());

        //Suppressions
        array.add(5);
        array.add(6);
        array.add(6);
        array.add(6);
        array.add(6);
        array.add(6);
        array.add(3);
        array.remove(3);
        System.out.println("array contient 3? :"+array.contains(3)); //true

        Integer trois = 3;
        array.remove(trois);

        System.out.println("array contient 3? :"+array.contains(3));

        for(Object o : array)
            System.out.println(o);



        System.out.println(">>>>>>> Suppression des doublons:");

        Integer six = 6;
        array.remove(six);

        for(Object o : array)
            System.out.println(o);

        List<Integer> lst = new ArrayList<>();
        lst.add(6);
        array.removeAll(lst);

        System.out.println(">>> removeAll()");

        for(Object o : array)
            System.out.println(o);

        System.out.println(">>>>>>>>>>> Collections fortement typées:");

        System.out.println("-----------------------------------------List");
        //List: collection ordonnée avec doublons
        List<Integer> entiers  = new ArrayList<>();
        entiers.add(10);
        entiers.add(11);
        entiers.add(12);
        entiers.indexOf(10);


        System.out.println("-----------------------------------------Set");
        //Set: collection non ordonnée sans doublons

        Set<String> chaines = new HashSet<>();

        chaines.add("test");
        chaines.add("test");
        chaines.add("dawan");
        chaines.add("jeahnn");

        //chaines.indexOf() -> pas d'index dans un Set

        System.out.println("Taille du set: "+chaines.size());

        for(String s : chaines)
            System.out.println(s);

        System.out.println("-----------------------------------------Stack: LIFO");
        //stack: stockage LIFO: Last In First Out

        Stack<Integer> pile = new Stack<>();
        pile.push(10);
        pile.push(11);
        pile.push(12);

        System.out.println("taille de la stack: "+pile.size());

        pile.pop(); //suprrimer le dernier élément

        System.out.println("Stack contient 12 ? "+pile.contains(12)); //false

        System.out.println("Prochain élément à supprimer: "+pile.peek());

        System.out.println("-----------------------------------------Queue: FIFO");
        //Queue: stockage FIFO: First In First Out

        Queue<String> queue = new ArrayDeque<>();
        queue.add("test1");
        queue.add("test2");
        queue.add("test3");

        System.out.println("Taile de queue: "+queue.size());
        queue.remove(); //supprimer le premier élément par défaut

        System.out.println("queue contient test1 ? "+queue.contains("test1"));
        System.out.println("Prochain élement à supprimer: "+queue.peek());

        System.out.println(">>>>>>>>>>>>> Collection Map:");
        Map<String, String> dict = new HashMap<>();

        System.out.println("Taille de map: "+ dict.size());

        dict.put("Server", "192.168.10.10");
        dict.put("Port", "8080");

       if( dict.containsKey("Server"))
           System.out.println(dict.get("Server"));
       else
           System.out.println("Clé introuvable...");

       //Les clés sont uniques dans une Map
        dict.put("Port", "9090");
        System.out.println(dict.get("Port"));

        /*
        Stockage pratique pour gérer les paramètres de configuration ou pour classer des objet par catégorie
         */
        dict.keySet(); //renvoie un Set de clés (les clés sont uniques)
        dict.values(); //renvoie une collection de valeurs (avec doublons possibles)

        List<CompteBancaire> comptes = new ArrayList<>();
        comptes.add(new CompteBancaire("sde125", 4000));
        comptes.add(new CompteBancaire("defr158", 1500));
        comptes.add(new CompteBancaire("pmlo25", 2200));
        comptes.add(new CompteBancaire("azer99", 1300));

        System.out.println(">>>>>>>>>>>>> Trier des listes:");
        comptes.sort(new SoldeCroissantComparator());

        for (CompteBancaire cb : comptes)
            System.out.println(cb);

        System.out.println(">>>>>>Tri inverse:");
        comptes.sort(new SoldeDecroissantComparator());

        for (CompteBancaire cb : comptes)
            System.out.println(cb);
    }

}

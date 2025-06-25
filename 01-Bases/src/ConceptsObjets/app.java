package ConceptsObjets;

import ConceptsObjets.Abstraction.Femme;
import ConceptsObjets.Abstraction.Homme;
import ConceptsObjets.Abstraction.Humain;
import ConceptsObjets.Composition.*;
import ConceptsObjets.Encapsulation.CompteBancaire;
import ConceptsObjets.Encapsulation.Rectangle;
import ConceptsObjets.Heritage.Animal;
import ConceptsObjets.Heritage.Chat;
import ConceptsObjets.Heritage.Chien;
import ConceptsObjets.Heritage.Giraffe;

public class app {

    public static void main(String[] args) throws Exception {
        /*
        Approche procédurale: repose sur l'utilisation de params et de fonctions
        Approche objets: repose sur l'utilisation de classes et d'objets
        c'est une approche algorithmique de résolution de problèmes permettant de produire des programmes modulaires
        Objectifs:
        - Developper une partie de l'application sans qu'il soit nécessaire de connaitre les détails internes des autres partie
        - Apporter des modifications locales à un module sans que cela n'affècte le reste du programme
        - Possibilté de réutiliser des fragments de codes dans un autre cadre

        Objet: élément identifiable du mode réel
        Il possède:
        - une identité
        - un état: ses attributs
        - un comportement: les méthodes de l'objet

        Une classe a pour tâche principale de décrire la structure d'un objet. Elle définie une sorte de template à partir duquel
        on crée nos objets.
        Elle contient généralement 3 éléments:
        - Attributs - propriétés
        - Méthodes
        - Un constructeur: méthode spéciale qui porte le nom de la classe permettant de l'instancier. Le rôle d'un constructeur est
        d'initialiser tous les attributs de l'objet

        Toute classe possède un constructeur généré implicitement par le compilateur

         */

        User u = new User(); // nom = null  age = 0
        System.out.println(u.nom);
        System.out.println(u.age);

        u.nom = "DUPONT";
        u.age = 50;

        User u1 = new User("NOM", 65);

        u1.afficheNom();

        System.out.println(User.profile);
        u1.modifierProfile("Manager");

        User u2 = new User("TEST", 1500);

        u.age = 199;
        /*
        Concepts objets:
        Encapsulation - Héritage - Polymorphisme - Abstraction - Composition (association)
         */

        System.out.println(">>>>>>>>>>>>>>>> Encapsulation:");

        double hauteur = 10;
        double largeur = 5;

        double surf = surface(hauteur,largeur);

        /*
        Passage à une approche objets:
        1- Regrouper dans une seule et mm classe tous les params et toutes les fonctions concernent le mm sujet
        2- Les attributs d'une classe doivent être privés. L'accès aux attributs passe forcément par les accésseurs (getter/setter)
         */

        Rectangle rec = new Rectangle();
        rec.setHauteur(-10);
        rec.setLargeur(5);
        rec.surface();

        CompteBancaire cpt1 = new CompteBancaire("sdqd145", 500);
        cpt1.depot(1000);
        cpt1.retrait(850);

        System.out.println(cpt1);

        CompteBancaire c1 = new CompteBancaire("sqdq145", 450);
        CompteBancaire c2 = new CompteBancaire("sqdq145", 2500);

        System.out.println(c1.equals(c2));

        String s1 = "test";
        String s2 = "test";

        System.out.println(s1.equals(s2));

        System.out.println(">>>>>>>>>>>>>>>> Héritage - Poymorphisme:");

        Animal a = new Animal();
        a.setNom("nom_animal");
        a.setAge(5);
        a.emettreSon();


        Chat c= new Chat();
        c.setNom("chat");
        c.setAge(3);
        c.emettreSon();

        System.out.println("=============================================");
        System.out.println(c instanceof Chat);
        System.out.println(c instanceof Animal);
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Chat);
        System.out.println("=============================================");

        /*
        Via l'héritage une classe fille a accès a tous les memebres publiques définis dans la classe mère
        - En plus des attributs définis dans la classe mère, une classe fille peut avoir des attributs qui lui sont spécifiques
        - En plus des méthodes définies dans la classe mère, une classe fille peut avoir des méthodes qui lui sont spécifiques
         */
        c.dormir();

        c.emettreSon();

        Chien ch = new Chien();
        ch.emettreSon();

        Animal a1 = new Animal();
        Animal a2 = new Chat();
        Animal a3 = new Chien();
        /*
        Polymorphisme: c'est qu'un objet puisse prendre plusieurs formes. C'est une conséquence de l'héritage, c'est l'objet
        parent puisse prendre la forme de tous les objets enfants
         */

        //Collection polymorphique:
        Animal[] animaux = new Animal[10];
        animaux[0] = new Animal();
        animaux[1] = new Chat();
        animaux[2] = new Chien();
        animaux[3] = new Giraffe();

        son(new Animal());
        son(new Chat());
        son(new Chien());
        son(new Giraffe());

        a1 = new Chat();
        a1 = new Chien();

        Object o = true;
        Object o1 = "chaine";
        Object o2 = 15;
        Object o3 = new Animal();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>> Abstraction:");
        /*
        Une classe abstraite est une classe non instanciable.
        Pour l'instancier, on doit utiliser une de ses classes filles
         */
        Homme h = new Homme();
        Femme f = new Femme();
        Humain hum = new Homme();

        System.out.println(">>>>>>>>>>>> Composition:");

        Client cl = new Client("Carrefour", new Adresse(10, "rue Machin 75001 Paris"));

        IClient client = new ClientDatabaseImpl();
        client.insert(cl);
        client.update(cl);
        client.delete(cl);

        client = new ClientFichierImpl();
        client.insert(cl);

    }

    private static double surface(double hauteur, double largeur) {
        return hauteur * largeur;
    }

    //Méthode polymorphique
    private static void son(Animal a){
        a.emettreSon();
    }
}

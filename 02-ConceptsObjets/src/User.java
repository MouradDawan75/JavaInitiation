package src;

public class User {

    //attributs d'instance
    public int id;
    public String nom;
    public int age;

    //attribut de classe: attribut partagé par toutes les instances
    public static String role = "admin";

    //constructeurs
    //nécessaire pour la sérialisation et pour d'autres bibliothèques externes
    public User(){

    }

    public User(int id, String nom, int age){
        this.id = id;
        this.nom = nom;
        this.age = age;
    }



    //méthodes

    //Méthode d'instance: est une méthode qui concerne une instance spécifique
    public void afficherNom(){
        System.out.println(nom);
    }

    public static void modifierRole(String role){
        User.role = role;
    }
}
/*
Java Bean:
classe qui implèmente l'interface Serializable
possède des attributs privés avec les getter/setter
possède le constructeur sans paramètres

Pojo: Plain Old Java Object
attributs publiques ou privés
avec ou sans getter/setter
peut contenir un constructeurs avec paramètres
peut ne pas implémenter l'interface Serializable
 */
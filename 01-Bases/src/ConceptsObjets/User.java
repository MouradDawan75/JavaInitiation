package ConceptsObjets;

public class User {

    //attributs - propriétés
    //attributs d'instance
    public String nom;
    public int age;

    //attributs globale (de classe) partagé par tous es objets de type User
    public static String profile = "admin";

    //constructeurs

    public User(String nom, int age) {
        //this: mot clé qui pointe vers l'objet en cours d'utilisation
        this.nom = nom;
        this.age = age;
    }

    public User(String nom) {
        this.nom = nom;
    }

    public User() {
    }

    //méthodes:

    //méthode d'instance est une méthode qui concerne une instance particulière
    public String afficheNom(){
        return this.nom;
    }

    public static void modifierProfile(String nomProfile){
        User.profile = nomProfile;
    }
}

package src;

import java.util.ArrayList;
import java.util.List;

class User{
    public String nom;
    public Profil profil;
    public List<Autorisation> autorisations = new ArrayList<>();
}

public class Enumerations {

    public enum Priority{
        HIGH,
        MEDIUM,
        LOW
    }

    public static void main(String[] args) {
        //Enum: est une collection constante d'éléments

        Priority p = Priority.HIGH;
        System.out.println(p);

        switch (p){
            case HIGH ->  System.out.println("High");
            case MEDIUM -> System.out.println("Medium");
            case LOW -> System.out.println("Low");
        }

        //Parcourir une enum
        for(Priority e : Priority.values()){
            System.out.println(e); //valeur chaine
            System.out.println(e.ordinal()); //index de l'élément dans l'enum
        }

        User user = new User();
        user.nom = "DUPONT";
        user.profil = Profil.MANAGER;
        user.autorisations.add(Autorisation.SUPPRESSION);
        user.autorisations.add(Autorisation.LECTURE);

        if(user.autorisations.contains(Autorisation.SUPPRESSION)){
            System.out.println("Suppression OK");
        }else {
            System.out.println("Action interdite");
        }
    }
}

package src.heritage;

import java.io.Serializable;

public class Animal implements Serializable {

    private String nom;
    private int age;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal() {
    }

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void emettreSon(){
        System.out.println("Son de l'animal...");
    }
}

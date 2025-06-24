package ConceptsObjets.Encapsulation;

public class Rectangle {

    private double hauteur;
    private double largeur;
    private int age;

    private int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18 && age <= 60)
            this.age = age;
        else
            System.out.println("Age entre 18 et 60");
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        if(hauteur > 0)
            this.hauteur = hauteur;
        else
            System.out.println("Hauteur doit être positive");
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double surface(){
        return hauteur * largeur;
    }
}

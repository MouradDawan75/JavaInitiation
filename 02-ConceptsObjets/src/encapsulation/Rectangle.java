package src.encapsulation;

public class Rectangle {

    private double hauteur;
    private double largeur;

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) throws Exception {
        if(hauteur <= 0 )
            throw new Exception("Hauteur doit être positive...");
        this.hauteur = hauteur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public Rectangle() {
    }

    public Rectangle(double hauteur, double largeur) {
       setLargeur(hauteur);
        setLargeur(largeur);
    }

    public double surface(){
        return getHauteur() * getLargeur();
    }
}

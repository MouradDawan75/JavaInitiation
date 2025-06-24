package ConceptsObjets.Heritage;

public class Chat extends Animal{

    private String couleur;

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Chat() {
    }

    public Chat(String nom, int age, String couleur) {
        //super: mot clé qui pointe vers la classe supérieure
        super(nom, age);
        this.couleur = couleur;
    }

    public void dormir(){
        System.out.println("chat dormir..................");
    }

    @Override
    public void emettreSon() {
        System.out.println("Miauller..............");
    }
}

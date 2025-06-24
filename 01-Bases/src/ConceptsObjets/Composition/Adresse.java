package ConceptsObjets.Composition;

public class Adresse {

    private int numero;
    private String street;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Adresse(int numero, String street) {
        this.numero = numero;
        this.street = street;
    }

    public Adresse() {
    }
}

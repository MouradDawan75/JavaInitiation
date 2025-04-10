package src.association;

import java.io.Serializable;

public class Adresse implements Serializable {

    private int num;
    private String street;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Adresse() {
    }

    public Adresse(int num, String street) {
        this.num = num;
        this.street = street;
    }
}

package Serialisation;

import java.util.ArrayList;
import java.util.List;

public class app {

    public static void main(String[] args) throws Exception {
        /*
        Sérialisation: mécanisme permetant l'état de l'objet dans un support physique de persistence
        2 types de sérialisations:
        binaire - xml
         */

        List<Produit> prods = new ArrayList<>();
        prods.add(new Produit(1, "PC Dell", 1599));
        prods.add(new Produit(2, "Ecran HP", 88));

        SerialService.exportBin("produits.bin", prods);

        System.out.println(">>>> Sérialisation binaire:");
        for(Produit p: SerialService.importBin("produits.bin")){
            System.out.println(p);
        }

        System.out.println(">>>>>>>>> Sérialisation xml:");
        SerialService.exportXml("produits.xml", prods);

        for(Produit pr : SerialService.importXml("produits.xml")){
            System.out.println(pr);
        }
    }


}

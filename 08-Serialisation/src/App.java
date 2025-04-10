package src;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        /*
        Sérialisation: mécanisme permettant de sauvegarder l'état d'un objet dans un support physique de persistence: fichier. bd....
        3 types de sérialisation:
        - binaire: ObjectOutputStream - ObjectInputStream
        - xml: XMLEncoder - XMLDecoder
        - json: pas de classes fournies par l'API standard -> Utilisation de librairies externes: Jackson (utilisée par Spring) - Gson
         */

        List<Product> prods = new ArrayList<>();
        prods.add(new Product(1, "PC Dell", 1500));
        prods.add(new Product(2, "Ecran HP", 79));
        prods.add(new Product(3, "Table", 50));

        System.out.println(">>>>>>>>> Sérialisation binaire:");
        SerialTool.exportBin("products.bin", prods);

        for(Product p : SerialTool.importBin("products.bin"))
            System.out.println(p);

        System.out.println(">>>>>>>>> Sérialisation xml:");

        SerialTool.exportXml("products.xml", prods);

        for(Product p : SerialTool.importXml("products.xml"))
            System.out.println(p);


        System.out.println(">>>>>>>>> Sérialisation json (Gson):");

        SerialTool.exportJson("products.json", prods);

        for(Product p : SerialTool.importJson("products.json"))
            System.out.println(p);

        System.out.println(">>>>>>>>> Sérialisation json (Jackson):");

        SerialTool.exportJacksonJson("products_jackson.json", prods);

        for(Product p : SerialTool.importJacksonJson("products_jackson.json"))
            System.out.println(p);


    }
}

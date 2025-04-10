package src;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerialTool {

    //Méthode de sérialisation binaire

    public static void exportBin(String chemin, List<Product> lst){
        try {

            FileOutputStream fos = new FileOutputStream(chemin);

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(lst);

            oos.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    //Méthode de désérialisation binaire

    public static List<Product> importBin(String chemin){
        try {
            List<Product> lst = new ArrayList<>();
            FileInputStream fis = new FileInputStream(chemin);

            ObjectInputStream ois = new ObjectInputStream(fis);

            lst = (List<Product>) ois.readObject();

            ois.close();
            return lst;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

    //Méthode de sérialisation xml

    public static void exportXml(String chemin, List<Product> lst){
        try {

            XMLEncoder xml = new XMLEncoder(new FileOutputStream(chemin));
            xml.writeObject(lst);
            xml.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //Méthode de désérialisation xml:

    public static List<Product> importXml(String chemin){
        try {
            List<Product> lst = new ArrayList<>();
            XMLDecoder xml = new XMLDecoder(new FileInputStream(chemin));
            lst = (List<Product>) xml.readObject();
            xml.close();
            return lst;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    //******************************************* Libraire Gson.jar
    /*
    Android Java utilise Gson par défaut
     */
    //Méthode de sérialisation json

    public static void exportJson(String chemin, List<Product> lst){
        try {

            Gson gson = new Gson();

            FileWriter fw = new FileWriter(chemin);

            gson.toJson(lst, fw);

            fw.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //Méthode de désérialisation json

    public static List<Product> importJson(String chemin){
        try {

            Gson gson = new Gson();
            FileReader fr = new FileReader(chemin);
            Product[] tab = gson.fromJson(fr, Product[].class);

            fr.close();
            return Arrays.asList(tab);

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    // *************************** 3 Libraires maven: jackson-core.jar - Jackson-databind.jar - Jackson-annotations.jar
    /*
    Spring utilise Jackson par défaut
     */

    public static void exportJacksonJson(String chemin, List<Product> lst){
        try {

            ObjectMapper mapper = new ObjectMapper();

            FileOutputStream fos = new FileOutputStream(chemin);
            mapper.writeValue(fos, lst);

            fos.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    //Méthode de désérialisation json

    public static List<Product> importJacksonJson(String chemin){
        try {
            ObjectMapper mapper = new ObjectMapper();
            FileInputStream fis = new FileInputStream(chemin);

            Product[] tab = mapper.readValue(fis, Product[].class);

            fis.close();
            return Arrays.asList(tab);

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    //Méthode de sérialiation csv

    public static void exportCsv(String chemin, List<Product> lst, String separateur) throws Exception {

        if (separateur.equals(".")) {
            throw new Exception("Séparateur différent du point.");
        }

        FileWriter fw = new FileWriter(chemin);
        for (Product p : lst) {
            fw.write(p.getId() + separateur + p.getNom() + separateur + p.getPrix() + "\n");
        }

            fw.close();

        }



    //Méthode de désérialisation csv

    public static List<Product> importCsv(String chemin, String separateur) throws Exception {

        if (separateur.equals(".")) {
            throw new Exception("Séparateur différent du point.");
        }
        List<Product> lst = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(chemin));
        String ligne = br.readLine();

        while (ligne != null) {

            //convertir la ligne en Product -> insérer le Product dans la liste
            String[] tab = ligne.split(separateur);
            Product p = new Product(Integer.parseInt(tab[0]), tab[1], Double.parseDouble(tab[2]));
            lst.add(p);

            ligne = br.readLine();
        }

        br.close();
        return lst;

    }
}


package Serialisation;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerialService {

    public static void exportBin(String path, List<Produit> lst) throws Exception{
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(lst);

        oos.close();

    }

    public static List<Produit> importBin(String path) throws Exception{
        List<Produit> lst = new ArrayList<>();
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);

        lst = (List<Produit>) ois.readObject();
        ois.close();
        return lst;
    }

    public static void exportXml(String path, List<Produit> lst) throws Exception{

        FileOutputStream fos = new FileOutputStream(path);
        XMLEncoder xml = new XMLEncoder(fos);
        xml.writeObject(lst);
        xml.close();

    }

    public static List<Produit> importXml(String path) throws Exception{
        List<Produit> lst = new ArrayList<>();
        FileInputStream fis = new FileInputStream(path);
        XMLDecoder xml = new XMLDecoder(fis);
        lst = (List<Produit>) xml.readObject();
        xml.close();
        return lst;
    }
}

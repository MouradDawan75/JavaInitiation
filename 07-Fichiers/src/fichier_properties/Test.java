package src.fichier_properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Test {

    public static void main(String[] args) {
        /*
        Externaliser les paramètres de configuration dans un fichier .properties
         */

        //Ecriture:

        try{

            FileOutputStream fos = new FileOutputStream("database.properties");
            Properties p = new Properties();

            p.put("server","localhost");
            p.put("user","root");
            p.put("password", "admin");

            p.store(fos, "Paramètres de connexion à la base de données"); //par défaut, store rajoute la date des es commentaires

            fos.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        //Lecture:
        try{

            FileInputStream fis = new FileInputStream("database.properties");
            Properties p = new Properties();

            p.load(fis);

            System.out.println("Server: "+p.get("server"));
            System.out.println("User: "+p.get("user"));
            System.out.println("Password: "+p.get("password"));

            fis.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

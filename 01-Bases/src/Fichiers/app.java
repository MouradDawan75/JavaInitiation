package Fichiers;

import java.io.*;
import java.util.Properties;

public class app {

    public static void main(String[] args) throws Exception {
        /*
        Stream (flux): c'est une sorte de cana intermédiaire entre une source et une destination
        Java propose 2 types de fluxs pour manipuler les fichiers:
        Flux binaire: traitement char/char -> FileInputStream - FileOutputStream
        Flux caractères: traitement ligne/ligne -> FileReader - FileWriter - BufferedReader - BufferedWriter
         */

        //Créer un fichier

        File f = new File("text.txt"); //chemin relatif
        f.createNewFile();

        File f1 = new File("c:\\dossier\\test.txt"); //chemin absolut
        f1.createNewFile();

        //Créer un répertoire
        File rep = new File("rep");
        rep.mkdir();

        FileService.scanRep("c:\\dossier");
        System.out.println(FileService.lectureFichier("c:\\dossier\\demo.txt"));
       FileService.ecritureFichier("c:\\dossier\\new.txt", "contenu du fichier............", true);

        String src= "c:\\dossier\\demo.txt";
        String destination= "c:\\dossier\\copie.txt";

        FileService.copieFichier(src,destination);

        System.out.println(">>>>>>>>>>>>>>>>>>>> Fichier.properties:");
        //les fichiers.properties sont utilisés pour externaliser les params de conf

        //Ecriture fichier.properties

        Properties p = new Properties();

        p.put("user", "admin");
        p.put("password", "@@pwd@@");

        FileOutputStream fos = new FileOutputStream("login.properties");

        p.store(fos, "Paramètre de connexion à la base de données"); // par défaut store() rajoute la date dans les commentaires

        fos.close();

        //Lecture d'un fichier.properties

        Properties prop = new Properties();

        FileInputStream fis = new FileInputStream("login.properties");

        prop.load(fis);

        System.out.println("User: "+prop.getProperty("user"));
        System.out.println("Password: "+prop.getProperty("password"));

        fis.close();
    }
}

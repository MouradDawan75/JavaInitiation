package src;

import java.io.File;

public class App {

    public static void main(String[] args) {

        /*
        Stream(flux): une sorte de canal intermédiaire entre une source et une destination
        L'API standards 2 types de flux (stream) pour manipuler les fichiers:
        flux binaire: lecture/écriture caractère par caractère: FileInputStream - FileOutputStream
        flux caractères: lecture/écriture ligne par ligne: FileReader - FileWriter
         */

        try{

            FileHelper.scanRep("c:\\dossier");
            FileHelper.lectureFichier("c:\\dossier\\notes.txt");
            FileHelper.ecritureFichier("c:\\dossier\\demo.txt", "contenu du fichier.............");

            String source = "c:\\dossier\\notes.txt";
            String destination = "c:\\dossier\\copie.txt";

            FileHelper.copierFichier(source,destination);

            //Créer un fichier

            File f = new File("test.txt"); //chemin relatif
            f.createNewFile();

            File f2 = new File("c:\\dossier\\new.txt"); //chemin absolut
            f2.createNewFile();


            //Créer un répertoire
            File f3 = new File("rep");
            f3.mkdir(); // 1 seul répertoire

            File f4 = new File("c:\\dossier\\rep1\\rep2");
            f4.mkdirs(); // répertoire + sous répertoires

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

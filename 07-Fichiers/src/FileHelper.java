package src;

import java.io.*;

public class FileHelper {

    public static void scanRep(String path) throws Exception {
        File f = new File(path);
        if(f.exists()){

            if(f.isDirectory()){

                File[] files = f.listFiles();
                for(File file : files){
                    if(file.isFile()){
                        System.out.println("Fichier: "+file.getName());
                    }else{
                        System.out.println("Répertoire: "+file.getName());
                        scanRep(file.getAbsolutePath());
                    }
                }

            }else{
                System.out.println("Fichier: "+f.getName());
            }

        }else{
            //f.mkdir(); //créer le rép
            throw new Exception("Chemin invalide.........");
        }
    }

    //Lecture d'un fichier: flux caractères
    public static void lectureFichier(String path) throws Exception{
        File f = new File(path);
        if(f.exists()){

            FileReader fr = new FileReader(f);

            BufferedReader br = new BufferedReader(fr, 16384); //taille du buffer par défaut = 4 octets
            String ligne = br.readLine();
            while(ligne != null){
                System.out.println(ligne);
                ligne = br.readLine();
            }

            //fr.close();
            br.close(); //la fermeture du buffer implique la fermuture du FileReader

        }else{
            throw new Exception("Fichier introuvable.........");
        }
    }

    //Ecriture dans un fichier: flux caractères

    public static void ecritureFichier(String path, String contenu) throws Exception{
        File f = new File(path);
        if(f.exists()){

            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw, 16384);
            bw.write(contenu);

            //fw.close();
            bw.close(); //la fermeture du buffer implique la fermuture du FileWriter

        }else{
            throw new Exception("Fichier introuvable.........");
        }
    }

    //Lecture et écriture avec des fuxs binaires
    public static void copierFichier(String sourcePath, String destinationPath) throws Exception{
        File f = new File(sourcePath);
        if(f.exists()){

            FileInputStream fis = new FileInputStream(f);

            /*
            FileOutputStream:
            si fichier existe: il sera écrasé -> sinon choisir mode append new FileOutputStream(destinationPath, true);
            si fichier inexistant: il sera crée
             */
            FileOutputStream fos = new FileOutputStream(destinationPath);

            int tmp = fis.read(); // si != -1 (caractère non null)
            while(tmp != -1){
                fos.write(tmp);
                System.out.println(tmp+"("+(char) tmp +")");
                tmp = fis.read();
            }

            fis.close();
            fos.close();

        }else{
            throw new Exception("Fichier introuvable.........");
        }
    }
}

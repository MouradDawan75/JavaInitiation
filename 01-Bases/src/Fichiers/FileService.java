package Fichiers;

import java.io.*;

public class FileService {

    public static void scanRep(String cheminRep){
        File f = new File(cheminRep);
        if(f.exists()){
            if(f.isDirectory()){

                File[] files = f.listFiles();
                for(File fl : files){
                    if(fl.isFile()){
                        System.out.println("Fichier: "+fl.getName());
                    }else{
                        System.out.println("Rép: "+fl.getName());
                        scanRep(fl.getAbsolutePath());
                    }
                }

            }else{
                System.out.println("Fichier: "+f.getName());
            }

        }else{
            f.mkdir();
        }
    }

    //Lecture ligne/ligne

    public static String lectureFichier(String path) throws Exception {
        File f = new File(path);
        if(f.exists()){

            FileReader fr = new FileReader(f);

            BufferedReader br = new BufferedReader(fr, 16384);
            String ligne = br.readLine();
            StringBuilder sb = new StringBuilder();

            while (ligne != null){
                sb.append(ligne);
                sb.append("\n");
                ligne = br.readLine();
            }

            br.close();
            return sb.toString();

        }else{
            throw new Exception("Fichier introuvable....");
        }
    }

    public static void ecritureFichier(String path, String contenu, boolean modeAjout) throws Exception{
        File f = new File(path);
        boolean mode = false;

        if(f.exists()){

            if(modeAjout){
                mode = true;
                contenu +="\n"+contenu;
            }

            FileWriter fw = new FileWriter(f, mode);

            BufferedWriter bw = new BufferedWriter(fw, 16384);
            bw.write(contenu);

            bw.close();

        }else{
            throw new Exception("Fichier introuvable....");
        }
    }

    public static void copieFichier(String src, String destination) throws Exception{
        File f = new File(src);
        if(f.exists()){

            FileInputStream fis = new FileInputStream(f); //lecture char/char
            FileOutputStream fos = new FileOutputStream(destination); //écriture char/char

            int car = fis.read();
            while( car != -1){
                fos.write(car);
                System.out.println(car+"("+ (char)car+")");
                car = fis.read();
            }

            fis.close();
            fos.close();

        }else{
            throw new Exception("Fichier introuvable....");
        }
    }
}

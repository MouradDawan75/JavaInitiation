package src.tp;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Personnel p = new Personnel(10);


        while (true) {
            System.out.println("""
                    
                    Menu:
                    1- Ajouter un employé
                    2- Afficher le salaire de chaque employé
                    3- Afficher e salaire moyen de tous les employés
                    4- Quitter                    
                    Votre choix:                    
                    """);

            int choix = sc.nextInt();


            if(choix == 4){
                System.out.println("Fin du programme...");
                break;
            }

            switch (choix){

                case 1:
                    System.out.println("Nom: ");
                    String nom = sc.next();
                    System.out.println("Prénom: ");
                    String prenom = sc.next();
                    System.out.println("Age: ");
                    int age = sc.nextInt();
                    System.out.println("Date entrée: ");
                    String dateEntree = sc.next();

                    System.out.println("""
                            Pour un vendeur: tapez v
                            Pour un Représentant: tapez r
                            Pour un Technicien: tapez t
                            Pour un Manutentionnaire: tapez m                   
                            """);

                    String typeEmploye = sc.next();
                    double ca;
                    Employe e;
                    switch (typeEmploye){
                        case "v":
                            System.out.println("Chiffre d'affaire: ");
                            ca = sc.nextDouble();
                            e = new Vendeur(nom,prenom,age,dateEntree,ca);
                            try {
                                p.ajouterEmploye(e);
                            } catch (Exception ex) {
                                System.out.println(ex.getMessage());
                            }
                            break;
                        case "r":
                            System.out.println("Chiffre d'affaire: ");
                            ca = sc.nextDouble();
                            e = new Representant(nom,prenom,age,dateEntree,ca);
                            try {
                                p.ajouterEmploye(e);
                            } catch (Exception ex) {
                                System.out.println(ex.getMessage());
                            }
                            break;
                        case "t":
                            System.out.println("Nombre d'unites:");
                            double unites = sc.nextDouble();
                            e = new Technicien(nom,prenom,age,dateEntree,unites);
                            try {
                                p.ajouterEmploye(e);
                            } catch (Exception ex) {
                                System.out.println(ex.getMessage());
                            }
                            break;
                        case "m":
                            System.out.println("Nombre d'heures:");
                            double heures = sc.nextDouble();
                            e = new Manutentionnaire(nom,prenom,age,dateEntree,heures);
                            try {
                                p.ajouterEmploye(e);
                            } catch (Exception ex) {
                                System.out.println(ex.getMessage());
                            }
                            break;

                    }


                    break;

                case 2:
                    p.afficherSalaire();
                    break;

                case 3:
                    System.out.println("Le salaire moyen des employés est de: "+p.salaireMoyen());
                    break;

                default:
                    System.out.println("Choix invalide");
                    break;


            }

        }
    }
}

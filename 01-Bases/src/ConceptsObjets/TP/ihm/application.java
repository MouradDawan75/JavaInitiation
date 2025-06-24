package ConceptsObjets.TP.ihm;

import ConceptsObjets.TP.entities.*;
import ConceptsObjets.TP.services.Personnel;

import java.util.Scanner;

public class application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Personnel personnel = new Personnel(100);

        while(true) {
            System.out.println("""
                    Menu:
                    1- Ajouter un employé
                    2- Afficher le salaire de chaque employé
                    3- Afficher le salaire moyen de tous les employés
                    4- Quitter
                    Votre choix:                    
                    """);
            int choix = sc.nextInt();
            sc.nextLine();

            if (choix == 4){
                System.out.println("Fin du programme....");
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

                    System.out.println("Date d'entrée: ");
                    String dateEntree = sc.next();

                    System.out.println("""
                            Pour un vendeur: tapez v
                            Pour un représentant: tapez r
                            Pour un technicien: tapez t
                            Pour un manutentionnaire: tapez m
                            """);

                    String typeEmploye = sc.next();
                    double ca;
                    Employe e = null;

                    switch (typeEmploye){
                        case "v":
                            System.out.println("Chiffre d'affaire: ");
                            ca = sc.nextDouble();
                            e = new Vendeur(nom,prenom,age,dateEntree,ca);
                            break;

                        case "r":
                            System.out.println("Chiffre d'affaire: ");
                            ca = sc.nextDouble();
                            e = new Representant(nom,prenom,age,dateEntree,ca);
                            break;

                        case "t":
                            System.out.println("Nombre d'unités: ");
                            int unites = sc.nextInt();
                            e = new Technicien(nom,prenom,age,dateEntree,unites);
                            break;

                        case "m":
                            System.out.println("Nombre d'heures: ");
                            double heures = sc.nextDouble();
                            e = new Manutentionnaire(nom,prenom,age,dateEntree,heures);
                            break;
                    }

                    personnel.ajouterEmployer(e);
                    System.out.println("Employé inséré..........");


                    break;

                case 2:
                    personnel.calculerSalaire();
                    break;

                case 3:
                    System.out.println("Salaire moyen des employés: "+personnel.salaireMoyen()+" euros.");
                    break;

                default:
                    System.out.println("Choix invalide....");
                    break;
            }
        }
    }
}

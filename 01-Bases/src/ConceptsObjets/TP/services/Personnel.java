package ConceptsObjets.TP.services;

import ConceptsObjets.TP.entities.Employe;

public class Personnel implements IPersonnel {

    private Employe[] staff;
    private int maxEmploye;
    private int nbEmploye = 0;

    public Personnel(int maxEmploye){
        this.maxEmploye = maxEmploye;
        this.staff = new Employe[maxEmploye];

    }

    @Override
    public void ajouterEmployer(Employe e){
        ++nbEmploye;
        if(nbEmploye <= maxEmploye){
            staff[nbEmploye - 1] = e;
        }else{
            System.out.println("Pas plus de "+maxEmploye+" employés.");
        }

    }

    @Override
    public void calculerSalaire(){
        for (int i = 0; i < nbEmploye; i++) {
            System.out.println(staff[i].getNom()+" gagne "+staff[i].calculerSalaire()+" euros.");
        }

    }

    @Override
    public double salaireMoyen(){
        double somme = 0;
        for (int i = 0; i < nbEmploye; i++) {
            somme += staff[i].calculerSalaire();
        }

        return somme /nbEmploye;
    }
}

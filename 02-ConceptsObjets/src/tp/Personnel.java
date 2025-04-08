package src.tp;

public class Personnel implements IPersonnel {

    private Employe[] staff;
    private int MAX_EMPLOYE;
    private int nbEmploye;

    public Personnel(int maxEmploye){
        staff = new Employe[maxEmploye];
        MAX_EMPLOYE = maxEmploye;
        nbEmploye = 0;
    }

    @Override
    public void ajouterEmploye(Employe e) throws Exception {
        ++nbEmploye;
        if(nbEmploye < MAX_EMPLOYE ){
            staff[nbEmploye - 1] = e;
        }else{
            throw new Exception("Pas plus de "+MAX_EMPLOYE+" d'employés.");
        }
    }

    @Override
    public void afficherSalaire(){
        for (int i = 0; i < nbEmploye; i++) {
            System.out.println(staff[i].getNom()+" gagne "+staff[i].calculerSalaire()+" euros.");
        }
    }

    @Override
    public double salaireMoyen(){
        double s = 0;
        for (int i = 0; i < nbEmploye; i++) {
            s += staff[i].calculerSalaire();
        }

        return s / nbEmploye;
    }
}

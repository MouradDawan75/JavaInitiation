package src.tp;

public interface IPersonnel {
    void ajouterEmploye(Employe e) throws Exception;

    void afficherSalaire();

    double salaireMoyen();
}

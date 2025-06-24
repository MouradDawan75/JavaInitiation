package ConceptsObjets.TP.services;

import ConceptsObjets.TP.entities.Employe;

public interface IPersonnel {
    void ajouterEmployer(Employe e);

    void calculerSalaire();

    double salaireMoyen();
}

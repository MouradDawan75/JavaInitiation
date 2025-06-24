package ConceptsObjets.Composition;

public interface IClient {
    /*
    Interface: est une pseudo classe abstraite qui ne contient que des méthodes abstraites.
    Si une interface devait contenir des attributs, c'est forcément des constantes
     */
    void insert(Client c);
    void delete(Client c);
    void update(Client c);

    // constantes
    int PRIX = 100;
}

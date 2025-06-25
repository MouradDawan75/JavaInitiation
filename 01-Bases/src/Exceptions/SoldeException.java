package Exceptions;
/*
Pour créer ses propres exceptions:
1- Hériter de la classe Exception
2- Appeler le constructeur de classe et lui fournir un message en param
 */

public class SoldeException extends Exception{

    public SoldeException(String message){
        super(message);
    }
}

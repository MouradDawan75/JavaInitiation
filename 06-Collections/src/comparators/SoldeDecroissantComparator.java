package src.comparators;

import src.CompteBancaire;

import java.util.Comparator;

public class SoldeDecroissantComparator implements Comparator<CompteBancaire> {
    @Override
    public int compare(CompteBancaire cpt1, CompteBancaire cpt2) {
        if(cpt1.getSolde() > cpt2.getSolde())
            return -1;
        else if(cpt1.getSolde() < cpt2.getSolde())
            return 1;
        else
            return 0;
    }
}

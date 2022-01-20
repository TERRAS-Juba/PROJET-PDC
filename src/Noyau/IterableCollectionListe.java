package Noyau;

import java.util.ArrayList;

public class IterableCollectionListe implements IterableCollection{
    private ArrayList<Bien> liste;

    public IterableCollectionListe(ArrayList<Bien> liste) {
        this.liste = liste;
    }

    @Override
    public IteratorBien createIterator() {
        return new IteratorListe(this.liste);
    }
}

package Noyau;

import java.util.ArrayList;

public class IteratorListe implements IteratorBien{
    private ArrayList<Bien> liste;
    private int iterationState;

    public IteratorListe(ArrayList<Bien> liste) {
        this.liste = liste;
        this.iterationState=0;
    }

    @Override
    public Bien getNext() {
        if(this.hasNext()){
            Bien bien=this.liste.get(iterationState);
            this.iterationState++;
            return bien;
        }else{
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        if(this.iterationState<this.liste.size()){
            return true;
        }else{
            return false;
        }
    }
    public void reset(){
        this.iterationState=0;
    }
}

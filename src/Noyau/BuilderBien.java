package Noyau;

import java.util.Date;

public abstract class BuilderBien {
    public abstract  void ajouterProprietaire(Proprietaire p);
    public abstract void ajouterWilayaLocalisation(Wilaya w);
    public abstract void ajouterWilayaEchange(Wilaya w);
    public abstract void ajouterImages(String images[]);
    public abstract void ajouterDate(Date date);
    public abstract void ajouterTransaction(Transaction transaction);
    public  abstract void ajouterPrix(double prix,boolean negociable);
}

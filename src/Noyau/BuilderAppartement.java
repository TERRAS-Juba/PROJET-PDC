package Noyau;

import java.util.Date;

public class BuilderAppartement extends  BuilderBien{
    private Appartement result;
    @Override
    public void ajouterProprietaire(Proprietaire p) {
        this.result.setProprietaire(p);
    }

    @Override
    public void ajouterWilayaLocalisation(Wilaya w) {
        this.result.setWilayaLocalisation(w);
    }

    @Override
    public void ajouterWilayaEchange(Wilaya w) {
    this.result.setWilayaEchange(w);
    }

    @Override
    public void ajouterImages(String[] images) {
        this.result.setImages(images);
    }

    @Override
    public void ajouterDate(Date date) {
        this.result.setDateAjout(date);
    }

    @Override
    public void ajouterTransaction(Transaction transaction) {
            this.result.setTransaction(transaction);
    }

    @Override
    public void ajouterPrix(double prix, boolean negociable) {
    this.result.setPrix(prix);
    this.result.setPrixNegociable(negociable);
    }
    public Bien getResult(){
        return this.result;
    }
}

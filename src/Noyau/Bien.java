package Noyau;

import java.io.Serializable;
import java.util.Date;

public abstract class Bien implements Comparable, Serializable {
    private String adresse;
    private Proprietaire  proprietaire;
    private Wilaya wilayaEchange;
    private Wilaya wilayaLocalisation;
    private Date dateAjout;
    private double superficie;
    private double prix;
    private boolean prixNegociable;
    private String descriptif;
    private String []Images;
    private Transaction transaction;
    public abstract double calculPrixVente();
    public abstract double calculPrixEchange();
    public abstract double calculPrixLocation();

    public Bien(String adresse, Proprietaire proprietaire, Wilaya wilayaEchange, Wilaya wilayaLocalisation, Date dateAjout, double superficie, double prix, boolean prixNegociable, String descriptif, String[] images, Transaction transaction) {
        this.adresse = adresse;
        this.proprietaire = proprietaire;
        this.wilayaEchange = wilayaEchange;
        this.wilayaLocalisation = wilayaLocalisation;
        this.dateAjout = dateAjout;
        this.superficie = superficie;
        this.prix = prix;
        this.prixNegociable = prixNegociable;
        this.descriptif = descriptif;
        Images = images;
        this.transaction = transaction;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public Wilaya getWilayaEchange() {
        return wilayaEchange;
    }

    public Wilaya getWilayaLocalisation() {
        return wilayaLocalisation;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public double getSuperficie() {
        return superficie;
    }

    public double getPrix() {
        return prix;
    }

    public boolean getPrixNegociable() {
        return prixNegociable;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public String[] getImages() {
        return Images;
    }

    public Transaction getTransaction() {
        return transaction;
    }
    public String getAdresse(){
        return adresse;
    }
    public double getPrixMetreCarre(){
        return getWilayaLocalisation().getPrixMetreCarre();
    }
    public int getNumWilayaLocalisation(){
        return getWilayaLocalisation().getNumWilaya();
    }
    public int getNumWilayaEchange(){
        return getWilayaEchange().getNumWilaya();
    }
    public String getProprietaireEmail(){
        return getProprietaire().getEmail();
    }
    @Override
    public int compareTo(Object o) {
        Bien bien = (Bien) o;
        return this.adresse.compareTo((bien).getAdresse());
    }

    @Override
    public boolean equals(Object obj) {
        Bien bien=(Bien)obj;
        return this.adresse.equals(bien.getAdresse());
    }

    @Override
    public int hashCode() {
        return adresse.hashCode();
    }
}

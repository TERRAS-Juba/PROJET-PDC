package Noyau;

import java.io.Serializable;
import java.util.Date;

public class Maison extends Habitable {
    private int nombreEtages;
    private boolean hasGarage;
    private boolean hasPiscine;
    private boolean hasJardin;
    private double superficieHabitable;

    public Maison(String adresse, Proprietaire proprietaire, Wilaya wilayaEchange, Wilaya wilayaLocalisation, Date dateAjout, double superficie, double prix, boolean prixNegociable, String descriptif, String[] images, Transaction transaction, int nombrePieces, boolean meuble, int nombreEtages, boolean hasGarage, boolean hasPiscine, boolean hasJardin, double superficieHabitable) {
        super(adresse, proprietaire, wilayaEchange, wilayaLocalisation, dateAjout, superficie, prix, prixNegociable, descriptif, images, transaction, nombrePieces, meuble);
        this.nombreEtages = nombreEtages;
        this.hasGarage = hasGarage;
        this.hasPiscine = hasPiscine;
        this.hasJardin = hasJardin;
        this.superficieHabitable = superficieHabitable;
    }

    @Override
    public double calculPrixVente() {
        double nvprix;
        if (super.getPrix() < 5000000) {
            if (super.getPrixMetreCarre() < 50000) {
                nvprix = (super.getPrix() * 3) / 100 + super.getPrix();
            } else {
                nvprix = (super.getPrix() * 3.5) / 100 + super.getPrix();
            }
        } else {
            if (super.getPrix() > 5000000 && super.getPrix() < 15000000) {
                if (super.getPrixMetreCarre() < 50000) {
                    nvprix = (super.getPrix() * 2) / 100 + super.getPrix();
                } else {
                    nvprix = (super.getPrix() * 2.5) / 100 + super.getPrix();

                }
            } else {
                if (super.getPrixMetreCarre() < 70000) {
                    nvprix = (super.getPrix() * 1) / 100 + super.getPrix();
                } else {
                    nvprix = (super.getPrix() * 2) / 100 + super.getPrix();

                }


            }
        }
        if ((hasJardin) || (hasPiscine) || (hasGarage)) {
            nvprix = (super.getPrix() * 0.5) / 100 + nvprix;
        }
        return nvprix;
    }

    @Override
    public double calculPrixEchange() {
        double prix_echange;
        prix_echange = calculPrixVente();
        if (super.getNumWilayaEchange() != super.getNumWilayaLocalisation()) {
            prix_echange = prix_echange + (super.getPrix() * 0.25) / 100;
        }
        return prix_echange;
    }

    @Override
    public double calculPrixLocation() {
        double nvprix;
        if (getSuperficie() < 60) {
            if (super.getPrixMetreCarre() < 50000) {
                nvprix = (super.getPrix() * 1) / 100 + super.getPrix();
            } else {
                nvprix = (super.getPrix() * 1.5) / 100 + super.getPrix();
            }
        } else {
            if (getSuperficie() > 60 && getSuperficie() < 150) {
                if (super.getPrixMetreCarre() < 50000) {
                    nvprix = (super.getPrix() * 2) / 100 + super.getPrix();
                } else {
                    nvprix = (super.getPrix() * 2.5) / 100 + super.getPrix();

                }
            } else {
                if (super.getPrixMetreCarre() < 70000) {
                    nvprix = (super.getPrix() * 3) / 100 + super.getPrix();
                } else {
                    nvprix = (super.getPrix() * 3.5) / 100 + super.getPrix();

                }


            }
        }
        if ((hasPiscine)) {
            nvprix = 50000 + nvprix;
        }
        return nvprix;
    }

}

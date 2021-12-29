package Noyau;

import java.util.Date;

public class Terrain extends NonHabitable {
    private int nombreFacades;
    private String statutJuridique;

    public Terrain(String adresse, Proprietaire proprietaire, Wilaya wilayaEchange, Wilaya wilayaLocalisation, Date dateAjout, double superficie, double prix, boolean prixNegociable, String descriptif, String[] images, Transaction transaction, int nombreFacades, String statutJuridique) {
        super(adresse, proprietaire, wilayaEchange, wilayaLocalisation, dateAjout, superficie, prix, prixNegociable, descriptif, images, transaction);
        this.nombreFacades = nombreFacades;
        this.statutJuridique = statutJuridique;
    }

    @Override
    public double calculPrixVente() {
        double nvprix = 0;
        ;
        if (super.getPrix() < 5000000) {
            if (super.getPrixMetreCarre() < 50000) {
                nvprix = (super.getPrix() * 3) / 100 + super.getPrix();
            } else {
                nvprix = (super.getPrix() * 35) / 100 + super.getPrix();
            }
        } else {
            if (super.getPrix() > 5000000 && super.getPrix() < 15000000) {
                if (super.getPrixMetreCarre() < 50000) {
                    nvprix = (super.getPrix() * 2) / 100 + super.getPrix();
                } else {
                    nvprix = (super.getPrix() * 2.5 / 100 + super.getPrix());

                }
            } else {
                if (super.getPrixMetreCarre() < 70000) {
                    nvprix = (super.getPrix() * 1) / 100 + super.getPrix();
                } else {
                    nvprix = (super.getPrix() * 2) / 100 + super.getPrix();

                }


            }
        }
        if (nombreFacades > 1) {
            nvprix = ((super.getPrix() * 0.5) / 100) * nombreFacades + nvprix;
        }
        return nvprix;

    }

    @Override
    public double calculPrixEchange() {
        double prix_echange;
        prix_echange = calculPrixVente();

        if (getNumWilayaEchange() != getNumWilayaLocalisation()) {
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
        return nvprix;
    }
}



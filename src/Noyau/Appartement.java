package Noyau;

import java.util.Date;

public class Appartement extends Habitable {
    private int numeroEtage;
    private boolean hasAscenseur;
    private boolean simplex;

    public Appartement(String adresse, Proprietaire proprietaire, Wilaya wilayaEchange, Wilaya wilayaLocalisation, Date dateAjout, double superficie, double prix, boolean prixNegociable, String descriptif, String[] images, Transaction transaction, int nombrePieces, boolean meuble, int numeroEtage, boolean hasAscenseur, boolean simplex) {
        super(adresse, proprietaire, wilayaEchange, wilayaLocalisation, dateAjout, superficie, prix, prixNegociable, descriptif, images, transaction, nombrePieces, meuble);
        this.numeroEtage = numeroEtage;
        this.hasAscenseur = hasAscenseur;
        this.simplex = simplex;
    }

    @Override
    public double calculPrixVente() {
        double nvprix;
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
        if (numeroEtage <= 2) {
            nvprix = 50000 + nvprix;
        }
        return nvprix;
    }

    @Override
    public double calculPrixEchange() {
        double prix_echange;

        prix_echange = calculPrixVente();
        if (getNumWilayaEchange() != getNumWilayaLocalisation()) {
            prix_echange = prix_echange + ((getPrix() * 0.25) / 100);
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
        if (numeroEtage <= 2) {
            nvprix = 5000 + nvprix;

        } else {
            if ((numeroEtage >= 6) && (hasAscenseur)) {
                nvprix = nvprix - (500 * getSuperficie());
            }
        }

        return nvprix;
    }
}

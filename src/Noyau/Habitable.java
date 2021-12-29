package Noyau;

import java.io.Serializable;
import java.util.Date;

public abstract class Habitable extends Bien {
    private int nombrePieces;
    private boolean meuble;

    public Habitable(String adresse, Proprietaire proprietaire, Wilaya wilayaEchange, Wilaya wilayaLocalisation, Date dateAjout, double superficie, double prix, boolean prixNegociable, String descriptif, String[] images, Transaction transaction, int nombrePieces, boolean meuble) {
        super(adresse, proprietaire, wilayaEchange, wilayaLocalisation, dateAjout, superficie, prix, prixNegociable, descriptif, images, transaction);
        this.nombrePieces = nombrePieces;
        this.meuble = meuble;
    }
}

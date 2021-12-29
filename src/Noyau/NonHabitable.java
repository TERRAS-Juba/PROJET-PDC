package Noyau;

import java.io.Serializable;
import java.util.Date;

public abstract class NonHabitable extends Bien{
    public NonHabitable(String adresse, Proprietaire proprietaire, Wilaya wilayaEchange, Wilaya wilayaLocalisation, Date dateAjout, double superficie, double prix, boolean prixNegociable, String descriptif, String[] images, Transaction transaction) {
        super(adresse, proprietaire, wilayaEchange, wilayaLocalisation, dateAjout, superficie, prix, prixNegociable, descriptif, images, transaction);
    }
}

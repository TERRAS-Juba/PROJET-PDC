package Noyau;

import java.io.Serializable;

public class Wilaya implements Serializable {
    private int numWilaya;
    private String nomWilaya;
    private double prixMetreCarre;
    public Wilaya(int numWilaya, String nomWilaya, double prixMetreCarre) {
        this.numWilaya = numWilaya;
        this.nomWilaya = nomWilaya;
        this.prixMetreCarre = prixMetreCarre;
    }
    public int getNumWilaya() {
        return numWilaya;
    }

    public double getPrixMetreCarre() {
        return prixMetreCarre;
    }
}

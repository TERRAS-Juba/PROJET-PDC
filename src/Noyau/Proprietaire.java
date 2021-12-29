package Noyau;

import java.io.Serializable;

public class Proprietaire implements Serializable {
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String adresse;

    public Proprietaire(String nom, String prenom, String email, String telephone, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }
}

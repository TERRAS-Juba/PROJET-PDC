package Noyau;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
    private String objet;
    private String description;
    private String nomEmetteur;
    private String prenomEmetteur;
    private Date date;
    private Bien bien;

    public Message(String objet, String description, String nomEmetteur, String prenomEmetteur, Date date, Bien bien) {
        this.objet = objet;
        this.description = description;
        this.nomEmetteur = nomEmetteur;
        this.prenomEmetteur = prenomEmetteur;
        this.date = date;
        this.bien = bien;
    }

    public String getObjet() {
        return objet;
    }

    public String getDescription() {
        return description;
    }

    public String getNomEmetteur() {
        return nomEmetteur;
    }

    public String getPrenomEmetteur() {
        return prenomEmetteur;
    }

    public Date getDate() {
        return date;
    }

    public Bien getBien() {
        return bien;
    }
}

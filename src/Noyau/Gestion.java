package Noyau;

public class Gestion {
    private GestionnaireBien gestionnaireBien;
    private GestionnaireBoite gestionnaireBoite;
    private GestionnaireArchive gestionnaireArchive;

    public Gestion() {
        this.gestionnaireBien = new GestionnaireBien();
        this.gestionnaireBoite = new GestionnaireBoite();
        this.gestionnaireArchive = new GestionnaireArchive();

    }
    public Gestion(String fileName){
        //Traitement;
    }

    public GestionnaireBien getGestionnaireBien() {
        return gestionnaireBien;
    }

    public GestionnaireBoite getGestionnaireBoite() {
        return gestionnaireBoite;
    }

    public GestionnaireArchive getGestionnaireArchive() {
        return gestionnaireArchive;
    }

}

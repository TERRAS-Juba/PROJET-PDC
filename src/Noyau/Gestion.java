package Noyau;

public class Gestion {

    private static Gestion instance;
    private GestionnaireBien gestionnaireBien;
    private GestionnaireBoite gestionnaireBoite;
    private GestionnaireArchive gestionnaireArchive;

    private Gestion() {
        this.gestionnaireBien = new GestionnaireBien();
        this.gestionnaireBoite = new GestionnaireBoite();
        this.gestionnaireArchive = new GestionnaireArchive();

    }
    private synchronized static void effectuerSync() {
        if (instance==null) instance= new Gestion ();
    }
    public static Gestion getInstance() {
        if (instance==null) effectuerSync();
        return instance;
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

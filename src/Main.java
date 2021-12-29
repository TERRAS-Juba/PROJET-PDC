import Noyau.*;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Creation de propretaires
        Proprietaire proprietaire1=new Proprietaire("AMOKRANE","Ilhem","ii_amokrane@esi.dz","0548963214","Bejaia");
        Proprietaire proprietaire2=new Proprietaire("TERRAS","Juba","ij_terras@esi.dz","0541251311","Tizi-Ouzou");
        //Création de wilayas
        Wilaya wilayaLocalisation = new Wilaya(06,"Béjaia",25000);
        Wilaya wilayaEchange = new Wilaya(15,"Tizi-Ouzou",20000);
        //Création d'images
        String images[]={"1","2","3"};
        //Création de date
        Date date=new java.util.Date();
        //Création des biens
        Maison maison=new Maison("Rue des freres kadri, Bejaia",proprietaire1,wilayaEchange,wilayaLocalisation,date,400,1500000,true,"Maison chique",images, Transaction.vente,5,true,2,true,false,true,100);
        Appartement appartement=new Appartement("Rue de la toure, Tizi-Ouzou",proprietaire2,wilayaEchange,wilayaLocalisation,date,250,2500000,false,"Appartement chique",images, Transaction.location,5,true,5,true,false);
        Terrain terrain=new Terrain("Azeffoun, Tizi-Ouzou",proprietaire2,wilayaEchange,wilayaLocalisation,date,400,1500000,true,"Terrain au bord de la mer",images,Transaction.vente,4,"En regle");
        //Creation d'un objet de type gestion
        Gestion gestion=new Gestion();
        //Ajout des biens
        gestion.getGestionnaireBien().ajouterBien(maison);
        gestion.getGestionnaireBien().ajouterBien(terrain);
        gestion.getGestionnaireBien().ajouterBien(appartement);
        gestion.getGestionnaireBien().supprimerBien("Rue des freres kadri, Bejaia");
        gestion.getGestionnaireBien().afficherCataloguesBiens();
        //Recherche des biens d'un proprietaire
        ArrayList<Bien>biensProprietaire2=gestion.getGestionnaireBien().rechercherBiensProprietaire("ij_terras@esi.dz");
        for (int i = 0; i < biensProprietaire2.size(); i++) {
            System.out.println(biensProprietaire2.get(i).getAdresse());
        }

    }
}

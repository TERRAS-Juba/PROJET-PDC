import Noyau.*;
import org.ietf.jgss.GSSContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Creation de deux objets de type Gestion
        //Patron Singleton
        Gestion gestion1 = Gestion.getInstance();
        Gestion gestion2 = Gestion.getInstance();
        System.out.println("------------------ Implémentation du Patron Singleton ------------------------");
        System.out.println("gestion1:"+gestion1);
        System.out.println("gestion2:"+gestion2);
        //Creation des propretaires
        Proprietaire proprietaire1 = new Proprietaire("AMOKRANE", "Ilhem", "ii_amokrane@esi.dz", "0548963214", "Bejaia");
        Proprietaire proprietaire2 = new Proprietaire("TERRAS", "Juba", "ij_terras@esi.dz", "0541251311", "Tizi-Ouzou");
        Proprietaire proprietaire3 = new Proprietaire("NAIB", "Safia", "naib_safia@esi.dz", "0541231351", "Alger");
        //Création des wilayas
        Wilaya wilayaLocalisation1 = new Wilaya(06, "Béjaia", 25000);
        Wilaya wilayaLocalisation2 = new Wilaya(10, "Bouira", 20000);
        Wilaya wilayaEchange2 = new Wilaya(16, "Alger", 40000);
        Wilaya wilayaEchange1 = new Wilaya(15, "Tizi-Ouzou", 20000);
        //Création d'images
        String images[] = {"1", "2", "3"};
        //Création d'une date
        Date date = new java.util.Date();
        //Création des biens
        Maison maison1 = new Maison("Rue des freres kadri, Bejaia", proprietaire1, wilayaEchange1, wilayaLocalisation1, date, 400,
                2500000, true, "Maison chic", images, Transaction.vente, 5,
                true, 2, true, false, true, 100);
        Maison maison2 = new Maison("El Akhdaria,Bouira", proprietaire2, wilayaEchange2, wilayaLocalisation2, date, 400,
                1500000, true, "Maison avec vu littoral", images, Transaction.vente, 5,
                true, 2, true, false, true, 100);
        Appartement appartement1 = new Appartement("Aokas,Bejaia", proprietaire2, wilayaEchange1, wilayaLocalisation1, date, 500, 400000, true, "Appartement chic ", images, Transaction.vente, 5, true, 4, true, true);
        Appartement appartement2 = new Appartement("El Adjiba,Bouira", proprietaire3, wilayaEchange2, wilayaLocalisation2, date, 500, 400000, true, "Appartement au centre ville", images, Transaction.vente, 5, true, 4, true, true);
        Terrain terrain1 = new Terrain("Souk el tenine,Bejaia", proprietaire3, wilayaEchange1, wilayaLocalisation1, date, 300, 200000, true, "Terrain agricole", images, Transaction.vente, 4, "En regle");
        Terrain terrain2 = new Terrain("Ath Laaziz,Bouira", proprietaire1, wilayaEchange2, wilayaLocalisation2, date, 500, 250000, true, "Terrain agricole", images, Transaction.vente, 4, "En regle");
        //Ajout des biens
        gestion1.getGestionnaireBien().ajouterBien(maison1);
        gestion1.getGestionnaireBien().ajouterBien(maison2);
        gestion1.getGestionnaireBien().ajouterBien(appartement1);
        gestion1.getGestionnaireBien().ajouterBien(terrain1);
        gestion1.getGestionnaireBien().ajouterBien(terrain2);
        gestion1.getGestionnaireArchive().ajouterArchive(appartement2);
        //Ajout des messages a la boite
        Message message1=new Message("Reclamation","","Amokrane","Ilhem",date,maison1);
        Message message2=new Message("Renseigement","","Terras","Juba",date,appartement1);
        gestion1.getGestionnaireBoite().ajouterMessage(message1);
        gestion1.getGestionnaireBoite().ajouterMessage(message2);
        //Patron Iterator
        System.out.println("------------------ Implémentation du Patron Iterator ------------------------");
        IterableCollection catalogue= new IterableCollectionMap(gestion1.getGestionnaireBien().getBiens());
       IteratorBien catalogueIterator= catalogue.createIterator();
       System.out.println("----------------- Catalogue des Biens ------------------");
       while (catalogueIterator.hasNext()){
           Bien bien=catalogueIterator.getNext();
           System.out.println(bien.getAdresse());
       }
        IterableCollection archives= new IterableCollectionMap(gestion1.getGestionnaireArchive().getArchives());
        IteratorBien archiveIterator= archives.createIterator();
        System.out.println(" ----------------- Archives des Biens ------------------ ");
        while (archiveIterator.hasNext()){
            Bien bien=archiveIterator.getNext();
            System.out.println(bien.getAdresse());
        }
        //Patron Proxy
        System.out.println("------------------ Implémentation du Patron Proxy ------------------------");
        ArrayList<Bien> bienProprietaire= new ArrayList<Bien>();
        CachedGestionnaireBien proxy=new CachedGestionnaireBien(gestion1.getGestionnaireBien());
        double debut=System.nanoTime();
        bienProprietaire= proxy.rechercherBiensProprietaire(proprietaire1.getEmail());
        double fin=System.nanoTime();
        System.out.println("Le Temps d'execution Sans Proxy :"+(fin-debut));
        debut=System.nanoTime();
        bienProprietaire= proxy.rechercherBiensProprietaire(proprietaire1.getEmail());
        fin=System.nanoTime();
        System.out.println("Le Temps d'execution avec Proxy :"+(fin-debut));


    }
}

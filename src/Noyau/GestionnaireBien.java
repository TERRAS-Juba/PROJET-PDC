package Noyau;

import java.util.*;


public class GestionnaireBien {
    private Map biens;

    public GestionnaireBien() {
        this.biens = new HashMap<String,Bien>();
    }

    public void ajouterBien(Bien bien){
        this.biens.put(bien.getAdresse(),bien);
    }

    public void supprimerBien(String key){
     this.biens.remove(key);
    }

    public Bien rechercherBien(String key){
        return (Bien)this.biens.get(key);
    }

    public ArrayList<Bien> rechercherBiensProprietaire(String email){

        List biensProprietaire=new ArrayList<Bien>();

        Iterator iterator=this.biens.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry mapentry=(Map.Entry)iterator.next();
            Bien bien= (Bien) mapentry.getValue();
            if(bien.getProprietaireEmail()==email){
                biensProprietaire.add(bien);
            }
        }
        return (ArrayList<Bien>) biensProprietaire;
    }
    public void afficherCataloguesBiens(){
        Iterator iterator=this.biens.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry mapentry=(Map.Entry)iterator.next();
            Bien bien= (Bien) mapentry.getValue();
                System.out.println(bien.getAdresse());
        }
    }

    public Map getBiens() {
        return biens;
    }
}

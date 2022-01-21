package Noyau;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CachedGestionnaireBien extends GestionnaireBienAbstrait{
private  GestionnaireBien gestionnaireBien;
private Map<String, ArrayList<Bien>> result;

    public CachedGestionnaireBien(GestionnaireBien gestionnaireBien) {
        this.gestionnaireBien = gestionnaireBien;
        this.result=new  HashMap<String, ArrayList<Bien>>();
    }

    @Override
    public void ajouterBien(Bien bien) {

    }

    @Override
    public void supprimerBien(String key) {

    }


    @Override
    public Bien rechercherBien(String key) {
        return null;
    }

    @Override
    public ArrayList<Bien> rechercherBiensProprietaire(String email) {
        if(this.result.get(email)!=null){
            return this.result.get(email);
        }else{
            this.result.put(email,this.gestionnaireBien.rechercherBiensProprietaire(email));
            return this.gestionnaireBien.rechercherBiensProprietaire(email);
        }

    }

    @Override
    public void afficherCataloguesBiens() {

    }
}

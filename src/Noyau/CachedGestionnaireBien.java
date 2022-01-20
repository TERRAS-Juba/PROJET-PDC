package Noyau;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CachedGestionnaireBien extends GestionnaireBienAbstrait{
private  GestionnaireBien gestionnaireBien;
private Map<String, Map<String,Bien>> result;

    public CachedGestionnaireBien(GestionnaireBien gestionnaireBien) {
        this.gestionnaireBien = gestionnaireBien;
        this.result=new HashMap<String, Map<String,Bien>>();
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
            return (ArrayList<Bien>) this.result.get(email).values();
        }else{
            return this.gestionnaireBien.rechercherBiensProprietaire(email);
        }

    }

    @Override
    public void afficherCataloguesBiens() {

    }
}

package Noyau;

import java.util.HashMap;
import java.util.Map;

public class GestionnaireArchive {
    private Map archives;

    public GestionnaireArchive() {
        this.archives = new HashMap<String,Bien>();
    }
    public void ajouterArchive(Bien bien){
        this.archives.put(bien.getAdresse(),bien);
    }
    public void supprimerArchive(String key){
        this.archives.remove(key);
    }
}

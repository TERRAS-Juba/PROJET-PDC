package Noyau;

import java.util.ArrayList;

public abstract class GestionnaireBienAbstrait {
    public abstract void ajouterBien(Bien bien);
    public abstract  void supprimerBien(String key);
    public abstract  Bien rechercherBien(String key);
    public abstract ArrayList<Bien> rechercherBiensProprietaire(String email);
    public abstract void afficherCataloguesBiens();
}

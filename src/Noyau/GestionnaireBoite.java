package Noyau;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireBoite {
    private List messages;

    public GestionnaireBoite() {
        this.messages = new ArrayList<Message>();
    }
    public void ajouterMessage(Message message){

        this.messages.add(message);
    }
}

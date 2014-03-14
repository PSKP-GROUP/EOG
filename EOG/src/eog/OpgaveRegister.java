/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eog;

import db.OpgaveDAO;
import java.util.ArrayList;

/**
 *
 * @author Patrick
 */
public class OpgaveRegister {

    private ArrayList<Opgave> opgaver;

    public OpgaveRegister() {
        opgaver = new ArrayList<>();

    }
    
    public Opgave createOpgave(String titel, String beskrivelse, String datoForOprettelse, String tidsfrist){
        Opgave opgave = new Opgave(titel, beskrivelse, datoForOprettelse, tidsfrist);
        insert(opgave);
        return opgave;
    }
    
    public Opgave insert(Opgave opgave){
        int iD = OpgaveDAO.insert(opgave);
        opgave.setiD(iD);
        opgaver.add(opgave);
        return opgave;
    }
}

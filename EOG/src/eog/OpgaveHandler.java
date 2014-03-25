/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eog;

import java.util.ArrayList;

/**
 *
 * @author Patrick
 */
public class OpgaveHandler {
    
    private OpgaveRegister opgaveRegister;
    
    public OpgaveHandler(OpgaveRegister opgaveRegister) {
        this.opgaveRegister = opgaveRegister;
    }
    
    public void createOpgave(String title, String description, String dateForTask, String deadlineTime, String afbudsdato) {
        opgaveRegister.createOpgave(title, description, dateForTask, deadlineTime, afbudsdato);
    }
    
    public Opgave getOpgave(int id) {
        return opgaveRegister.getOpgave(id);
    }
    
    public void setBeboer(int id, int idBeboer) {
        opgaveRegister.setBeboer(id, idBeboer);
    }
    
    public void updateOpgave(int id, String description, String dateForTask, String deadlineTime, String afbudsdato, int idBeboer){
        opgaveRegister.updateOpgave(id, description, dateForTask, deadlineTime, afbudsdato, idBeboer);
    }
    
    public ArrayList<Opgave> getAvailableOpgaver() {
        return opgaveRegister.getAvailableOpgaver();
    }
    
    public ArrayList<Opgave> getOpgaver() {
        return opgaveRegister.getOpgaver();
    }
    
}

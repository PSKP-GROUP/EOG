/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eog;

import db.OpgaveDAO;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Patrick
 */
public class OpgaveRegister {

    private ArrayList<Opgave> opgaver;

    public OpgaveRegister() {
        opgaver = new ArrayList<>();

    }
    
    public Opgave createOpgave(String title, String description, String dateForTask, String deadlineTime, String afbudsdato){
        Opgave opgave = new Opgave(title, description, dateForTask, deadlineTime, afbudsdato);
        insert(opgave);
        return opgave;
    }

    public Opgave getOpgave(int id) {
        Iterator<Opgave> i = opgaver.iterator();
        
        while(i.hasNext()) {
            Opgave o = i.next();
            if(o.getId() == id) {
                return o;
            }
        }
        return null;
    }
    
    public void setBeboer(int id, int idBeboer) {
        Opgave opgave = getOpgave(id);
        opgave.setIdBeboer(idBeboer);
        update(opgave);
    }
    
    public void updateOpgave(int id, String description, String dateForTask, String deadlineTime, String afbudsdato, int idBeboer){
        Opgave opgave = getOpgave(id);
        opgave.setDescription(description);
        opgave.setDateForTask(dateForTask);
        opgave.setDeadlineTime(deadlineTime);
        opgave.setAfbudsdato(afbudsdato);
        opgave.setIdBeboer(idBeboer);
        update(opgave);
    }
    
    public Opgave insert(Opgave opgave){
        int id = OpgaveDAO.insert(opgave);
        opgave.setId(id);
        opgaver.add(opgave);
        return opgave;
    }
    
    public void update(Opgave opgave) {
        OpgaveDAO.update(opgave);
    }
    
    public void loadDB() {
        opgaver = OpgaveDAO.getAll();
    }
    
    public ArrayList<Opgave> getAvailableOpgaver() {
        ArrayList<Opgave> al = new ArrayList<>();
        
        Iterator<Opgave> i = opgaver.iterator();
        
        while(i.hasNext()) {
            Opgave o = i.next();
            if(o.getIdBeboer() == 0) {
                al.add(o);
            }
        }
        
        return al;
    }
    
    public ArrayList<Opgave> getOpgaver() {
        return opgaver;
    }
}

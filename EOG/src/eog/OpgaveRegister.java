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
    
    public Opgave createOpgave(String title, String description, String dateForTask, String deadlineTime){
        Opgave opgave = new Opgave(title, description, dateForTask, deadlineTime);
        insert(opgave);
        return opgave;
    }
    
    public Opgave insert(Opgave opgave){
        int id = OpgaveDAO.insert(opgave);
        opgave.setId(id);
        opgaver.add(opgave);
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
}

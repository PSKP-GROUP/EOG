/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eog;

/**
 *
 * @author Patrick
 */
public class OpgaveHandler {
    
    private OpgaveRegister opgaveRegister;
    
    public OpgaveHandler(OpgaveRegister opgaveRegister) {
        this.opgaveRegister = opgaveRegister;
    }
    
    public void createOpgave(String title, String description, String dateForTask, String deadlineTime) {
        opgaveRegister.createOpgave(title, description, dateForTask, deadlineTime);
    }
    
    public Opgave getOpgave(int id) {
        return opgaveRegister.getOpgave(id);
    }
    
}

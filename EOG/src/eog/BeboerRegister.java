/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eog;

import db.BeboerDAO;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Patrick
 */
public class BeboerRegister {
    
    private ArrayList<Beboer> beboere;
    
    public BeboerRegister() {
        beboere = new ArrayList<>();
    }
    
    public Beboer createBeboer(String firstname, String lastname, String address, String phone, String email, String role) {
        Beboer b = new Beboer(firstname, lastname, address, phone, email, role);
        insertBeboer(b);
        return b;
    }
    
    public void insertBeboer(Beboer b) {
        int id = BeboerDAO.insert(b);
        b.setId(id);
        beboere.add(b);
    }
    
    public Beboer getBeboer(int id) {
        Iterator<Beboer> i = beboere.iterator();
        
        while(i.hasNext()) {
            Beboer b = i.next();
            if(b.getId() == id) {
                return b;
            }
        }
        return null;
    }
    
    public void loadDB() {
        beboere = BeboerDAO.getAll();
    }
    
    public ArrayList<Beboer> getBeboere() {
        return beboere;
    }
    
}

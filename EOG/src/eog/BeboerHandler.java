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
public class BeboerHandler {
    
    private BeboerRegister beboerRegister;
    
    public BeboerHandler(BeboerRegister beboerRegister) {
        this.beboerRegister = beboerRegister;
    }
    
    public void createBeboer(String firstname, String lastname, String address, String phone, String email, String role) {
        beboerRegister.createBeboer(firstname, lastname, address, phone, email, role);
    }
    
    public Beboer getBeboer(int id) {
        return beboerRegister.getBeboer(id);
    }
    
}

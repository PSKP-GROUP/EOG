/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db;

import eog.Beboer;
import eog.Opgave;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patrick
 */
public class OpgaveDAO {
    
    private static Connection conn;

    public OpgaveDAO() {
    }
    
    public static int insert(Opgave opgave) {
        try {
            conn = DBTool.getInstance();
            Statement s = conn.createStatement();
            
            String titel = opgave.getTitel();
            String beskrivelse = opgave.getBeskrivelse();
            String datoForOprettelse = opgave.getDatoForOprettelse();
            String tidsfrist = opgave.getTidsfrist();
            
            String sql = "INSERT INTO beboer (titel, beskrivelse, datoForOprettelse, tidsfrist)"
                    + "VALUES('"+titel+"', '"+beskrivelse+"', '"+datoForOprettelse+"', '"+tidsfrist+"');";
            s.execute(sql);
            ResultSet rs = s.executeQuery("SELECT LAST_INSERT_ID();");
            rs.next();
            int id = rs.getInt(1);
            
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(BeboerDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BeboerDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1;
    }
    
}

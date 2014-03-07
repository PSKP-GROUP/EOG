/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import eog.Beboer;
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
public class BeboerDAO {

    private static Connection conn;

    private BeboerDAO() {

    }

    public static int insert(Beboer b) {
        try {
            conn = DBTool.getInstance();
            Statement s = conn.createStatement();
            
            String firstname = b.getFirstname();
            String lastname = b.getLastname();
            String address = b.getAddress();
            String phone = b.getPhone();
            String email = b.getEmail();
            String role = b.getRole();
            
            String sql = "INSERT INTO beboer (firstname, lastname, address, phone, email, role) "
                    + "VALUES('"+firstname+"', '"+lastname+"', '"+address+"', '"+phone+"', '"+email+"', '"+role+"');";
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
    
    public static Beboer get(int id) {
        try {
            conn = DBTool.getInstance();
            Statement s = conn.createStatement();
            
            ResultSet rs = s.executeQuery("SELECT * FROM beboer WHERE idBeboer=" + id + ";");
            rs.next();
            
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            String address = rs.getString("address");
            String phone = rs.getString("phone");
            String email = rs.getString("email");
            String role = rs.getString("role");
            
            Beboer b = new Beboer(firstname, lastname, address, phone, email, role);
            return b;
        } catch (SQLException ex) {
            Logger.getLogger(BeboerDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BeboerDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

}

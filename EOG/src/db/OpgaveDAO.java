/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

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

            String title = opgave.getTitle();
            String description = opgave.getDescription();
            String dateForTask = opgave.getDateForTask();
            String deadlineTime = opgave.getDeadlineTime();
            int idBeboer = 0;
            if(opgave.getBeboer() != null) {
                idBeboer = opgave.getBeboer().getId();
            }

            String sql = "INSERT INTO opgave (title, description, datefortask, deadlinetime, idbeboer)"
                    + "VALUES('" + title + "', '" + description + "', '" + dateForTask + "', '" + deadlineTime + "', "+idBeboer+");";
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

    public static void update(Opgave opgave) {
        try {
            conn = DBTool.getInstance();
            Statement s = conn.createStatement();
            
            String title = opgave.getTitle();
            String description = opgave.getDescription();
            String dateForTask = opgave.getDateForTask();
            String deadlineTime = opgave.getDeadlineTime();
            int idBeboer = 0;
            if(opgave.getBeboer() != null) {
                idBeboer = opgave.getBeboer().getId();
            }
            
            String sql = "UPDATE opgave SET title='"+title+"', "
                    + "description='"+description+"', datefortask='"+dateForTask+"', "
                    + "deadlinetime='"+deadlineTime+"', idbeboer='"+idBeboer+"' WHERE idopgave=" + opgave.getId() + ";";
            s.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(OpgaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(OpgaveDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

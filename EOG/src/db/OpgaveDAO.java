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
import java.util.ArrayList;
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
            String afbudsdato = opgave.getAfbudsdato();

            String sql = "INSERT INTO opgave (title, description, datefortask, deadlinetime, afbudsdato)"
                    + "VALUES('" + title + "', '" + description + "', '" + dateForTask + "', '" + deadlineTime + "', '" + afbudsdato + "');";
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
            String afbudsdato = opgave.getAfbudsdato();
            int idBeboer = opgave.getIdBeboer();

            String sql = "";
            if (idBeboer != 0) {
                sql = "UPDATE opgave SET title='" + title + "', "
                        + "description='" + description + "', datefortask='" + dateForTask + "', "
                        + "deadlinetime='" + deadlineTime + "', afbudsdato='" + afbudsdato + "', idbeboer='" + idBeboer + "' WHERE idopgave=" + opgave.getId() + ";";
            } else {
                sql = "UPDATE opgave SET title='" + title + "', "
                        + "description='" + description + "', datefortask='" + dateForTask + "', "
                        + "deadlinetime='" + deadlineTime + "', afbudsdato='" + afbudsdato + "', idbeboer=null WHERE idopgave=" + opgave.getId() + ";";
            }
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

    public static ArrayList<Opgave> getAll() {
        ArrayList<Opgave> opgaver = new ArrayList<>();

        try {
            conn = DBTool.getInstance();
            Statement s = conn.createStatement();

            String sql = "SELECT * FROM opgave;";
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("idopgave");
                String title = rs.getString("title");
                String description = rs.getString("description");
                String dateForTask = rs.getString("datefortask");
                String deadlineTime = rs.getString("deadlinetime");
                String afbudsdato = rs.getString("afbudsdato");
                int idBeboer = rs.getInt("idbeboer");

                Opgave o = new Opgave(title, description, dateForTask, deadlineTime, afbudsdato);
                o.setId(id);
                o.setIdBeboer(idBeboer);
                opgaver.add(o);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(OpgaveDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(OpgaveDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return opgaver;
    }

}

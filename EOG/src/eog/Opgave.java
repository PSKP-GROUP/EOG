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
public class Opgave {
    
    private int id;
    private String title;
    private String description;
    private String dateForTask;
    private String deadlineTime;
    private String afbudsdato;
    private int idBeboer;

    public Opgave(String title, String description, String dateForTask, String deadlineTime, String afbudsdato) {
        this.title = title;
        this.description = description;
        this.dateForTask = dateForTask;
        this.deadlineTime = deadlineTime;
        this.afbudsdato = afbudsdato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateForTask() {
        return dateForTask;
    }

    public void setDateForTask(String dateForTask) {
        this.dateForTask = dateForTask;
    }

    public String getDeadlineTime() {
        return deadlineTime;
    }

    public void setDeadlineTime(String deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    public int getIdBeboer() {
        return idBeboer;
    }

    public void setIdBeboer(int idBeboer) {
        this.idBeboer = idBeboer;
    }

    public String getAfbudsdato() {
        return afbudsdato;
    }

    public void setAfbudsdato(String afbudsdato) {
        this.afbudsdato = afbudsdato;
    }
    
    

    @Override
    public String toString() {
        return title;
    }

}

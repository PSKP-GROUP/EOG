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

    public Opgave(String title, String description, String dateForTask, String deadlineTime) {
        this.title = title;
        this.description = description;
        this.dateForTask = dateForTask;
        this.deadlineTime = deadlineTime;
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

}

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
    
    private int iD;
    private String titel;
    private String beskrivelse;
    private String datoForOprettelse;
    private String tidsfrist;

    public Opgave(String titel, String beskrivelse, String datoForOprettelse, String tidsfrist) {
        this.titel = titel;
        this.beskrivelse = beskrivelse;
        this.datoForOprettelse = datoForOprettelse;
        this.tidsfrist = tidsfrist;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public String getDatoForOprettelse() {
        return datoForOprettelse;
    }

    public void setDatoForOpgave(String datoForOpgave) {
        this.datoForOprettelse = datoForOpgave;
    }

    public String getTidsfrist() {
        return tidsfrist;
    }

    public void setTidsfrist(String tidsfrist) {
        this.tidsfrist = tidsfrist;
    }
    
    
    
}

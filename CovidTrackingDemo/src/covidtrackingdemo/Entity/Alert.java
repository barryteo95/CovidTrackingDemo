/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

import covidtrackingdemo.AlertRecords;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author User
 */
public class Alert {
    
    private String username;
    private String alertType;
    private String alertDate;
    private Boolean isAcknowledge;
    
    public Alert() {}
    
    // Accessor Methods
    public String getUsername() { 
        return this.username; 
    }
    public String getAlertType() { 
        return this.alertType; 
    }
    public String getAlertDate() { 
        return this.alertDate; 
    }
    public Boolean getIsAcknowledge() { 
        return this.isAcknowledge; 
    }
    
    // Mutator Methods
    public void setUsername(String username) {
        this.username = username;
    }
    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }
    public void setAlertDate(String alertDate) {
        this.alertDate = alertDate;
    }
    public void setIsAcknowledge(Boolean isAcknowledge) {
        this.isAcknowledge = isAcknowledge;
    }
    
    // Other Methods
    
    public void sendVacAlert(String puUsername, String alertType, String strVaccinationDate) throws IOException {

        AlertRecords ar = new AlertRecords();
        
        ar.insert(puUsername, alertType, strVaccinationDate, false);
    }
    
    public void sendInfAlert(String puUsername, String alertType, String strInfectionDate) throws IOException {

        AlertRecords ar = new AlertRecords();
        
        ar.insert(puUsername, alertType, strInfectionDate, false);
    }
    
    public Boolean sendExpAlert(Set<String> exposedList, String currentDate) throws IOException {
    
        AlertRecords ar = new AlertRecords();
        
        Iterator<String> i = exposedList.iterator();
        
        while (i.hasNext()){
            ar.insert(i.next(), "exposure", currentDate, false);
        }
        
        return true;
    }
    
    public ArrayList<Alert> showAlert() throws IOException {
    
        AlertRecords ar = new AlertRecords();
       
        return ar.select();
    }
    
    public void acknowledge(String username, String alertType, String alertDate) throws IOException {
    
        AlertRecords ar = new AlertRecords();
        
        ar.update(username, alertType, alertDate);
    }
}

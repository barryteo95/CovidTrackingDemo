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
public class AlertRecord {
    
    private String username;
    private String alertType;
    private String alertDate;
    private String isAcknowledge;
    
    public AlertRecord() {}
    
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
    public String getIsAcknowledge() { 
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
    public void setIsAcknowledge(String isAcknowledge) {
        this.isAcknowledge = isAcknowledge;
    }
    
    // Other Methods
    public void sendVacAlert(String puUsername, String alertType, String strVacDate) throws IOException {

        // Insert a new alert entry 
        AlertRecords ar = new AlertRecords();
        ar.insert(puUsername, alertType, strVacDate, "No");
    }
    
    public void sendInfAlert(String puUsername, String alertType, String strInfDate) throws IOException {

        // Insert a new alert entry
        AlertRecords ar = new AlertRecords();
        ar.insert(puUsername, alertType, strInfDate, "No");
    }
    
    public Boolean sendExpAlert(Set<String> expList, String currentDate) throws IOException {
    
        AlertRecords ar = new AlertRecords();
        
        // For each exposed username, insert a new alert entry
        Iterator<String> i = expList.iterator();
        
        while (i.hasNext()){
            ar.insert(i.next(), "exposure", currentDate, "No");
        }
        
        return true;
    }
    
    public ArrayList<AlertRecord> showAlert() throws IOException {
    
        AlertRecords ar = new AlertRecords();
        
        // Retrieve all alert entries
        return ar.select();
    }
    
    public void ackAlert(String username, String alertType, String alertDate) throws IOException {
    
        AlertRecords ar = new AlertRecords();
                
        // Remove the specified alert entry
        ar.delete(username, alertType, alertDate);
    }
}

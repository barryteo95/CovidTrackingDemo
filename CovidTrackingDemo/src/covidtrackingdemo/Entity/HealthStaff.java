/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

import covidtrackingdemo.HealthRecords;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class HealthStaff extends User {
    
    private String vaccinatedBy;
    private String vacStatus;
    private String vacDate;
    private String determinedBy;
    private String infStatus;
    private String infDate;
    
    public HealthStaff() {}
    
    // Accessor Methods
    public String getVaccinatedBy() { return vaccinatedBy; }
    public String getVacStatus() { return vacStatus; }
    public String getVacDate() { return vacDate; }
    public String getDeterminedBy() { return determinedBy; }
    public String getInfStatus() { return infStatus; }
    public String getInfDate() { return infDate; }

    // Mutator Methods
    public void setVaccinatedBy(String vaccinatedBy) { this.vaccinatedBy = vaccinatedBy; }
    public void setVacStatus(String vacStatus) { this.vacStatus = vacStatus; }
    public void setVacDate(String vacDate) { this.vacDate = vacDate; }
    public void setDeterminedBy(String determinedBy) { this.determinedBy = determinedBy; }
    public void setInfStatus(String infStatus) { this.infStatus = infStatus; }
    public void setInfDate(String infDate) { this.infDate = infDate; }
    
    public HealthStaff showHealthRec(String username) throws IOException {
    
        HealthRecords hr = new HealthRecords();
        
        HealthStaff user = hr.select(username);
        
        return user;
    }
        
    public ArrayList<HealthStaff> showHealthRecs() throws IOException {
        
        HealthRecords hr = new HealthRecords();
        
        ArrayList<HealthStaff> userList = hr.select();
        
        return userList;
    }
    
    public void createRec(String puUsername, String vaccinatedBy, String vacStatus, String vacDate, String determinedBy, String infStatus, String infDate) throws IOException {
    
        HealthRecords hr = new HealthRecords();
        
        hr.insert(puUsername, vaccinatedBy, vacStatus, vacDate, determinedBy, infStatus, infDate);
    }

    public void update(String hsUsername, String puUsername, String vacStatus, String strVacDate, String infStatus, String strInfDate) throws IOException {
        
        HealthRecords hr = new HealthRecords();
        
        hr.update(hsUsername, puUsername, vacStatus, strVacDate, infStatus, strInfDate);    
    }
    
    public ArrayList<String> findInfected(String currentDate) throws IOException, ParseException {  
        
        HealthRecords hr = new HealthRecords();
        
        ArrayList<String> infectedList = new ArrayList<>();
         
        ArrayList<HealthStaff> recordList = hr.select();
        
        for (HealthStaff user : recordList) {
                        
            if (currentDate.equals(user.getInfDate())) {
            
                infectedList.add(user.getUsername());
            }
        }
        
        return infectedList;
    }
}

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
    
    public HealthStaff() {}
    
    public PublicUser showUser(String username) throws IOException {
    
        HealthRecords hr = new HealthRecords();
        
        PublicUser user = hr.select(username);
        
        return user;
    }
    
    public void update() {}
    
    public ArrayList<PublicUser> display() throws IOException {
        
        HealthRecords hr = new HealthRecords();
        
        ArrayList<PublicUser> userList = hr.select();
        
        return userList;
    }

    public void update(String hsUsername, String puUsername, String vacStats, String strVacDate, String infStats, String strInfDate) throws IOException {
        
        HealthRecords hr = new HealthRecords();
        
        hr.update(hsUsername, puUsername, vacStats, strVacDate, infStats, strInfDate);    
    }
    
    public ArrayList<String> findInfected(String currentDate) throws IOException, ParseException {  
        
        HealthRecords hr = new HealthRecords();
        
        ArrayList<String> infectedList = new ArrayList<>();
         
        ArrayList<PublicUser> recordList = hr.select();
        
        for (PublicUser user : recordList) {
                        
            if (currentDate.equals(user.getInfectionDate())) {
            
                infectedList.add(user.getUsername());
            }
        }
        
        return infectedList;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthOrganization;

import covidtrackingdemo.Entity.HealthStaff;
import covidtrackingdemo.Entity.PublicUser;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author User
 */
public class GenerateReportCtrler {
    
    public GenerateReportCtrler() {}
    
    public HashMap<String, Integer> generateReport(String startDate, String endDate) throws IOException {
        
        // Call the controller class
        HealthStaff hs = new HealthStaff();
        ArrayList<PublicUser> healthRecs = hs.showHealthRecs();
        
        // Create a HashMap with <Key, Value>
        // e.g., <"V,DD/MM/YYYY", count>
        // e.g., <"I,DD/MM/YYYY", count>
        HashMap<String, Integer> dict = new HashMap<>();

        // Create a formatter for dates
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //convert String to LocalDate
        LocalDate fromDate = LocalDate.parse(startDate, formatter);  
        LocalDate toDate = LocalDate.parse(endDate, formatter);
        
        // Declare variables
        Boolean isInfAfter;
        Boolean isInfBefore;
        
        Boolean isVacAfter;
        Boolean isVacBefore;
        
        LocalDate infDate;
        LocalDate vacDate;
        
        String tempKey;
        Integer tempVal;
        
        for (PublicUser user : healthRecs) {
            
            infDate = LocalDate.parse(user.getInfDate(), formatter);
            vacDate = LocalDate.parse(user.getVacDate(), formatter);
            
            // Condition to check if infection date is within the 7 days
            isInfAfter = infDate.isAfter(fromDate.minusDays(1));
            isInfBefore = infDate.isBefore(toDate.plusDays(1)); 
            
            // Condition to check if vaccination date is within the 7 days
            isVacAfter = vacDate.isAfter(fromDate.minusDays(1));
            isVacBefore = vacDate.isBefore(toDate.plusDays(1)); 
                                    
            if (isInfAfter && isInfBefore) {
                
                // Initialise the value
                tempVal = 0;
                
                // Initialise the key
                tempKey = "I," + formatter.format(infDate);
                
                if (dict.get(tempKey) != null) {
                    
                    // If key exists, tempVal = value
                    tempVal = dict.get(tempKey);
                }
               
                dict.put(tempKey, ++tempVal);
            }
            
            if (isVacAfter && isVacBefore) {
            
                tempVal = 0;
                
                tempKey = "V," + formatter.format(vacDate);
                
                if (dict.get(tempKey) != null) {
                    
                    tempVal = dict.get(tempKey);
                }
                
                dict.put(tempKey, ++tempVal);
            }
        }
        
        return dict; 
    }
}

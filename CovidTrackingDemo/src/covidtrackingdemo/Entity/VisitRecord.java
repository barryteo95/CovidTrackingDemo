/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

import covidtrackingdemo.VisitRecords;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class VisitRecord {
    
    private String boUsername;
    private String puUsername;
    private String visitedDate;
    
    public VisitRecord() {}
    
    // Accessor Methods
    public String getBoUsername() { 
        return this.boUsername; 
    }
    public String getPuUsername() { 
        return this.puUsername; 
    }
    public String getVisitedDate() { 
        return this.visitedDate; 
    }
    
    // Mutator Methods
    public void setBoUsername(String boUsername) { 
        this.boUsername = boUsername; 
    }
    public void setPuUsername(String puUsername) {
        this.puUsername = puUsername;
    }
    public void setVisitedDate(String visitedDate) {
        this.visitedDate = visitedDate;
    }
    
    // Other Methods
    public void checkIn(String boUsername, String puUsername, String date) throws IOException {
    
        // Insert a new visit entry
        VisitRecords vr = new VisitRecords();
        vr.insert(boUsername, puUsername, date);
    }
    
    public ArrayList<VisitRecord> showVisit() throws IOException {
        
        // Retrieve all visit entries
        VisitRecords vr = new VisitRecords();
        return vr.select();
    } 
    
    public Set<String> findExposed(ArrayList<String> infList, LocalDate startDate) throws IOException {
        
        // Retrieve all visit entries
        VisitRecords vr = new VisitRecords();
        ArrayList<VisitRecord> visitorList = vr.select();
        
        /*
         * Add business owner/public user username to this unique list 
         * based on the requirements : 
         * - start date =< date of visit <= end date
         * - infected user == public user username
         * - public user who visited exposed business owner
        */
        Set<String> expList = new HashSet<>();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        Boolean isAfter;
        Boolean isBefore;
        Boolean isWithin;
        
        LocalDate dateOfVisit;
        
        for (VisitRecord visit : visitorList) {
            
            String visitor = visit.getPuUsername();  
            
            // Convert String type to LocalDate type
            dateOfVisit = LocalDate.parse(visit.getVisitedDate(), formatter);
            
            // Return boolean when comparing dates
            isAfter = dateOfVisit.isAfter(startDate.minusDays(1));
            isBefore = dateOfVisit.isBefore(startDate.plusDays(3)); 
            
            isWithin = isAfter && isBefore;
                                    
            if (infList.contains(visitor) && isWithin) {
                
                expList.add(visit.getBoUsername());
            }
        }
        
        for (VisitRecord visit : visitorList) {
           
            String owner = visit.getBoUsername();
            String visitor = visit.getPuUsername();
            
            dateOfVisit = LocalDate.parse(visit.getVisitedDate(), formatter);
            
            isAfter = dateOfVisit.isAfter(startDate.minusDays(1));
            isBefore = dateOfVisit.isBefore(startDate.plusDays(3)); 
            
            isWithin = isAfter && isBefore;
                        
            if (expList.contains(owner) && isWithin) {
                
                expList.add(visitor);
            }
        }
        
        return expList;
    }
}

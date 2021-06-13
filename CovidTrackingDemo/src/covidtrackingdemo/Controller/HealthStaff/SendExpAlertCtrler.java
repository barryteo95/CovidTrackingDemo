/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthStaff;

import covidtrackingdemo.Entity.AlertRecord;
import covidtrackingdemo.Entity.HealthRecord;
import covidtrackingdemo.Entity.VisitRecord;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Set;
/**
 *
 * @author barry
 */
public class SendExpAlertCtrler {
    
    public SendExpAlertCtrler() {}
    
    public Set<String> sendExpAlert(String currentDate) throws IOException, ParseException {
        
        // Find out the infected cases based on the current date 
        HealthRecord hs = new HealthRecord();
        ArrayList<String> infList = hs.findInfected(currentDate);
        
        /*
         * Find about the exposed cases from visits 
         * based on the period current date - 2 <= date of visit <= current date
        */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate startDate = LocalDate.parse(currentDate, formatter);
        startDate = startDate.minusDays(2);
        
        VisitRecord visit = new VisitRecord();
        Set<String> expList = visit.findExposed(infList, startDate);
        
        /*
         * Send exposure alerts to ...
         * - username found in explist
         * - tag with current date
        */
        AlertRecord alert = new AlertRecord();
        alert.sendExpAlert(expList, currentDate);
        
        return expList;
    }
}

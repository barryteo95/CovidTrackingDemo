/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthStaff;

import covidtrackingdemo.Entity.HealthStaff;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author barry
 */
public class UpdateVacStatusCtrler {
    
    public UpdateVacStatusCtrler() {}
            
    public int updateVacStatus(String hsUsername, String puUsername, String vacStatus, Date vacDate, String infStatus, Date infDate) throws IOException {
        
        HealthStaff hs = new HealthStaff();

        String strVacDate = validateDate(vacDate);

        // Update occurs when date is valid 
        
        if (!strVacDate.equals("")) {
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
            String strInfDate = sdf.format(infDate);

            hs.update(hsUsername, puUsername, vacStatus, strVacDate, infStatus, strInfDate);
            
            return 0;
        }
            
        else {

            return 1;  
        } 
    }
    
    private String validateDate(Date vacDate) throws IOException {

        Date dateOfVac = vacDate;
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        String strVacDate = sdf.format(dateOfVac);
        
        if (!strVacDate.equals(sdf.format(dateOfVac))) {
            return ""; 
        }
        
        else {
            return strVacDate;
        } 
    }
}

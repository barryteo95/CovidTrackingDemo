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
public class UpdateInfStatusCtrler {

    public UpdateInfStatusCtrler() {}
    
    public int updateInfStatus(String hsUsername, String puUsername, String vacStatus, Date vacDate, String infStatus, Date infDate) throws IOException {
   
        HealthStaff hs = new HealthStaff();

        String strInfDate = validateDate(infDate);

        // Update occurs when date is valid 
        
        if (!strInfDate.equals("")) {
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
            String strVacDate = sdf.format(vacDate);

            hs.update(hsUsername, puUsername, vacStatus, strVacDate, infStatus, strInfDate);
            
            return 0;
        }
            
        else {

            return 1;  
        } 
    }
    
    private String validateDate(Date infDate) throws IOException {

        Date dateOfInf = infDate;
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        String strInfDate = sdf.format(dateOfInf);
        
        if (!strInfDate.equals(sdf.format(dateOfInf))) {
            return ""; 
        }
        
        else {
            return strInfDate;
        } 
    }
}

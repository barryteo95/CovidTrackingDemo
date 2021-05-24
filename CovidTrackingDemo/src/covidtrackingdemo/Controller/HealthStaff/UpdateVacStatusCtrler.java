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
            
    public void updateVacStatus(String hsUsername, String puUsername, String vacStatus, Date vacDate, String infStatus, Date infDate) throws IOException {
        
        // Convert Date to String
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String strVacDate = sdf.format(vacDate);
        String strInfDate = sdf.format(infDate);
        
        // Update specified health record entry
        HealthStaff hs = new HealthStaff();
        hs.updateRec(hsUsername, puUsername, vacStatus, strVacDate, infStatus, strInfDate);
    }
}

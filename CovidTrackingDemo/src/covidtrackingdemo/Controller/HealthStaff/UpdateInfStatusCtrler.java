/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthStaff;

import covidtrackingdemo.Entity.HealthRecord;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author barry
 */
public class UpdateInfStatusCtrler {

    public UpdateInfStatusCtrler() {}
    
    public void updateInfStatus(String hsUsername, String puUsername, String vacStatus, Date vacDate, String infStatus, Date infDate) throws IOException { 

        // Convert Date to String 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String strVacDate = sdf.format(vacDate);
        String strInfDate = sdf.format(infDate);
            
        // Update specified health record entry
        HealthRecord hs = new HealthRecord();
        hs.updateRec(hsUsername, puUsername, vacStatus, strVacDate, infStatus, strInfDate);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthStaff;

import covidtrackingdemo.Entity.Alert;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author barry
 */
public class SendVacAlertCtrler {
    
    public SendVacAlertCtrler() {}
    
    public void sendVacAlert(String puUsername, String alertType, Date vacDate) throws IOException {
        
        // Convert vaccination date of Date type to String type
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String strVacDate = sdf.format(vacDate);

        /*
         * Send vaccination alerts to ...
         * - specified username
         * - tag with alert type and infection date
        */
        Alert alert = new Alert();
        alert.sendVacAlert(puUsername, alertType, strVacDate);
    }
}

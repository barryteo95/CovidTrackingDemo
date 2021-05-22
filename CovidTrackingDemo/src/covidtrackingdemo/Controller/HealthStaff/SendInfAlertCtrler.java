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
public class SendInfAlertCtrler {
    
    public SendInfAlertCtrler() {}

    public void sendInfAlert(String puUsername, String alertType, Date infDate) throws IOException {

        // Convert infection date of Date type to String type
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String strInfDate = sdf.format(infDate);

        /*
         * Send infection alerts to ...
         * - specified username
         * - tag with alert type and infection date
        */
        Alert alert = new Alert();
        alert.sendInfAlert(puUsername, alertType, strInfDate);
    }
}

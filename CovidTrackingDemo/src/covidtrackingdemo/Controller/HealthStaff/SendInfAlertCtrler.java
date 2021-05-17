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

        // Convert Vaccination Date to String Type

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String strInfDate = sdf.format(infDate);

        // SendInfAlert

        Alert alert = new Alert();

        alert.sendInfAlert(puUsername, alertType, strInfDate);
    }
}

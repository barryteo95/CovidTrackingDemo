/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.BusinessOwner;

import covidtrackingdemo.Entity.Alert;
import covidtrackingdemo.Entity.Visit;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class ShowAlertController {
    
    public ShowAlertController() {}
    
    public ArrayList<Alert> showAlert(String accName) throws IOException {
                        
        Alert alert = new Alert();
        
        ArrayList<Alert> alertList = alert.showAlert();
        
        Iterator itr = alertList.iterator();
        
        while (itr.hasNext()) {
            
            Alert a = (Alert) itr.next();
            
            if (!accName.equals(a.getUsername())) {
                
                itr.remove();
            }           
        }
   
        return alertList;
    }
}

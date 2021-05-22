/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.BusinessOwner;

import covidtrackingdemo.Entity.Alert;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class ShowAlertCtrler {
    
    public ShowAlertCtrler() {}
    
    public ArrayList<Alert> showAlert(String accName) throws IOException {
                        
        // Retrieve all alert entries
        Alert alert = new Alert();
        ArrayList<Alert> alertList = alert.showAlert();
        
        /*
         * For each alert entry,
         * if username don't match specified username
         * remove
        */
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

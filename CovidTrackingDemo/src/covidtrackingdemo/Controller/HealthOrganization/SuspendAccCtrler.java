/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthOrganization;

import covidtrackingdemo.Entity.HealthOrganization;
import java.io.IOException;

/**
 *
 * @author barry
 */
public class SuspendAccCtrler {

    public SuspendAccCtrler() {}

    public int suspendAcc(String username, String password, String privilege, String firstName, String lastName) throws IOException {

        int validationIsSuccessful = validate(username);

        if (validationIsSuccessful == 0) {
            
            // Suspend specified user profile entry
            HealthOrganization ho = new HealthOrganization();
            ho.suspendAcc(username, "admin", privilege, firstName, lastName);
        }

        return validationIsSuccessful;
    }        
    
    private int validate(String username) throws IOException {

        // Validate empty fields
        if (username.equals("")) {
            
            return 1; 
        }
        else {
            
            return 0;
        } 
    }
}

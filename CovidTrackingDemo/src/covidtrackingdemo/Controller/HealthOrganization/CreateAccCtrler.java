/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthOrganization;

import covidtrackingdemo.Entity.HealthOrganization;
import covidtrackingdemo.Entity.HealthStaff;
import java.io.IOException;

/**
 *
 * @author barry
 */
public class CreateAccCtrler {
    
    public CreateAccCtrler() {}

    public int createAcc(String username, String password, String privilege, String firstName, String lastName) throws IOException {

        int validationIsSuccessful = validate(username, password, privilege, firstName, lastName);

        // validationIsSuccessful : 0 | successful 
        if (validationIsSuccessful == 0) {
        
            HealthOrganization ho = new HealthOrganization();
            ho.createAcc(username, password, privilege, firstName, lastName);
            
            if (privilege.equals("Public User")) {
            
                HealthStaff hs = new HealthStaff();
                hs.createRec(username, null, "No", "01/01/1001", null, "No", "01/01/1001");
            }
        }
        
        return validationIsSuccessful;
    }
    
    private int validate(String username, String password, String privilege, String firstName, String lastName) throws IOException {

        String regex_password = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()+=])(?=\\S+$).{8,}$";

        //Validate empty fields
        if (username.equals("") || password.equals("") || firstName.equals("") || lastName.equals("")) {
            return 1; 
        }

        //Validate email
        else if (!username.contains("@example.com")) {
            return 2;
        }

        //Validate password
        else if (!password.matches(regex_password)) {
            return 3;
        }
        
        else 
            return 0;
    }
}

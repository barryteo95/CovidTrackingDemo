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
public class CreateAccCtrler {
    
    public CreateAccCtrler() {}

    public int createAcc(String username, String password, String privilege, String firstName, String lastName) throws IOException {

        HealthOrganization ho = new HealthOrganization();

        int validationIsSuccessful = validate(username, password, privilege, firstName, lastName);

        if (validationIsSuccessful == 0)
            ho.createAcc(username, password, privilege, firstName, lastName);

        return validationIsSuccessful;
    }
    
    private int validate(String username, String password, String privilege, String firstName, String lastName) throws IOException {

        String regex_password = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()+=])(?=\\S+$).{8,}$";

        //Validate empty fields
        if (username.equals("") || password.equals("") || firstName.equals("") || lastName.equals("")) {
            return 1; 
        }

        //Validate email
        else if (!username.contains("@")) {
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

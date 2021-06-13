/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthOrganization;

import covidtrackingdemo.Entity.UserProfile;
import covidtrackingdemo.Entity.HealthRecord;
import covidtrackingdemo.Entity.UserProfile;
import java.io.IOException;

/**
 *
 * @author barry
 */
public class CreateAccCtrler {
    
    public CreateAccCtrler() {}

    public int createAcc(String username, String password, String privilege, String firstName, String lastName) throws IOException {

        int validationIsSuccessful = validate(username, password, privilege, firstName, lastName);

        // validationIsSuccessful : 0 a.k.a successful 
        if (validationIsSuccessful == 0) {
            
            // Create a new user profile entry 
            UserProfile ho = new UserProfile();
            UserProfile user = ho.showUserProfile(username);
            
            if (user != null) {
                
                // Returns 4 if username exists
                return 4;
            }
            else {
                
                ho.createAcc(username, password, privilege, firstName, lastName);
            
                if (privilege.equals("Public User")) {
                
                    // if a new public user is created
                    // Create a new health record entry with specified username too
                    HealthRecord hs = new HealthRecord();
                    hs.createRec(username, null, "No", "01/01/1001", null, "No", "01/01/1001");
                }
            }
        }
        
        return validationIsSuccessful;
    }
    
    private int validate(String username, String password, String privilege, String firstName, String lastName) throws IOException {

        String regex_password = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()+=])(?=\\S+$).{8,}$";

        // Validate empty fields
        if (username.equals("") || password.equals("") || firstName.equals("") || lastName.equals("")) {
            
            return 1; 
        }

        // Validate email format
        else if (!username.contains("@example.com")) {
            
            return 2;
        }

        // Validate password format
        else if (!password.matches(regex_password)) {
            
            return 3;
        }
        
        // Valid
        else {
            
            return 0;
        }
    }
}

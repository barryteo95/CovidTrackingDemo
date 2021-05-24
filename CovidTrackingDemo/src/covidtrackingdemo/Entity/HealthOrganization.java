/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

import covidtrackingdemo.UserProfiles;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author barry
 */
public class HealthOrganization extends User {

    public HealthOrganization() {}

    // Other Methods
    public void createAcc(String username, String password, String privilege, String firstName, String lastName) throws IOException {
                
        // Insert a new user profile entry
        UserProfiles db = new UserProfiles();
        db.insert(username, password, privilege, firstName, lastName);
    }    
    
    public void updateAcc(String username, String password, String privilege, String firstName, String lastName) throws IOException {
                
        // Update the specified user profile entry
        UserProfiles db = new UserProfiles();
        db.update(username, password, privilege, firstName, lastName);
    }
    
    public void suspendAcc(String username, String password, String privilege, String firstName, String lastName) throws IOException {
    
        // Suspend the specified user profile entry
        UserProfiles db = new UserProfiles();
        db.update(username, password, privilege, firstName, lastName);
    }
    
    public User showUserProfile(String accName) throws IOException {
    
        UserProfiles db = new UserProfiles();
        
        // Retrieve the specified user profile entry
        return db.select(accName);
    }
    
    public ArrayList<User> showUserProfile() throws IOException {
    
        UserProfiles db = new UserProfiles();
                
        // Retrieve all user profile entries
        return db.select();
    }
}

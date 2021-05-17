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

    public void createAcc(String username, String password, String privilege, String firstName, String lastName) throws IOException {
                
        UserProfiles db = new UserProfiles();
        
        db.insert(username, password, privilege, firstName, lastName);
    }    
    
    public void updateAcc(String username, String password, String privilege, String firstName, String lastName) throws IOException {
                
        UserProfiles db = new UserProfiles();
        
        db.update(username, password, privilege, firstName, lastName);
    }
    
    public void suspendAcc(String username, String password, String privilege, String firstName, String lastName) throws IOException {
    
        UserProfiles db = new UserProfiles();
        
        db.update(username, password, privilege, firstName, lastName);
    }
    
    public User showUserProfile(String accName) throws IOException {
    
        UserProfiles db = new UserProfiles();
        
        User user = db.select(accName);
        
        return user;
    }
    
    public ArrayList<User> showUserProfiles() throws IOException {
    
        UserProfiles db = new UserProfiles();
        
        ArrayList<User> userList = db.select();
        
        return userList;
    }
}

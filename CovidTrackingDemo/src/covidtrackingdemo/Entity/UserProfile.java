/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

import covidtrackingdemo.UserProfiles;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class UserProfile {
    
    private String username;
    private String password;
    private String privilege;
    private String firstName;
    private String lastName;
    
    public UserProfile(){}
    
    // Accessor Methods
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getPrivilege() { return privilege; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    // Mutator Methods
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; } 
    public void setPrivilege(String privilege) { this.privilege = privilege; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    // Other Methods
    public String login(String username, String password) throws FileNotFoundException, IOException {
                        
        // Retrieve specified user profile entry 
        UserProfiles db = new UserProfiles();
        UserProfile user = db.select(username);
        
        if (user == null) {
            
            // No result found, return empty string
            return "";
        }
        else if (!password.equals(user.getPassword())) {
            
            // A result found, match the password 
            // Incorrect password, return empty string
            return "";
        }
        else {
            
            // A result found, match the password 
            // Correct password, return privilege
            return user.getPrivilege();
        }         
    }
    
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
    
    public UserProfile showUserProfile(String accName) throws IOException {
    
        UserProfiles db = new UserProfiles();
        
        // Retrieve the specified user profile entry
        return db.select(accName);
    }
    
    public ArrayList<UserProfile> showUserProfile() throws IOException {
    
        UserProfiles db = new UserProfiles();
                
        // Retrieve all user profile entries
        return db.select();
    }
}

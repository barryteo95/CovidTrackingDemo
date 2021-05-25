/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

import covidtrackingdemo.UserProfiles;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author User
 */
public class User {
    
    private String username;
    private String password;
    private String privilege;
    private String firstName;
    private String lastName;
    
    public User(){}
    
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
        User user = db.select(username);
        
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
}

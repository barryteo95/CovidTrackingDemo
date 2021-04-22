/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

import covidtrackingdemo.DemoDatabase;
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
    private String email;
    
    public User(){}
    
    // Accessor Methods
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getPrivilege() { return privilege; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    
    // Mutator Methods
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; } 
    public void setPrivilege(String privilege) { this.privilege = privilege; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmail(String email) { this.email = email; }
    
    public String login(String username, String password) throws FileNotFoundException, IOException {
                
        DemoDatabase db = new DemoDatabase();
        
        User user = db.select(username, password);
        
        if (user == null) { 
            return ""; 
        }
        else { 
            return user.getPrivilege(); 
        }
    }
    
    // public String toString() {}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthOrganization;

import covidtrackingdemo.Entity.UserProfile;
import java.io.IOException;

/**
 *
 * @author User
 */
public class LoginCtrler {
    
    public LoginCtrler() {}
    
    public String login(String username, String password) throws IOException {
            
        // Login with specified username and password
        UserProfile user = new UserProfile();
        return user.login(username, password);
    }
}

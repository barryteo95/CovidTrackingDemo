/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.PublicUser;

import covidtrackingdemo.Entity.HealthOrganization;
import covidtrackingdemo.Entity.User;
import java.io.IOException;

/**
 *
 * @author User
 */
public class ShowUserProfileCtrler {
    
    public ShowUserProfileCtrler() {}
    
    public User showUserProfile(String accName) throws IOException {
        
        HealthOrganization ho = new HealthOrganization();
        
        // Retrieve specified user profile entry
        return ho.showUserProfile(accName);
    }
}

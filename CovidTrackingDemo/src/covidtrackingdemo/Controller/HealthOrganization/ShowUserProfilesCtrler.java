/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthOrganization;

import covidtrackingdemo.Entity.UserProfile;
import covidtrackingdemo.Entity.UserProfile;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ShowUserProfilesCtrler {
    
    public ShowUserProfilesCtrler() {}
    
    public ArrayList<UserProfile> showUserProfiles() throws IOException {
    
        UserProfile ho = new UserProfile();
        
        // Retrieve all user profile entries
        return ho.showUserProfile();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.PublicUser;

import covidtrackingdemo.Entity.UserProfile;
import covidtrackingdemo.Entity.UserProfile;
import java.io.IOException;

/**
 *
 * @author User
 */
public class ShowUserProfileCtrler {
    
    public ShowUserProfileCtrler() {}
    
    public UserProfile showUserProfile(String accName) throws IOException {
        
        UserProfile ho = new UserProfile();
        
        // Retrieve specified user profile entry
        return ho.showUserProfile(accName);
    }
}

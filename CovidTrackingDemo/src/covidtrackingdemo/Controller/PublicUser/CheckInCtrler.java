/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.PublicUser;

import covidtrackingdemo.Entity.UserProfile;
import covidtrackingdemo.Entity.UserProfile;
import covidtrackingdemo.Entity.VisitRecord;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CheckInCtrler {
    
    public CheckInCtrler() {}
    
    public Boolean checkIn(String businessOwner, String publicUser, String date) throws IOException {
    
        // Retrieve all user profile entries
        UserProfile ho = new UserProfile(); 
        ArrayList<UserProfile> userProfiles = ho.showUserProfile();
        
        // Filter out all except business owner entries
        ArrayList<String> boList = new ArrayList<>();
        
        for (UserProfile user: userProfiles) {
            
            if (user.getPrivilege().equals("Business Owner")) {
                
                boList.add(user.getUsername());
            }
        }
        
        if (boList.contains(businessOwner)) {
    
            // If business owner username is valid, 
            // Insert a new visit entry 
            VisitRecord visit = new VisitRecord();
            visit.checkIn(businessOwner, publicUser, date);

            return true;
        }
        
        else {
            
            return false;
        }
    }
}

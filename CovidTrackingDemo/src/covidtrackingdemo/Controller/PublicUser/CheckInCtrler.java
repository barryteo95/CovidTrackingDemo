/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.PublicUser;

import covidtrackingdemo.Entity.HealthOrganization;
import covidtrackingdemo.Entity.User;
import covidtrackingdemo.Entity.Visit;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CheckInCtrler {
    
    public CheckInCtrler() {}
    
    public Boolean checkIn(String businessOwner, String publicUser, String date) throws IOException {
    
        HealthOrganization ho = new HealthOrganization(); 
        
        ArrayList<User> userProfiles = ho.showUserProfiles();
        
        ArrayList<String> boList = new ArrayList<>();
        
        for (User user: userProfiles) {
            
            if (user.getPrivilege().equals("Business Owner")) {
                
                boList.add(user.getUsername());
            }
        }
        
        if (boList.contains(businessOwner)) {
    
            Visit v = new Visit();
        
            v.checkIn(businessOwner, publicUser, date);

            return true;
        }
        
        else {
            
            return false;
        }
    }
}

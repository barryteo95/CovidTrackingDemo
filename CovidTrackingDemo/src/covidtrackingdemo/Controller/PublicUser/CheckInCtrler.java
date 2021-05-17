/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.PublicUser;

import covidtrackingdemo.Entity.Visit;
import java.io.IOException;

/**
 *
 * @author User
 */
public class CheckInCtrler {
    
    public CheckInCtrler() {}
    
    public void checkIn(String businessOwner, String publicUser, String date) throws IOException {
    
        Visit v = new Visit();
        
        v.checkIn(businessOwner, publicUser, date);
    }
}

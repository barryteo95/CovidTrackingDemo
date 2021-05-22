/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.PublicUser;

import covidtrackingdemo.Entity.HealthStaff;
import java.io.IOException;

/**
 *
 * @author User
 */
public class CheckVacStatusCtrler {
    
    public CheckVacStatusCtrler() {}
    
    public Boolean checkVacStatus(String username) throws IOException {
    
        // Retrieve specified health record entry
        HealthStaff hs = new HealthStaff();
        HealthStaff user = hs.showHealthRec(username);
        
        // Check whether health record entry vaccination status is yes
        return user.getVacStatus().equals("Yes");
    }
}

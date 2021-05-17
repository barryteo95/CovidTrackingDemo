/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.PublicUser;

import covidtrackingdemo.Entity.HealthStaff;
import covidtrackingdemo.Entity.PublicUser;
import java.io.IOException;

/**
 *
 * @author User
 */
public class CheckVacStatusCtrler {
    
    public CheckVacStatusCtrler() {}
    
    public Boolean checkVacStatus(String username) throws IOException {
    
        HealthStaff hs = new HealthStaff();
        
        PublicUser user = hs.showHealthRec(username);
        
        return user.getVacStatus().equals("Yes");
    }
}

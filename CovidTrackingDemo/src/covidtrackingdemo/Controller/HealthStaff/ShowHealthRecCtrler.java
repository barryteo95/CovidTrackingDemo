/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthStaff;

import covidtrackingdemo.Entity.HealthStaff;
import covidtrackingdemo.Entity.PublicUser;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author barry
 */
public class ShowHealthRecCtrler {
    
    public ShowHealthRecCtrler() {}
    
    public ArrayList<PublicUser> showHealthRec() throws IOException {
    
        HealthStaff hs = new HealthStaff();
        
        return hs.showHealthRecs();
    }
}

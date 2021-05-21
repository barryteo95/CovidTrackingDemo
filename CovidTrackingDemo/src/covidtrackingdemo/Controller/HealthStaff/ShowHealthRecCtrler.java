/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthStaff;

import covidtrackingdemo.Entity.HealthStaff;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author barry
 */
public class ShowHealthRecCtrler {
    
    public ShowHealthRecCtrler() {}
    
    public ArrayList<HealthStaff> showHealthRec() throws IOException {
    
        HealthStaff hs = new HealthStaff();
        
        return hs.showHealthRecs();
    }
}

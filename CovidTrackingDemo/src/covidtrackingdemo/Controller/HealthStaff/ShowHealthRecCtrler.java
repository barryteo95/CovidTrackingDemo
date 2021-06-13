/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthStaff;

import covidtrackingdemo.Entity.HealthRecord;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author barry
 */
public class ShowHealthRecCtrler {
    
    public ShowHealthRecCtrler() {}
    
    public ArrayList<HealthRecord> showHealthRec() throws IOException {
    
        HealthRecord hs = new HealthRecord();
        
        // Retrieve all health record entries 
        return hs.showHealthRec();
    }
}

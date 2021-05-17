/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.PublicUser;

import covidtrackingdemo.Entity.Visit;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class ShowVisitedCtrler {
    
    public ShowVisitedCtrler() {}
    
    public ArrayList<Visit> showVisited(java.util.Date date, String currentUser) throws IOException, ParseException {
        
        Visit visit = new Visit();
        ArrayList<Visit> visitedList = visit.display();
        
        Iterator itr = visitedList.iterator();
        
        while (itr.hasNext()) {
            
            Visit v = (Visit) itr.next();
            
            Date visitDate = new SimpleDateFormat("dd/MM/yyyy").parse(v.getVisitedDate());
            String username = v.getPuUsername();
            
            if (!(date.equals(visitDate) && currentUser.equals(username))) {
                
                itr.remove();
            }            
        }

        return visitedList;
    }
}

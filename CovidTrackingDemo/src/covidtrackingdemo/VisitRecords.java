/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo;

import covidtrackingdemo.Entity.VisitRecord;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class VisitRecords {
    
    final String path;
    
    public VisitRecords() {
       
        path = "dataset/VisitRecords.csv";
    }
    
    public void insert(String boUsername, String puUsername, String date) throws IOException {
    
        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(path, true))) {
            
            String row = boUsername + "," + puUsername + "," + date;
            
            csvWriter.newLine();
            
            csvWriter.write(row);
            
            csvWriter.close();
        }
    }
    
    public ArrayList<VisitRecord> select() throws FileNotFoundException, IOException {
    
        ArrayList<VisitRecord> visitorList;
        
        try (BufferedReader csvReader = new BufferedReader(new FileReader(path))) {
            
            visitorList = new ArrayList<>();
            
            csvReader.readLine();
            
            String row;
            while ((row = csvReader.readLine()) != null) {
                
                String[] data = row.split(",");
                
                VisitRecord visit = new VisitRecord();
                
                visit.setBoUsername(data[0]);
                visit.setPuUsername(data[1]);
                visit.setVisitedDate(data[2]);
                
                visitorList.add(visit);
            }
            
            csvReader.close();
        }
      
        return visitorList; 
    }
}

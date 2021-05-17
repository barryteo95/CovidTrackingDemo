/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo;

import covidtrackingdemo.Entity.Alert;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author barry
 */
public class AlertRecords {
    
    final String path; 

    public AlertRecords() {
       
        path = "dataset/AlertRecords.csv";
    }
    
    public ArrayList<Alert> select() throws FileNotFoundException, IOException {
        
        ArrayList<Alert> alertList;
        
        try (BufferedReader csvReader = new BufferedReader(new FileReader(path))) {
            
            alertList = new ArrayList<>();
            
            csvReader.readLine();
            
            String row;
            while ((row = csvReader.readLine()) != null) {
                
                String[] data = row.split(",");
                
                Alert alert = new Alert();
                
                alert.setUsername(data[0]);
                alert.setAlertType(data[1]);
                alert.setAlertDate(data[2]); 
                alert.setIsAcknowledge(data[3]); 

                alertList.add(alert);
            }
            
            csvReader.close();
        }
        
        return alertList;
    }
    
    public void insert(String username, String alertType, String date, String isAcknowledge) throws FileNotFoundException, IOException {
    
        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(path, true))) {
            
            String row = username + "," + alertType + "," + date + "," + isAcknowledge;
            
            csvWriter.newLine();
            
            csvWriter.write(row);
            
            csvWriter.close();
        }
    }
    
    public void update(String username, String alertType, String alertDate) throws FileNotFoundException, IOException {
    
        String newData = "";
    
        try (BufferedReader csvReader = new BufferedReader(new FileReader(path))) {
            
            newData = csvReader.readLine();
            
            String row;
            
            while ((row = csvReader.readLine()) != null) {
                
                String[] data = row.split(",");
                
                if ((username.equals(data[0]) && alertType.equals(data[1])) && alertDate.equals(data[2])) {
                
                    row = data[0] + "," + data[1] + "," + data[2] + "," + "Yes";
                }

                newData = newData + "\n" + row;
            }
            
            csvReader.close();
        }
        
        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(path))) {
               
            csvWriter.write(newData);
            
            csvWriter.close();
        }
    }
    
    public void delete(String username, String alertType, String alertDate) throws FileNotFoundException, IOException {
    
        String newData = "";
    
        try (BufferedReader csvReader = new BufferedReader(new FileReader(path))) {
            
            newData = csvReader.readLine();
            
            String row;
            
            while ((row = csvReader.readLine()) != null) {
                
                String[] data = row.split(",");
                
                if ((username.equals(data[0]) && alertType.equals(data[1])) && alertDate.equals(data[2])) {
                    
                    continue;
                }

                newData = newData + "\n" + row;
            }
            
            csvReader.close();
        }
        
        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(path))) {
               
            csvWriter.write(newData);
            
            csvWriter.close();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo;

import covidtrackingdemo.Entity.PublicUser;
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
public class HealthRecords {
    
    final String path; 

    public HealthRecords() {
       
        path = "dataset/HealthRecords.csv";
    }
        
    // Update
//    public void update(String username, String vaccinatedBy, String vaccinationStatus, String vaccinationDate, String determinedBy, String infectionStatus, String infectionDate) throws FileNotFoundException, IOException {
//        
//        String newData = "";
//    
//        try (BufferedReader csvReader = new BufferedReader(new FileReader(path))) {
//            
//            newData = csvReader.readLine();
//            
//            String row;
//            
//            while ((row = csvReader.readLine()) != null) {
//                
//                String[] data = row.split(",");
//                
//                if (username.equals(data[0])) {
//                
//                    row = username + "," + vaccinatedBy + "," + vaccinationStatus + "," + vaccinationDate + "," + determinedBy + "," + infectionStatus + "," + infectionDate;
//                }
//
//                newData = newData + "\n" + row;
//            }
//            
//            csvReader.close();
//        }
//        
//        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(path))) {
//               
//            csvWriter.write(newData);
//            
//            csvWriter.close();
//        }
//    }
   
    // Select - individual
    public PublicUser select(String username) throws IOException {
        
        try (BufferedReader csvReader = new BufferedReader(new FileReader(path))) {
            
            csvReader.readLine();
            
            String row;
            
            while ((row = csvReader.readLine()) != null) {
                
                String[] data = row.split(",");
                
                if (username.equals(data[0])){// && password.equals(data[1])){
                    
                    PublicUser user = new PublicUser();
                    
                    user.setUsername(data[0]);
                    user.setVaccinatedBy(data[1]);
                    user.setVaccinationStatus(data[2]); 
                    user.setVaccinationDate(data[3]); 
                    user.setDeterminedBy(data[4]);
                    user.setInfectionStatus(data[5]);
                    user.setInfectionDate(data[6]);
                    
                    return user;
                } 
            }
            
            csvReader.close();
        }
         
        return null;
    }
    
    // Select - all
    public ArrayList<PublicUser> select() throws FileNotFoundException, IOException {
                
        ArrayList<PublicUser> userList;
        
        try (BufferedReader csvReader = new BufferedReader(new FileReader(path))) {
            
            userList = new ArrayList<>();
            
            csvReader.readLine();
            
            String row;
            while ((row = csvReader.readLine()) != null) {
                
                String[] data = row.split(",");
                
                PublicUser user = new PublicUser();
                
                user.setUsername(data[0]);
                user.setVaccinatedBy(data[1]);
                user.setVaccinationStatus(data[2]); 
                user.setVaccinationDate(data[3]); 
                user.setDeterminedBy(data[4]);
                user.setInfectionStatus(data[5]);
                user.setInfectionDate(data[6]);
                
                userList.add(user);
            }
            
            csvReader.close();
        }
      
        return userList; 
    }

    public void update(String hsUsername, String puUsername, String vacStats, String strVaccinationDate, String infStats, String strInfectionDate) throws FileNotFoundException, IOException {
      
        String newData = "";
    
        try (BufferedReader csvReader = new BufferedReader(new FileReader(path))) {
            
            newData = csvReader.readLine();
            
            String row;
            
            while ((row = csvReader.readLine()) != null) {
                
                String[] data = row.split(",");
                
                if (puUsername.equals(data[0])) {
                
                    row = puUsername + "," + hsUsername + "," + vacStats + "," + strVaccinationDate + "," + hsUsername + "," + infStats + "," + strInfectionDate;
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



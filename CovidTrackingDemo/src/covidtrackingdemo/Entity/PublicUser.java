/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

/**
 *
 * @author barry
 */
public class PublicUser extends User {
    
    private String vaccinatedBy;
    private String vacStatus;
    private String vacDate;
    private String determinedBy;
    private String infStatus;
    private String infDate;

    public PublicUser() {
    }
    
    // Accessor Methods
    public String getVaccinatedBy() { return vaccinatedBy; }
    public String getVacStatus() { return vacStatus; }
    public String getVacDate() { return vacDate; }
    public String getDeterminedBy() { return determinedBy; }
    public String getInfStatus() { return infStatus; }
    public String getInfDate() { return infDate; }

    // Mutator Methods
    public void setVaccinatedBy(String vaccinatedBy) { this.vaccinatedBy = vaccinatedBy; }
    public void setVacStatus(String vacStatus) { this.vacStatus = vacStatus; }
    public void setVacDate(String vacDate) { this.vacDate = vacDate; }
    public void setDeterminedBy(String determinedBy) { this.determinedBy = determinedBy; }
    public void setInfStatus(String infStatus) { this.infStatus = infStatus; }
    public void setInfDate(String infDate) { this.infDate = infDate; }
}

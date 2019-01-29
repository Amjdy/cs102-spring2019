/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.inheritance.hospital;

import java.util.ArrayList;

/**
 Write a class Patient that inherits from Person. It has these specific attributes:
String patientID, the ID of a patient. It must start with “PA”     
* and must have 10 characters length.
ArrayList<MedicalReport> reports: a list of medical      
* report objects from class MedicalReport.
A method toString(), which returns a string 
* representation of the Patient class in the following format. 
* It must call the superclass toString () method.

[patientID] firstName lastName, contact, report

Example:

A constructor with five arguments 
* that sets all values of instance variables to those 
* passed as      parameters.

Implement the class Patient.
 */
public class Patient extends Person {
    
    private String patientID;
    private ArrayList<MedicalReport> reports;
    
    
    public Patient (String firstName, String lastName, Contact contact,
            String patientID, ArrayList<MedicalReport> reports){
        super(firstName, lastName, contact);
        setPatientID(patientID);
        setReports(reports);
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        if (patientID.startsWith("PA") &&(patientID.length()==10))
            this.patientID = patientID;
        else throw new IllegalArgumentException("wrong patientID");
    }

    public ArrayList<MedicalReport> getReports() {
        return reports;
    }

    public void setReports(ArrayList<MedicalReport> reports) {
        this.reports = reports;
    }
    
    @Override
    public String toString(){
        return String.format("[%s] %s, %s",
                patientID, super.toString(),reports);
    }

}

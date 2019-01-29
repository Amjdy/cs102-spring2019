/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.inheritance.hospital;

import java.util.ArrayList;
import java.util.Arrays;

/**
Write a class Doctor that inherits from HospitalEmployee.
It has static ArrayList      of String called DEPARTMENTS_LIST      at      
contains three values: {“General”,      “Pediatric”, “Internal Medicine”}

* It has a new attribute department that represents the
* department of the doctor and must be equal to one the values in the DEPARTMENTS_LIST list.

* It overrides the method      setEmployeeID(String      employeeID) 
* and validates the employeeID attribute such that it also finishes 
* with letter “D” in addition to      starting with “EM” and having 10      characters.
It has a constructor      with five arguments. 
Implement the class Doctor
 */
public class Doctor extends HospitalEmployee{
    
    private static final ArrayList<String> DEPARTMENTS_LIST = 
            new ArrayList<String>(Arrays.asList("General", "Pediatric","Internal Medicine"));
    
    
    private String department;
    
    public Doctor (String firstName, String lastName, Contact contact,
            String employeeID,String department){
        
        super(firstName, lastName, contact, employeeID);
        setDepartment(department);
        
    }

    public String getDepartment() {
        return department;
    }
    

    public void setDepartment(String department) {
        if (DEPARTMENTS_LIST.contains(department))
            this.department = department;
        else throw new IllegalArgumentException("wrong department");
    }
    
    @Override
    public void setEmployeeID(String employeeID) {
        if (employeeID.endsWith("D"))
            super.setEmployeeID(employeeID);
        else throw new IllegalArgumentException("wrong employeeID");
    }
    
    
    
}

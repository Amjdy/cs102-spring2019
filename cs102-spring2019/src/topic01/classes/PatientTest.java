/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic01.classes;


public class PatientTest {
  
    public static void main(String[] args){
        Patient[] patients = new Patient[3];
        
        patients[0]= new Patient("Ali Hassan", new Address("King Abdullah Road", "Riyadh", "Saudi Arabia"), "124521", "0507454124" );
        patients[1]= new Patient("Salem Al-Salem", new Address("King Khaled Road", "Jeddah", "Saudi Arabia"), "354624", "0524798621" );
        patients[2]= new Patient();
        
        patients[2].setName("Mounir Hamdi");
        patients[2].setID("541874");
        patients[2].setAddress(new Address("King Faisal Street", "Makkah", "Saudi Arabia"));
        patients[2].setMobilePhone("0514214541");
        
        
        for (int i=0; i<patients.length; i++)
        {
            System.out.println(patients[i]);
            
        }
    }
    
}

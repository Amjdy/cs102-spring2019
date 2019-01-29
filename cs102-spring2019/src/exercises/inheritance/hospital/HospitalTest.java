/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.inheritance.hospital;

import java.util.ArrayList;

/**

Create one patient and one doctor then provide the following output when printed
[PA12345678] Mohamed Ahmed Address: 10 Olya Street, Morsalat Quarter, Riyadh, Saudi Arabia

 Mobile: 966-05-47896511, Home: 966-011-49173511 null

 [EM1245785D] Ahmed Nassir Address: 20 Sfax Street, Izdihar Quarter, Riyadh, Saudi Arabia

 Mobile: 966-05-47898711, Home: 966-011-4774131
 */
public class HospitalTest {
    
    public static void main(String []args){
        
        /*Address address, Phone mobilePhone, Phone homePhone*/
        /*Street sn, String city, String country*/
        /*String countryCode, String areaCode, String subscriberNumber*/
        
        Phone mobile_patient = new Phone("966", "05", "47896511");
        Phone home_phone_patient = new Phone("966", "011", "49173511");
        Street street_patient = new Street(10, "Olya Street", "Morsalat Quarter");
        Address address_patient = new Address(street_patient, "Riyadh", "Saudi Arabia");
        Contact contact_patient = new Contact(address_patient, mobile_patient,home_phone_patient);
        
        Patient p = new Patient("Mohamed", "Ahmed", contact_patient, "PA12345678",
        new ArrayList<MedicalReport>());
        
        
        Patient p1 = new Patient("Mohamed", "Ahmed", 
                new Contact(new Address(new Street(10, "Olya Street", "Morsalat Quarter"), "Riyadh", "Saudi Arabia"), new Phone("966", "05", "47896511"),new Phone("966", "011", "49173511")),
                "PA12345678",
        new ArrayList<MedicalReport>());
        
        
        
        
        
    }
    
}

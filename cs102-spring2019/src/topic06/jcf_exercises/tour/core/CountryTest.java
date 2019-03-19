package topic06.jcf_exercises.tour.core;

import topic06.jcf_exercises.tour.interfaces.Country;
import java.io.IOException;


public class CountryTest {
    public static void main (String[] args) throws IOException{
        
        Country saudiArabia = new CountryImpl("Saudi Arabia");
        saudiArabia.loadFromFile("saudiarabia.txt");
        saudiArabia.displayCities();
        
    }
    
}

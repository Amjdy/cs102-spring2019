package topic06.jcf_exercises.tour.core;

import topic06.jcf_exercises.tour.interfaces.Country;
import topic06.jcf_exercises.tour.interfaces.Tour;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class PlannerApp {
    public static void main (String[] args) throws IOException{
        
        Country saudiArabia = new CountryImpl("Saudi Arabia");
        
        
        
        saudiArabia.loadFromFile("saudiarabia.txt");
        saudiArabia.displayCities();
        saudiArabia.displayCitiesName();
        //saudiArabia.delete("jeddah");
        saudiArabia.displayCitiesName();
        saudiArabia.saveToFile("cities_saudi.txt");
        
}
}
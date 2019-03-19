
package topic06.jcf_exercises.tour.core;

import topic06.jcf_exercises.tour.interfaces.Addressable;
import topic06.jcf_exercises.tour.interfaces.City;
import topic06.jcf_exercises.tour.interfaces.CityFactory;
import topic06.jcf_exercises.tour.interfaces.Country;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CountryImpl implements Country {
    Map<String,Addressable> cities = new HashMap <String,Addressable>();
    
    CityFactory cf = CityFactoryImpl.getInstance();
    String name = null;
    
    public CountryImpl(String name){
        this.name = name;
    }
    
    /** TASK 1: create the method delete(String cn) **********/
    @Override
    public void delete(String cn) {
        //complete this method
    }
    /********************************************************/
    
    @Override
    public Collection<Addressable> getCities() {
        return cities.values();
    }
    
    @Override
    public City getCityByName(String name) {
        return (City)(cities).get(name.toLowerCase());
    }
    
    @Override
    public void loadFromFile(String file) {
        Scanner input=null;
        try {
            input = new Scanner(new File(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CountryImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (input.hasNext()){
            String line = input.next();
            String [] cityArray = line.split(";");
            City c = cf.getCity(cityArray[0]);
            cities.put(c.getName().toLowerCase(),c);            
        }
    }

    @Override
    public void saveToFile(String file) {
        FileWriter fw=null;
        try {
            fw = new FileWriter(new File (file));
            for (Addressable city:cities.values()){
                fw.write(((City)city).getName()+";"+city.getLocation().getX()+";"+city.getLocation().getY()+"\n");
            }
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(CountryImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @Override
    public void add(City c) {
        cities.put(c.getName().toLowerCase(), c);
    }

    @Override
    public void remove(City c) {
        cities.remove(c.getName());
    }
    
    
    
    @Override
    public void displayCities() {
        Iterator <Addressable> it = this.getCities().iterator();
        while(it.hasNext()){
            System.out.print(((City)(it.next())).getName()+";");
        }
        System.out.println("");
    }

    @Override
    public void displayCitiesName() {
        for (Addressable city: this.getCities()){
            System.out.print(((City)(city)).getName()+"; ");
        }
        System.out.println("");
    }
}

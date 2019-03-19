
package topic06.jcf_exercises.tour.interfaces;

import java.util.Collection;

public interface Country extends GenericMap<String, City>{
    
    
    public abstract void loadFromFile(String file);
    public abstract void saveToFile(String file);
        
    public abstract Collection<Addressable> getCities();
    
    public abstract void displayCities();
    public abstract void displayCitiesName();
    
    public City getCityByName(String name);
    
}

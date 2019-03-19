package topic06.jcf_exercises.tour.core;

import topic06.jcf_exercises.tour.interfaces.City;
import topic06.jcf_exercises.tour.interfaces.Coordinate;
import java.util.Arrays;
import java.util.List;


public class CityImpl implements City {

    private String name;
    private Coordinate location;
    
    public CityImpl(String name, Coordinate location) {
        this.name = name;
        this.location = location;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Coordinate getLocation() {
        return location;
    }

    @Override
    public void setName(String name) {
        List<String> citiesList = Arrays.asList(CityFactoryImpl.cities);
        if (citiesList.contains(name))
            this.name = name;
        else throw new IllegalArgumentException("name not found");
    }

    @Override
    public void setLocation(Coordinate location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return name + ""+location+"";
    }
    
}

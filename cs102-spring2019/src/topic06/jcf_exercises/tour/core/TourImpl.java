package topic06.jcf_exercises.tour.core;

import topic06.jcf_exercises.tour.core.utils.GPS;
import topic06.jcf_exercises.tour.core.utils.GPSDistanceCalculator;
import topic06.jcf_exercises.tour.interfaces.Addressable;
import topic06.jcf_exercises.tour.interfaces.City;
import topic06.jcf_exercises.tour.interfaces.Coordinate;
import topic06.jcf_exercises.tour.interfaces.Country;
import topic06.jcf_exercises.tour.interfaces.Tour;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/** TASK 2: make TourImpl as comparable **********/
public class TourImpl implements Tour{
    
    private List<Addressable> route = new ArrayList<Addressable>();

    
    /** TASK 2: make TourImpl as comparable **********/
    

    /** TASK 4: write the method  setTourWithNoDuplicates(cities) **********/
    
    
    /** TASK 5: write the method  isValid(Country country) for tour validity **********/ 
   
    
    public TourImpl() {
    }
    
    public TourImpl(Tour tour) {
        route = new ArrayList<Addressable>(tour.getRoute()); 
    }

    public List<Addressable> getRoute() {
        return route;
    }

    public void setRoute(ArrayList<Addressable> route) {
        this.route = route;
    }
    
    public void add(Addressable city){
        route.add(city);
    }
    public void addStart(Addressable city){
        route.add(0,city);
    }
    public void addDestination(Addressable city){
        route.add(route.size(),city);
    }
    
    public void remove(Addressable city){
        route.remove(city);
    }
    
    public void remove(String cityName){
        Iterator <Addressable> it = route.iterator();
        while(it.hasNext()){
            City c = (City)(it.next());
            if (c.getName().toLowerCase().compareTo(cityName.toLowerCase())==0)
                it.remove();
        }        
    }
    
    public double getLength(){
        double len = 0.0;
        for (int i=0;i<route.size()-1;i++){
            GPS gps1= (GPS)route.get(i).getLocation();
            GPS gps2= (GPS)route.get(i+1).getLocation();
            len = len +GPSDistanceCalculator.distance(gps1, gps2, "K");
        }
        return len;
    }

    @Override
    public String toString() {
        String tourString = "";
        for (Addressable city:route){
            tourString=tourString+((City)(city)).getName()+" -> ";
        }
        return tourString;
    }

    @Override
    public List<Addressable> getPath() {
        return getRoute();
    }

    @Override
    public Coordinate getStartLocation() {
        return getRoute().get(0).getLocation();
    }

    @Override
    public Coordinate getDestinationLocation() {
        return getRoute().get(route.size()-1).getLocation();
    } 
    
    
    

    

    
    
    
}

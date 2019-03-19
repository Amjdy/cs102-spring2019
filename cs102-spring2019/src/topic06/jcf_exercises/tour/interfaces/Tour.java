package topic06.jcf_exercises.tour.interfaces;

import java.util.Collection;
import java.util.List;


public interface Tour extends Comparable <Tour>{
    
    public abstract List<Addressable> getPath();
    public abstract double getLength();
    
    public abstract Coordinate getStartLocation();
    public abstract Coordinate getDestinationLocation();
    
    public abstract void add(Addressable city);
    public abstract void addStart(Addressable city);
    public abstract void addDestination(Addressable city);
    public abstract void remove(Addressable city);
    public abstract void remove(String cityName);
    
    public abstract void setTourWithNoDuplicates(Collection<Addressable> cities);
    public abstract List<Addressable> getRoute();
    
    
    
}

package topic06.jcf_exercises.tour.interfaces;

import topic05.designpatterns_exercises.store.Address;



public interface City extends Addressable {
    
    public abstract String getName();   
    public abstract void setName(String name);
    public abstract void setLocation(Coordinate location);
    
    
}

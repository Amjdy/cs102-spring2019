package topic06.jcf_exercises.tour.interfaces;

public interface GenericMap <K,V>{
    
    public abstract void add(V v);
    public abstract void remove(V v);
    public abstract void delete(K k);
    
}

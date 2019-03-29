package topic06.jcf_exercises.facebook.interfaces;

public interface EdgeFactory <E,V>{
    E create(V source, V target);
}

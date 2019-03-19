package topic05.designpatterns_exercises.images.interfaces;

public interface Pixel extends Comparable <Pixel>{

    public abstract Color getColor();
    public abstract void setColor(Color color);
    
    
}
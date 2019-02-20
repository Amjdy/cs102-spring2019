package topic03.polymorphism_exercises.images.interfaces;

public interface Pixel extends Comparable<Pixel>{
    void setColor (Color color);
    Color getColor();
}
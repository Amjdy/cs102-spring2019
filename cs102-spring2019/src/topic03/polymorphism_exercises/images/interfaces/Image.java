package topic03.polymorphism_exercises.images.interfaces;

public interface Image extends Comparable<Image>{
    void setWidth(int width);
    int getWidth();
    void setHeight(int height);
    int getHeight();
    void setName(String name);
    String getName();
    Pixel[][] getImg();
    void randomize();
    
}
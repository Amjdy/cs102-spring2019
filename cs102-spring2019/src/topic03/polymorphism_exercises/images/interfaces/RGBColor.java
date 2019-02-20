package topic03.polymorphism_exercises.images.interfaces;

public interface RGBColor extends Color{
    void setRed(byte color);
    byte getRed();
    void setBlue(byte color);
    byte getBlue();
    void setGreen(byte color);
    byte getGreen();
}
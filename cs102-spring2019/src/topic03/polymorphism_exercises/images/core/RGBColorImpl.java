package topic03.polymorphism_exercises.images.core;
import topic03.polymorphism_exercises.images.interfaces.*;


public class RGBColorImpl implements RGBColor{
 
    public byte Red;
    public byte Green;
    public byte Blue;

    public RGBColorImpl(byte R, byte G, byte B) {
        this.Red = R;
        this.Green = G;
        this.Blue = B;
    }
    
    public byte getRed() {
        return Red;
    }

    public void setRed(byte R) {
        this.Red = R;
    }

    public byte getGreen() {
        return Green;
    }

    public void setGreen(byte G) {
        this.Green = G;
    }

    public byte getBlue() {
        return Blue;
    }

    public void setBlue(byte B) {
        this.Blue = B;
    }
    
    public String toString(){
        return String.format("(%d,%d,%d)",Red,Green,Blue);
    }

    @Override
    public int compareTo(Color o) {
        if (o instanceof RGBColor){
            RGBColor rgb = (RGBColor) o;
            return ((this.getBlue()+ this.getRed()+ this.getGreen()) - (rgb.getBlue()+
                    rgb.getRed()+ rgb.getGreen()));
            }
        else return -9999;
    }

    
}

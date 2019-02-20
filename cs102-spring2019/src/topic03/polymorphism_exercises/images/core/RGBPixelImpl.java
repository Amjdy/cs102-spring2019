package topic03.polymorphism_exercises.images.core;
import topic03.polymorphism_exercises.images.interfaces.*;

public class RGBPixelImpl implements Pixel{
    
    public RGBColor rgb;


    public RGBPixelImpl(RGBColor rgb) {
        
    }
    public RGBPixelImpl(RGBPixelImpl cp) {
        
    }
    
       
    public String toString(){
        return String.format("(%s)",rgb);
    }

    @Override
    public Color getColor() {
        return rgb;
    }

    @Override
    public void setColor(Color color) {
        if(color instanceof RGBColor){
            this.rgb = (RGBColor) color;
        }
    }

    @Override
    public int compareTo(Pixel o) {
        return (this.getColor().compareTo(o.getColor()));

    }
    
    

    
    
}

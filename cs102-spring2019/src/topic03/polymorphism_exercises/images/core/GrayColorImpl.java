package topic03.polymorphism_exercises.images.core;
import topic03.polymorphism_exercises.images.interfaces.*;

public class GrayColorImpl implements GrayColor{
    
    private byte color;
    
    public GrayColorImpl(byte color){
        super();
        setColor(color);
    }
    
    public GrayColorImpl(GrayColor gp){
        this(gp.getColor());
    }

    public byte getColor() {
        return color;
    }

    public void setColor(byte color) {
        this.color = color;
    }
    
    public String toString(){
        return String.format("%d",color);
    }

    @Override
    public int compareTo(Color o) {
        if (o instanceof GrayColor){
            
            return (this.getColor() -((GrayColor) o).getColor());
            }
        else return -9999;
    }

    
}

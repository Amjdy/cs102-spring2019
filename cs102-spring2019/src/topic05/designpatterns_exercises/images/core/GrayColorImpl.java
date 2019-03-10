package topic05.designpatterns_exercises.core;

import topic05.designpatterns_exercises.interfaces.*;

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
    public int compareTo(Color color) {
        if (color instanceof GrayColor){
            GrayColor gray = (GrayColor)color;
            return (this.getColor()-gray.getColor());
        }
        return -9999;        
    }
}


package topic02.inheritance_exercises.images;


public class GrayPixel extends Pixel{
    private byte color;

    public GrayPixel(byte color) {
        setColor(color);
    }
    public GrayPixel(GrayPixel g){
        this(g.getColor());
    }
    public byte getColor() {
        return color;
    }

    public void setColor(byte color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "GrayPixel{" + "color=" + color + '}';
    }
    
    
}

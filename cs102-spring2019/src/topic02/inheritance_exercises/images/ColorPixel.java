
package topic02.inheritance_exercises.images;


public class ColorPixel {
    private byte red, green , blue;

    public ColorPixel(byte red, byte green, byte blue) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }
    public ColorPixel(ColorPixel c){
        this(c.getRed(), c.getGreen(), c.getBlue());
    }
    public byte getRed() {
        return red;
    }

    public void setRed(byte red) {
        this.red = red;
    }

    public byte getGreen() {
        return green;
    }

    public void setGreen(byte green) {
        this.green = green;
    }

    public byte getBlue() {
        return blue;
    }

    public void setBlue(byte blue) {
        this.blue = blue;
    }

    @Override
    public String toString() {
        return "ColorPixel{" + "red=" + red + ", green=" + green + ", blue=" + blue + '}';
    }
    
    
}

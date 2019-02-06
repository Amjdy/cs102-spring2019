
package topic02.inheritance_exercises.images;


public class ColorImage extends Image{
    private ColorPixel[][] img;

    public ColorImage(ColorPixel[][] img, int width, int height, String name) {
        super(width, height, name);
        setImg(img);
    }

    @Override
    public String toString() {
        return String.format("name: %s\n" +
"width: %d  \n" +
"heigh: %d", getName(), getWidth(), getHeight());
    }
    public ColorImage(ColorImage i){
        this(i.getImg(), i.getWidth(), i.getHeight(), i.getName());
    }
    public ColorPixel[][] getImg() {
        return img;
    }

    public void setImg(ColorPixel[][] img) {
        this.img = img;
    }
    
         public void randomize(){
         ColorPixel[][] pixels = new ColorPixel[getHeight()][getWidth()];
         for (int i = 0; i < getHeight(); i++) {
             for (int j = 0; j < getWidth(); j++){
                 pixels[i][j]= new ColorPixel( (byte) Math.round(Math.random()*255),
                 (byte) Math.round(Math.random()*255),
                (byte) Math.round(Math.random()*255));
                 
             }
             
         }
         
         setImg(pixels);
     }
}

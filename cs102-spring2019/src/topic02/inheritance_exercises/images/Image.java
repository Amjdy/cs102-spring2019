
package topic02.inheritance_exercises.images;


public class Image {
    private int width, height;
    private String name;

    public Image(int width, int height, String name) {
        setWidth(width);
        setHeight(height);
        setName(name);
    }
    public Image(Image i){
        this(i.getWidth(),i.getHeight(), i.getName());
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Image:   \n" +
"name: %s\n" +
"width: %d \n" +
"heigh: %d", getName(), getWidth(), getHeight());
    }
    
    
}

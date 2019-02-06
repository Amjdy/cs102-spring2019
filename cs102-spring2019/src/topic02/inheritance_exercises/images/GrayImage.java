
package topic02.inheritance_exercises.images;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class GrayImage extends Image{
    private GrayPixel[][] img;

    public GrayImage(GrayPixel[][] img, int width, int height, String name) {
        super(width, height, name);
        setImg(img);
    }
    public GrayImage(GrayImage g){
        this(g.getImg(), g.getWidth(), g.getHeight(), g.getName());
    }
    public GrayPixel[][] getImg() {
        return img;
    }

    public void setImg(GrayPixel[][] img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return String.format("name: %s\n" +
"width: %d \n" +
"heigh: %d", getName(), getWidth(), getHeight());
    }
    
    
    
    public void randomize(){
        GrayPixel[][] pixels = new GrayPixel[getHeight()][getWidth()];
        
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
            pixels[i][j]= new GrayPixel( (byte)Math.round(Math.random()*255));
            
        }
            
            setImg(pixels);
    }
    }
    
       
 public boolean imread(String filename){
     File file = new File(filename);
     Scanner sc;
        try {
            sc= new Scanner(file);
            String line1 = sc.nextLine();
            String line2 = sc.nextLine();
            String line3 = sc.nextLine();
            String[] list= line3.split(" ");
            int h = Integer.parseInt(list[0]);
            setHeight(h);
            int w = Integer.parseInt(list[1]);
            setWidth(w); 
            int i =0;
            GrayPixel[][] pixels = new GrayPixel[getHeight()][getWidth()];
            while (sc.hasNext()){
            String line = sc.nextLine();
            String[] list_pixels = line.split(" ");
                for (int j=0; j<getWidth();j++){
                    pixels[i][j] = new GrayPixel((byte) Integer.parseInt(list_pixels[j]));
                }
            i++;
            }
            setImg(pixels);
            return true;
        
            
        } catch (FileNotFoundException ex) {
            System.out.println(" File not found");
            return false;
        }
 } 
 
  
 
 public boolean imwrite(String filename){
     File file = new File(filename);
     FileWriter fw;

        try {
            fw = new FileWriter(file);
            fw.write("P2\n");
            fw.write("#Converted from MAP format\n");
            fw.write(String.format("%d %d\n", getHeight(), getWidth()));
            GrayPixel[][] pixels = getImg();
            for (int i=0;i<getHeight(); i++){
                for (int j=0;j<getWidth();j++){
                    fw.write(String.format("%d ", pixels[i][j].getColor()+128) );
                }
                fw.write("\n");
            }
            fw.close();
            return true;
        } catch (IOException ex) {
            System.out.println("Cannot write inside the file");
            return false;
        }
     
     
 }
 
}

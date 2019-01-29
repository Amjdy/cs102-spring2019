
package topic1.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Image {
    private String name;
    private int height;
    private int width;
    private int[][] img;

    public Image(String name, int height, int width, int[][] img) {
        setName(name);
        setHeight(height);
        setWidth(width);
        setImg(img);
    }

    public Image(){
        
    }
    
    public Image(Image image){
        this(image.getName(), image.getHeight(), image.getWidth(), image.getImg());
    }    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int[][] getImg() {
        return img;
    }

    public void setImg(int[][] img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return String.format("filename: %s \n" +
"width: %d \n" +
"height: %d", getName(), getHeight(), getWidth());
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
            int[][] pixels = new int[getHeight()][getWidth()];
            while (sc.hasNext()){
            String line = sc.nextLine();
            String[] list_pixels = line.split(" ");
                for (int j=0; j<getWidth();j++){
                    pixels[i][j] = Integer.parseInt(list_pixels[j]);
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
            fw.write("#Converted from MAP format");
            fw.write(String.format("%d %d\n", getHeight(), getWidth()));
            int[][] pixels = getImg();
            for (int i=0;i<getHeight(); i++){
                for (int j=0;j<getWidth();j++){
                    fw.write(String.format("%d ", pixels[i][j]) );
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

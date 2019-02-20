package topic03.polymorphism_exercises.images.core;
import topic03.polymorphism_exercises.images.interfaces.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class GrayImageImpl extends ImageImpl{

    private Pixel [][]  img ;
    
    private int maxColor = 255;
    
    public GrayImageImpl(int width, int height, String name) {
        super(width, height, name);
        img = new GrayPixelImpl[height][width];
    }
    
    public GrayImageImpl(GrayImageImpl im) {
        super(im.getWidth(),im.getHeight(),im.getName());
        img = new GrayPixelImpl[im.getHeight()][im.getWidth()];
        img = im.getImg();
    }

    public Pixel[][] getImg() {
        return img;
    }

    public void setImg(GrayPixelImpl[][] img) {
        this.img = img;
    }

    
    
   
    
    
    
    public String toString(){
        return String.format("Gray %s",super.toString());
    }

    @Override
    public void randomize() {
        GrayPixelImpl[][] pixels = new GrayPixelImpl[getHeight()][getWidth()];
    
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
            pixels[i][j] = new GrayPixelImpl(
                    new GrayColorImpl( (byte) (Math.random()* maxColor)));
            
        }
    }
        setImg(pixels);
    }
    
    
    
}




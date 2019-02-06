
package topic02.inheritance_exercises.images;

import java.util.ArrayList;
import java.util.Arrays;


public class TestClass {
    public static void main(String[] args) {
        ArrayList<GrayImage> grayImages = new ArrayList<GrayImage>(Arrays.asList(
        new GrayImage(new GrayPixel[30][25], 25, 30, "gimage01.pgm"),
        new GrayImage(new GrayPixel[60][40], 40, 60, "gimage02.pgm"),
        new GrayImage(new GrayPixel[70][50], 50, 70, "gimage03.pgm")        ));
        
        
        ArrayList<ColorImage> colorImages = new ArrayList<ColorImage>(Arrays.asList(
        new ColorImage(new ColorPixel[30][25], 25, 30, "cimage01.pgm"),
        new ColorImage(new ColorPixel[60][40], 40, 60, "cimage02.pgm"),
        new ColorImage(new ColorPixel[70][50], 50, 70, "cimage03.pgm")        ));
        
        
        
        for (int i = 0; i < colorImages.size(); i++) {
            ColorImage get = colorImages.get(i);
            get.randomize();
        }
        
        for (int i = 0; i < grayImages.size(); i++) {
            GrayImage get = grayImages.get(i);
            get.randomize();
            get.imwrite(get.getName());
        }
        
        
    }
}

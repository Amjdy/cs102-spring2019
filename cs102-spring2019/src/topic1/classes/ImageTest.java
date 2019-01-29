
package topic1.classes;

import static java.lang.Math.round;


public class ImageTest {
    public static void main(String[] args){
        Image image1 = new Image("quiz01_image01.pgm", 20, 30, new int[20][30]);
        int[][] pixels = new int[20][30];
        for (int i=0;i<20;i++){
            for (int j=0;j<30;j++){
                pixels[i][j]=  (int) round(Math.random()*255);
            }
        }
        image1.setImg(pixels);
        
        Image image2 = new Image();
        
        Image image3 = new Image(image1);
        
        image3.imwrite("quiz01_image03.pgm");
        image3.setName("quiz01_image02.pgm");
        image3.setHeight(10);
        image3.setWidth(20);
        
    }
}

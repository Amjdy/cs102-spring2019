
package topic00.review;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileReview {
    public static void main(String []args){
        
        
     String s = "CS102 course";
     
     //create a file object
     File f = new File("course.txt");
     
        try {
            //create a file writer
            FileWriter fw = new FileWriter(f);
            
            fw.write(s);
            
            fw.close();
            
        } catch (IOException ex) {
            System.out.println("Error to write the file");
        }
     
     
        File f2 = new File("course.txt");
        
        
        try {
            Scanner sc = new Scanner(f2);
            
            while(sc.hasNext()){
                
                String line = sc.next();
                System.out.println(line);
                
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("file does not exist");
        }
        
        
        
        
    }
    
}

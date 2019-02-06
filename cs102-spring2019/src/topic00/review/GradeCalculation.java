/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic00.review;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class GradeCalculation {
    
    public static double max (ArrayList<Double> list){
        double max =-1;
        for (int i=0; i<list.size(); i++){
            if (max<list.get(i))
                max = list.get(i);
        }
        return max;
    }
    
    public static double min (ArrayList<Double> list){
        double min =101;
        for (int i=0; i<list.size(); i++){
            if (min>list.get(i))
                min = list.get(i);
        }
        return min;
    }
    
    public static double average (ArrayList<Double> list){
        double sum =0;
        for (int i=0; i<list.size(); i++){
        sum += list.get(i);
        }
        return sum/list.size();
    }
    
    
    public static ArrayList<Double> remove_duplicate (ArrayList<Double> list){
        ArrayList<Double> no_duplicate = new ArrayList<Double>();
        for (int i=0; i<list.size(); i++){
            if (!no_duplicate.contains(list.get(i)))
                no_duplicate.add(list.get(i));
        } 
        return no_duplicate;
    }
    public static void main(String []args){
    Scanner sc;
    File file = new File("grades.txt");
    ArrayList<Double> grades = new ArrayList<Double>();
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                double grade = sc.nextDouble();
                grades.add(grade);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found" + ex);
        }
    System.out.println("The full list of grades" + grades); 
    System.out.println("The Maximum of list of grades: " + max(grades)); 
    System.out.println("The Minimum of list of grades: " + min(grades)); 
    System.out.println("The Average of list of grades: " + average(grades));
    System.out.println("The list without duplicates" + remove_duplicate(grades)); 
    System.out.println("The maximum using Collections" + Collections.max(grades)); 
}
}

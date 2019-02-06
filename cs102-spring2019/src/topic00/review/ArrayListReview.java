package topic00.review;

import java.util.ArrayList;
import java.util.HashSet;


public class ArrayListReview {
    
    
    public static void main(String []args){
        
                
        //dynamic arrays
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<String> strList = new ArrayList<String>();
        
        
        System.out.println("intList size = "+ intList.size());
        System.out.println("strList size = "+ strList.size());
        
        
        intList.add(7);
        System.out.println("intList size (after add) = "+ intList.size());
        intList.add(19);
        System.out.println("intList size (after add) = "+ intList.size());
        intList.add(1);
        intList.add(1);
        intList.add(1);
        
        System.out.println("intList: "+ intList);
        
        for (int i = 0;i<intList.size();i++){
            System.out.println(intList.get(i));
        }
        
       for (int i = 0;i<7;i++){
            intList.add((int)(Math.random()*10));
        }
       System.out.println("intList size (after add) = "+ intList.size());
       System.out.println("intList: "+ intList);
       
       
       strList.add("JAN");
       strList.add("FEB");
       strList.add("MAR");
       strList.add("APR");
       strList.add("MAY");
       strList.add("MAR");
       strList.add("FEB");
       strList.add("APR");
       
       System.out.println("strList size (after add) = "+ strList.size());
       System.out.println("strList: "+ strList);
       
       
       strList.remove("FEB");
       
       System.out.println("strList size (after remove) = "+ strList.size());
       System.out.println("strList: "+ strList);
       
       strList.remove(3);
       System.out.println("strList size (after remove 3) = "+ strList.size());
       System.out.println("strList: "+ strList);
        
       
       intList.remove((Integer)1);
       System.out.println("intList size (after remove 1) = "+ intList.size());
       System.out.println("intList: "+ intList);
       
       System.out.println("strList.contain(DEC): "+ strList.contains("DEC"));
       System.out.println("strList.contain(JAN): "+ strList.contains("JAN"));
    
       System.out.println("strList.indexOf(DEC)"+ strList.indexOf("DEC"));
        
       HashSet<Integer> intSet = new HashSet<Integer>(); 
        System.out.println("intSet size: "+ intSet.size());
        
        intSet.add(4);
        intSet.add(6);
        intSet.add(2);
        intSet.add(4);
        intSet.add(5);
        intSet.add(4);
        
        System.out.println("intSet: "+ intSet);
    
         System.out.println("intList: "+ intList);
         intSet = new HashSet<Integer>(intList); 
         System.out.println("intList after conversion to Set: "+ intSet);
        
    }
    
    
}

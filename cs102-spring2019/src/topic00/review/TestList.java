/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic00.review;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    
    public static void main(String []args){
        
        
        List<Integer> intList = new ArrayList<Integer>();
        
        
        intList.add(3);
        intList.add(6);
        intList.add(8);
        intList.add(1);
        intList.add(2);
        intList.add(9);
        intList.add(6);
        intList.add(5);
        intList.add(4);
        intList.add(2);
        
        
        System.out.println(intList);
        
        for (int i=0;i<intList.size();i++){
            if (intList.get(i)==3)
                intList.remove(i);
        }
        
        System.out.println(intList);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic06.jcf;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class MapTest {
    
    public static void main(String []args){
        
        Map<String, Double> studentGradesMap = new HashMap<String, Double>();
        
        studentGradesMap.put("ST123", 3.26);
        studentGradesMap.put("ST124", 2.24);
        studentGradesMap.put("ST125", 3.27);
        studentGradesMap.put("ST126", 3.12);
        
        System.out.println(studentGradesMap);
        
        System.out.println(studentGradesMap.size());
        
        
        studentGradesMap.remove("ST124");
        
        System.out.println(studentGradesMap);
        
        System.out.println(studentGradesMap.get("ST125"));
        
        //iteration?
        Set<String> keySet = studentGradesMap.keySet();
        
        for (String s : keySet){
            System.out.println(s+" "+ studentGradesMap.get(s));
        }
        System.out.println("---------------------------");
        //using an iterator
        keySet = studentGradesMap.keySet();
        
        Iterator<String> it = keySet.iterator();
        
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s + " " + studentGradesMap.get(s));
        }
        
        
        
    }
    
}

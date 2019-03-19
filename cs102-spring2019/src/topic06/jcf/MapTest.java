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
        
        studentGradesMap.put("ST123", 3.67);
        studentGradesMap.put("ST124", 3.43);
        studentGradesMap.put("ST125", 3.14);
        studentGradesMap.put("ST126", 3.76);
        
        
        System.out.println(studentGradesMap.size());
        
        System.out.println(studentGradesMap);
        
        studentGradesMap.remove("ST124");
        
        System.out.println(studentGradesMap);
        
        
        System.out.println(studentGradesMap.get("ST123"));
        
        //iteration
        
        Set<String> keySet = studentGradesMap.keySet();
        
        for (String s : studentGradesMap.keySet()){
            System.out.printf("%s %.2f\n", s, studentGradesMap.get(s));
        }
        
        System.out.println("------------------------------");
        //iterator 
        Iterator<String> it = studentGradesMap.keySet().iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.printf("%s %.2f\n", s, studentGradesMap.get(s));
        }
    
    }
}

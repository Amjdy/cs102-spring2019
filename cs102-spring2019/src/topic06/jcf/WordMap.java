package topic06.jcf;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class WordMap {
    
    public static void main(String []args){
        
        Map<String, Integer> wordCountMap = new TreeMap<String, Integer>();
        
        String s = "CS102 is a great course I Like the course of CS102";
        String [] words = s.split(" ");
        
        for (int i=0;i<words.length;i++){
            String key = words[i];
            //if the word is NOT in the  map
            if (!wordCountMap.containsKey(key))
            //add the word and count = 1
                wordCountMap.put(key, 1);
            //if the word is in the map
            else{
            //get the value of the current count
            int count = wordCountMap.get(key);
            //increment the count 
            count = count + 1;
            //add the word and its new count to the map
            wordCountMap.put(key, count);
            
            }
        }
        
        Set<String> keys = wordCountMap.keySet();
        
        for (String k : keys){
            System.out.printf("%s => %d \n", k, wordCountMap.get(k));
        }
        
        System.out.println(wordCountMap);
        
    }
    
}

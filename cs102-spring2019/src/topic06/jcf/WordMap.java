package topic06.jcf;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class WordMap {
    
    public static void main(String []args){
        
        Map<String, Integer> wordCount = new TreeMap<String, Integer>();
        
        String s = "CS102 is a great course I Like the course of CS102";
        
        String [] words = s.split(" ");
        
        for (int i=0;i<words.length; i++){
            
            //if the word is not in map
            if (!wordCount.containsKey(words[i]))
            //add the word and the counter is 1
                wordCount.put(words[i], 1);
            
            //if the word is in the map
            else {
            
            //get the old count
            int count = wordCount.get(words[i]);
            
            //increment by one
            count = count + 1;
            
            //add it again to the map
            wordCount.put(words[i], count);
            
            }
        }
        
        Set<String> keys = wordCount.keySet();
        
        for (String k : keys){
            System.out.printf("%s => %d\n", k, wordCount.get(k));
        }
        
    }
    
}

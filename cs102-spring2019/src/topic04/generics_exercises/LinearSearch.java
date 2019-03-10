
package topic04.generics_exercises;


public class LinearSearch {
    
    
    public static <T extends Comparable<T>> int linearSearch(T[] list, T key){
        
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key)==0){
                return i;
            }   
        }
        return -1;
    }
    
   
    
    public static void main(String []args){
        
        Integer [] intArray = {4,6,2,8,9};
        
        Double [] doubleArray = {4.5,6.7,2.5,8.1,9.2};
        
        String [] strArray = {"AN","BC","PO","OK","PLO"};
        
        
        
        System.out.println(linearSearch(intArray, 2));
        System.out.println(linearSearch(intArray, 9));
        System.out.println(linearSearch(intArray, 10));
        
        System.out.println(linearSearch(doubleArray, 10.0));
        
        System.out.println(linearSearch(strArray, "PO"));
        
    }
    
}

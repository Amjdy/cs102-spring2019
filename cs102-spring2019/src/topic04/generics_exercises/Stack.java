
package topic04.generics_exercises;

import java.util.ArrayList;


public class Stack <T> implements Stackable<T>{
    
    private ArrayList<T> elements;

    public ArrayList<T> getElements() {
        return elements;
    }

    public void setElements(ArrayList<T> elements) {
        this.elements = elements;
    }

    public Stack() {
        elements = new ArrayList<T>();    
    }
    
     public void push(T e){
         elements.add(e);
     }
     
     public T pop(){
         T value = null;
         if(!elements.isEmpty()){
             value = elements.remove(elements.size()-1);
         }
         return value;
     }
     
     public void print(){
         if (elements.isEmpty()) System.out.println("[empty stack]");
         else{
            for (int i = 0; i < elements.size(); i++) {
                System.out.printf("%s\n", elements.get(elements.size()-1-i));
            }
         }
     }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }
     

}

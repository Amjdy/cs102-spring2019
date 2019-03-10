/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic05.designpatterns;

/**
 *
 * @author anis
 */
public class UniversityTest {
    
    public static void main(String []args){
        
        
        University u1 = University.getInstance();
        
        System.out.println("u1 name: "+ u1.getName());
        System.out.println("count after u1: "+ University.count);
        
        University u2 = University.getInstance();
        
        System.out.println("u2 name: "+ u2.getName());
        System.out.println("count after u2: "+ University.count);
        
        University u3 = University.getInstance();
        
        System.out.println("u3 name: "+ u3.getName());
        System.out.println("count after u3: "+ University.count);
        
        
        
        System.out.println("u1==u2: "+ (u1==u2));
        
    }
    
}

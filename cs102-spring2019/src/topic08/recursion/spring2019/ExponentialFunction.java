/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic08.recursion.spring2019;

/**
 *
 * @author akoubaa
 */
public class ExponentialFunction {
 
    
    
    
    /*
    
    f(x,0)=1 => base case
    f(x,1)=1+x/1! = 1 + x = f(x,0) + x
    f(x,2)=(1+x/1!)+x^2/2!=f(x,1)+x^2/2!
    f(x,3)=(1+x/1!)+x^2/2!+x^3/3!=f(x,2)+x^3/3!
    f(x,4)=(1+x/1!)+x^2/2!+x^3/3!+x^4/4!=f(x,3)+x^4/4!
    f(x,n)= f(x,n-1)+x^n/n!
    
    
    
    
    */
    
    public static int factorial(int n){
        //base case
        if (n==0) return 1;
        //if (n == 1) return 1;
        
        return n * factorial(n-1);
    }
    
    
    public static double exp(double x, int n){
        
       if (n==0) return 1;
      
       return exp(x,n-1)+Math.pow(x, n)/factorial(n);

    }
    
    
    public static void main(String []args){
        
        
        double x=1.2;
        
        
        System.out.println("real value: "+ Math.exp(x));
        System.out.println("estimated value: "+ exp(x,10));
        System.out.println("error: "+Math.abs((Math.exp(x)-exp(x,10))));
    }
    
    
    
    
}

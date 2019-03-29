package topic08.recursion.section2;


public class Factorial {
    
    //iteratire version: using a for loop
    public static int factorial_iterative (int n){
        
        int f = 1;
        
        for (int i=1;i<=n;i++){
            f=f*i;
        }
        
        return f;
        
    }
    
    
    
    //recursive version
    //f(0)=1 => base case
    //f(1)=1   
    //f(2)=1*2=f(1)*2
    //f(3)=1*2*3=f(2)*3
    //f(4)=1*2*3*4=f(3)*4
    //f(5)1*2*3*4*5=f(4)*5
    //f(n)=1*2*3*4*5*....*(n-1)*n=f(n-1)*n  ==> general case
    public static int factorial (int n){
        
        if (n==0) return 1;//base case
        
        return factorial(n-1)*n; //general case
        
    }
    
    
    
    public static void main(String []args){
        
        System.out.println("factorial_iterative (5)="+factorial_iterative (5));
        System.out.println("factorial_iterative (7)="+factorial_iterative (7));
        
        
        
        System.out.println("factorial (5)="+factorial (5));
        System.out.println("factorial (7)="+factorial (7));
        
        
    }
    
    
}

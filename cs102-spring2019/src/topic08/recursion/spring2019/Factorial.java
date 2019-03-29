package topic08.recursion.spring2019;


public class Factorial {
    
    
    //solving using iterative approach (not recursion)
    public static int factorial_iterative (int n){
        
        int f = 1;
        
        for (int i=2;i<=n;i++){
            f= f*i;
        }
        
        return f;
    }
    
    //using recursion
    // f(0)=1
    // f(1)=1  => based base
    // f(2)= 1 * 2 = f(1) * 2
    // f(3)= 1 * 2 * 3 = f(2) * 3
    // f(4)= 1 * 2 *3 * 4 = f(3) * 4
    // f(n)= 1 * 2 *3 * 4 * ... * (n-1) * n = f(n-1) * n //general case
    public static int factorial(int n){
        //base case
        if (n==0) return 1;
        //if (n == 1) return 1;
        
        return n * factorial(n-1);
    }
    
    
    
    public static void main(String []args){
        
        System.out.println("f(5)="+factorial_iterative(5));
        System.out.println("f(7)="+factorial_iterative(7));
        
        
        System.out.println("f(5)="+factorial(5));
        System.out.println("f(7)="+factorial(7));
        
    }
    
    
}

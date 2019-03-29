package topic08.recursion.section2;


public class ExponentialFunction {
    
    
    public static int factorial (int n){
        
        if (n==0) return 1;//base case
        
        return factorial(n-1)*n; //general case
        
    }
    
    /*
    f(x,0)=1 ==> base case
    f(x,1)=1+x^1/1!=1+x=f(x,0)+x
    f(x,2)=1+x^1/1!+x^2/2!=f(x,1)+x^2/2!
    f(x,3)=1+x^1/1!+x^2/2!+x^3/3!=f(x,2)+x^3/3!
    f(x,4)=1+x^1/1!+x^2/2!+x^3/3!+x^4/4!=f(x,3)+x^4/4!
    f(x,n)=f(x,n-1)+x^n/n!  ==> general case
    
    */
    
    public static double exp(double x, int n){
        
        if (n==0) return 1;
        return exp(x,n-1)+Math.pow(x, n)/factorial(n);
        
        
    }
    
    
    public static void main(String []args){
        
        
        double x = 1.2;
        int n=10;
        
        System.out.println("real value: "+ Math.exp(1.2));
        
        System.out.println("estimated value: "+ exp(1.2,n));
        
        System.out.println("error: "+Math.abs(Math.exp(1.2)-exp(1.2,n)));
        
        
    }
    
    
}

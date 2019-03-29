package topic08.recursion.section2;



public class FibonacciFunction {
    
    //iterative version 
    public static long fibonacci (long number){
        
        //base case
        if (number == 0 ) return 0;//f0
        if (number == 1 ) return 1;//f1
        
        long fn=0;
        long fn2=0; //f0
        long fn1=1; //f1
        
        
        for (int i=2;i<=number;i++){
            System.out.printf("f(%d)=f(%d)+f(%d)=%d\n",i,(i-1),(i-2),(fn1+fn2));
            fn = fn1+fn2;
            fn2=fn1;
            fn1=fn;        
            
        }
        
        return fn;
    }
    
    //recrusive function
    /*
    
    f(0)=0  ==> base case
    f(1)=1  ==> base case
    f(2)=1+0=f(1)+f(0)=1
    f(3)=f(2)+f(1)=1+1=2
    f(4)=f(3)+f(2)=2+1=3
    f(5)=f(4)+f(3)=3+2=5 ...
    f(n)=f(n-1)+f(n-2)   ==> general case
    
    */
    
    public static long rfib(long n){
        
        if (n==0) return 0;
        if (n==1) return 1;
        
        return rfib(n-1)+rfib(n-2);
        
    }
    
    
    public static void main(String []args){
        
        System.out.println(fibonacci(10));
        
        System.out.println(rfib(10));
        
    }
    
}
